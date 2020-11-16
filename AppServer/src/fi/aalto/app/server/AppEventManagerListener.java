package fi.aalto.app.server;

import java.util.List;

import com.prosysopc.ua.client.MonitoredDataItem;
import com.prosysopc.ua.client.MonitoredDataItemListener;
import com.prosysopc.ua.stack.builtintypes.*;
import com.prosysopc.ua.stack.core.UserTokenType;
import com.prosysopc.ua.stack.core.StatusCodes;
import com.prosysopc.ua.stack.core.MonitoringParameters;
import com.prosysopc.ua.stack.core.MonitoringFilter;
import com.prosysopc.ua.stack.core.AggregateFilterResult;
import com.prosysopc.ua.stack.core.ViewDescription;
import com.prosysopc.ua.stack.utils.NumericRange;
import com.prosysopc.ua.types.opcua.AlarmConditionType;
import com.prosysopc.ua.types.opcua.NonExclusiveLimitAlarmType;
import com.prosysopc.ua.types.opcua.server.*;
import com.prosysopc.ua.stack.core.MonitoringMode;
import com.prosysopc.ua.stack.core.Attributes;
import com.prosysopc.ua.stack.core.EventFilter;
import com.prosysopc.ua.stack.core.EventFilterResult;
import com.prosysopc.ua.server.NodeManagerListener;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaReferenceType;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.client.MonitoredEventItemListener;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.server.Subscription;
import com.prosysopc.ua.server.EventManager;
import com.prosysopc.ua.server.EventManagerListener;
import com.prosysopc.ua.server.MonitoredEventItem;
import com.prosysopc.ua.nodes.UaReference;
import com.prosysopc.ua.server.UaServer;

import fi.aalto.app.client.AppMonitoredDataItemListener;

import static fi.aalto.app.server.ServerNameTranslator.findPADIMParent;
import static fi.aalto.app.server.ServerNameTranslator.translateNode;

public class AppEventManagerListener implements EventManagerListener {

	private UaClient client;
	private UaServer server;
	private int eventId = 0;

	public AppEventManagerListener (UaClient client, UaServer server) {
		this.client = client;
		this.server = server;
	}

	@Override
	public boolean onAcknowledge(ServiceContext serviceContext, AcknowledgeableConditionTypeNode condition, ByteString eventId,
								 LocalizedText comment) throws StatusException {
		// Handle acknowledge request to a condition event
		println("Acknowledge: Condition=" + condition + "; EventId=" + eventId + "; Comment=" + comment);
		// If the acknowledged event is no longer active, return an error
		if (!eventId.equals(condition.getEventId())) {
			throw new StatusException(StatusCodes.Bad_EventIdUnknown);
		}
		if (condition.isAcked()) {
			throw new StatusException(StatusCodes.Bad_ConditionBranchAlreadyAcked);
		}
		final DateTime now = DateTime.currentTime();
		condition.setAcked(true, now);
		final ByteString userEventId = getNextUserEventId();
		// addComment triggers a new event
		condition.addComment(eventId, comment, now, userEventId);
		return true; // Handled here
		// NOTE: If you do not handle acknowledge here, and return false,
		// the EventManager (or MethodManager) will call
		// condition.acknowledge, which performs the same actions as this
		// handler, except for setting Retain
	}

	@Override
	public boolean onAddComment(ServiceContext serviceContext, ConditionTypeNode condition, ByteString eventId, LocalizedText comment)
			throws StatusException {
		// Handle add command request to a condition event
		println("AddComment: Condition=" + condition + "; Event=" + eventId + "; Comment=" + comment);
		// Only the current eventId can get comments
		if (!eventId.equals(condition.getEventId())) {
			throw new StatusException(StatusCodes.Bad_EventIdUnknown);
		}
		// triggers a new event
		final ByteString userEventId = getNextUserEventId();
		condition.addComment(eventId, comment, DateTime.currentTime(), userEventId);
		return true; // Handled here
		// NOTE: If you do not handle addComment here, and return false,
		// the EventManager (or MethodManager) will call
		// condition.addComment automatically
	}

	private void setAlarmStatus(NonExclusiveLimitAlarmTypeNode alarm) {
		DateTime now = DateTime.currentTime();
		ByteString evId = getNextUserEventId();
		boolean active = alarm.getHighHighStateNode().getIdNode().getValue().getValue().booleanValue() ||
				alarm.getHighStateNode().getIdNode().getValue().getValue().booleanValue() ||
				alarm.getLowStateNode().getIdNode().getValue().getValue().booleanValue() ||
				alarm.getLowLowStateNode().getIdNode().getValue().getValue().booleanValue();
		alarm.setActive(active);
		alarm.triggerEvent(now, now, evId);
	}

	private void setAlarmStatus(AlarmConditionTypeNode alarm) {
		// toinen toteutus
	}

	private void createMonitoredLimitAlarm(int sourceNs, String padim_name, MonitoredEventItem item, com.prosysopc.ua.client.Subscription clientSubscription) {
		try {
		com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableH =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtH"), Attributes.Value, MonitoringMode.Reporting);
		clientMonitoredAlarmVariableH.setDataChangeListener(new MonitoredDataItemListener() {
			@Override
			public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
				NonExclusiveLimitAlarmTypeNode alarm = ((NonExclusiveLimitAlarmTypeNode)item.getNode());
				alarm.setHighState(newValue.getValue().booleanValue());
				if (newValue.getValue().booleanValue() != oldValue.getValue().booleanValue()) {
					setAlarmStatus(alarm);
				}
			}
		});
		clientSubscription.addItem(clientMonitoredAlarmVariableH);

		com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableHH =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtHH"), Attributes.Value, MonitoringMode.Reporting);
		clientMonitoredAlarmVariableHH.setDataChangeListener(new MonitoredDataItemListener() {
			@Override
			public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
				NonExclusiveLimitAlarmTypeNode alarm = ((NonExclusiveLimitAlarmTypeNode)item.getNode());
				alarm.setHighHighState(newValue.getValue().booleanValue());
				if (newValue.getValue().booleanValue() != oldValue.getValue().booleanValue()) {
					setAlarmStatus(alarm);
				}
			}
		});
		clientSubscription.addItem(clientMonitoredAlarmVariableHH);

		com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableL =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtL"), Attributes.Value, MonitoringMode.Reporting);
		clientMonitoredAlarmVariableL.setDataChangeListener(new AppMonitoredDataItemListener(this.server));
		clientMonitoredAlarmVariableL.setDataChangeListener(new MonitoredDataItemListener() {
			@Override
			public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
				NonExclusiveLimitAlarmTypeNode alarm = ((NonExclusiveLimitAlarmTypeNode)item.getNode());
				alarm.setLowState(newValue.getValue().booleanValue());
				if (newValue.getValue().booleanValue() != oldValue.getValue().booleanValue()) {
					setAlarmStatus(alarm);
				}
			}
		});
		clientSubscription.addItem(clientMonitoredAlarmVariableL);

		com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableLL =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtLL"), Attributes.Value, MonitoringMode.Reporting);
		clientMonitoredAlarmVariableLL.setDataChangeListener(new AppMonitoredDataItemListener(this.server));
		clientMonitoredAlarmVariableLL.setDataChangeListener(new MonitoredDataItemListener() {
			@Override
			public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
				NonExclusiveLimitAlarmTypeNode alarm = ((NonExclusiveLimitAlarmTypeNode)item.getNode());
				alarm.setLowLowState(newValue.getValue().booleanValue());
				if (newValue.getValue().booleanValue() != oldValue.getValue().booleanValue()) {
					setAlarmStatus(alarm);
				}
			}
		});
		clientSubscription.addItem(clientMonitoredAlarmVariableLL);

		com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableMsg =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtMsg"), Attributes.Value, MonitoringMode.Reporting);
		clientMonitoredAlarmVariableMsg.setDataChangeListener(new MonitoredDataItemListener() {
			@Override
			public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
				NonExclusiveLimitAlarmTypeNode alarm = ((NonExclusiveLimitAlarmTypeNode)item.getNode());
				alarm.setMessage(new LocalizedText(newValue.getValue().toString()));
			}
		});
		clientSubscription.addItem(clientMonitoredAlarmVariableMsg);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void createMonitoredAlarmCondition(int sourceNs, String padim_name, MonitoredEventItem item, com.prosysopc.ua.client.Subscription clientSubscription) {
		try {
			String name = item.getNode().getBrowseName().getName();
			
			com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableActive;
			if(name.equals("Interrupt")){
				clientMonitoredAlarmVariableActive =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_IntActive"), Attributes.Value, MonitoringMode.Reporting);
			} else {
				clientMonitoredAlarmVariableActive =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtOn"), Attributes.Value, MonitoringMode.Reporting);
			}
			clientMonitoredAlarmVariableActive.setDataChangeListener(new MonitoredDataItemListener() {
				@Override
				public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
					AlarmConditionTypeNode alarm = ((AlarmConditionTypeNode)item.getNode());
					alarm.setActive(newValue.getValue().booleanValue());
					if (newValue.getValue().booleanValue() != oldValue.getValue().booleanValue()) {
						setAlarmStatus(alarm);
					}
				}
			});
			clientSubscription.addItem(clientMonitoredAlarmVariableActive);
			
			com.prosysopc.ua.client.MonitoredDataItem clientMonitoredAlarmVariableMsg;
			if(name.equals("Interrupt")){
				clientMonitoredAlarmVariableMsg =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_IntMsg"), Attributes.Value, MonitoringMode.Reporting);
			} else {
				clientMonitoredAlarmVariableMsg =
				new com.prosysopc.ua.client.MonitoredDataItem(new NodeId(sourceNs, padim_name + "_AlrmEvtMsq"), Attributes.Value, MonitoringMode.Reporting);
			}
			clientMonitoredAlarmVariableMsg.setDataChangeListener(new MonitoredDataItemListener() {
				@Override
				public void onDataChange(MonitoredDataItem monitoredDataItem, DataValue oldValue, DataValue newValue) {
					AlarmConditionTypeNode alarm = ((AlarmConditionTypeNode)item.getNode());
					alarm.setMessage(new LocalizedText(newValue.getValue().toString()));
				}
			});
			clientSubscription.addItem(clientMonitoredAlarmVariableMsg);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void onAfterCreateMonitoredEventItem(ServiceContext serviceContext, Subscription subscription, MonitoredEventItem item) {

		try {
			int sourceNs = 2; // TODO get this from somewhere?
			com.prosysopc.ua.client.Subscription clientSubscription = client.getSubscriptions()[0];
			String padim_name = findPADIMParent(item.getNode()).getBrowseName().getName(); //TODO Find general parent
			switch(padim_name) {
				case("P300"):
				createMonitoredLimitAlarm(sourceNs, padim_name, item, clientSubscription);
				break;
				case("T300"):
				createMonitoredLimitAlarm(sourceNs, padim_name, item, clientSubscription);
				break;
				case("L300"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
				case("L301"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
				case("Y301"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
				case("Y303"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
				case("Y501"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
				case("M200"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
				case("PIC300"):
				createMonitoredAlarmCondition(sourceNs, padim_name, item, clientSubscription);
				break;
			}


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void onAfterDeleteMonitoredEventItem(ServiceContext arg0, Subscription arg1, MonitoredEventItem arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAfterModifyMonitoredEventItem(ServiceContext arg0, Subscription arg1, MonitoredEventItem arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onConditionRefresh(ServiceContext arg0, Subscription arg1) throws StatusException {
		// TODO Auto-generated method stub

	}

	@Override
	public void onConditionRefresh2(ServiceContext arg0, MonitoredEventItem arg1) throws StatusException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onConfirm(ServiceContext serviceContext, AcknowledgeableConditionTypeNode condition, ByteString eventId,
							 LocalizedText comment) throws StatusException {
		// Handle confirm request to a condition event
		println("Confirm: Condition=" + condition + "; EventId=" + eventId + "; Comment=" + comment);
		// If the confirmed event is no longer active, return an error
		if (!eventId.equals(condition.getEventId())) {
			throw new StatusException(StatusCodes.Bad_EventIdUnknown);
		}
		if (condition.isConfirmed()) {
			throw new StatusException(StatusCodes.Bad_ConditionBranchAlreadyConfirmed);
		}
		if (!condition.isAcked()) {
			throw new StatusException("Condition can only be confirmed when it is acknowledged.",
					StatusCodes.Bad_InvalidState);
		}
		// If the condition is no longer active, set retain to false, i.e.
		// remove it from the visible alarms
		if (!(condition instanceof AlarmConditionTypeNode) || !((AlarmConditionTypeNode) condition).isActive()) {
			condition.setRetain(false);
		}
		final DateTime now = DateTime.currentTime();
		condition.setConfirmed(true, now);
		final ByteString userEventId = getNextUserEventId();
		// addComment triggers a new event
		condition.addComment(eventId, comment, now, userEventId);
		return true; // Handled here
		// NOTE: If you do not handle Confirm here, and return false,
		// the EventManager (or MethodManager) will call
		// condition.confirm, which performs the same actions as this
		// handler
	}

	@Override
	public void onCreateMonitoredEventItem(ServiceContext serviceContext, NodeId nodeId, EventFilter filter, EventFilterResult filterResult)
			throws StatusException {
		// TODO Auto-generated method stub
	}

	@Override
	public void onDeleteMonitoredEventItem(ServiceContext serviceContext, Subscription subscription, MonitoredEventItem item) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onDisable(ServiceContext serviceContext, ConditionTypeNode condition) throws StatusException {
		// Handle disable request to a condition
		println("Disable: Condition=" + condition);
		if (condition.isEnabled()) {
			DateTime now = DateTime.currentTime();
			// Setting enabled to false, also sets retain to false
			condition.setEnabled(false, now);
			// notify the clients of the change
			condition.triggerEvent(now, null, getNextUserEventId());
		}
		return true; // Handled here
		// NOTE: If you do not handle disable here, and return false,
		// the EventManager (or MethodManager) will request the
		// condition to handle the call, and it will unset the enabled
		// state, and triggers a new notification event, as here
	}

	@Override
	public boolean onEnable(ServiceContext serviceContext, ConditionTypeNode condition) throws StatusException {
		// Handle enable request to a condition
		println("Enable: Condition=" + condition);
		if (!condition.isEnabled()) {
			DateTime now = DateTime.currentTime();
			condition.setEnabled(true, now);
			// You should evaluate the condition now, set Retain to true,
			// if necessary and in that case also call triggerEvent
			// condition.setRetain(true);
			// condition.triggerEvent(now, null, getNextUserEventId());
		}
		return true; // Handled here
		// NOTE: If you do not handle enable here, and return false,
		// the EventManager (or MethodManager) will request the
		// condition to handle the call, and it will set the enabled
		// state.
		// You should however set the status of the condition yourself
		// and trigger a new event if necessary
	}

	@Override
	public void onModifyMonitoredEventItem(ServiceContext arg0, Subscription arg1, MonitoredEventItem arg2,
										   EventFilter arg3, EventFilterResult arg4) throws StatusException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onOneshotShelve(ServiceContext arg0, AlarmConditionTypeNode arg1, ShelvedStateMachineTypeNode arg2)
			throws StatusException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onTimedShelve(ServiceContext arg0, AlarmConditionTypeNode arg1, ShelvedStateMachineTypeNode arg2,
								 double arg3) throws StatusException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onUnshelve(ServiceContext arg0, AlarmConditionTypeNode arg1, ShelvedStateMachineTypeNode arg2)
			throws StatusException {
		// TODO Auto-generated method stub
		return false;
	}

	private void println(String string) {
		System.out.println(string);
	}
	ByteString getNextUserEventId() throws RuntimeException {
		return EventManager.createEventId(eventId++);
	}

}
