package fi.aalto.app.server;

import com.prosysopc.ua.nodes.*;
import com.prosysopc.ua.stack.builtintypes.*;
import com.prosysopc.ua.stack.utils.NumericRange;
import com.prosysopc.ua.stack.core.TimestampsToReturn;
import com.prosysopc.ua.stack.core.AccessLevelType;
import com.prosysopc.ua.stack.core.AttributeWriteMask;
import com.prosysopc.ua.server.io.IoManagerListener;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.client.UaClient;

import java.util.HashMap;

import static fi.aalto.app.server.ServerNameTranslator.translateNode;

public class AppIoManagerListener implements IoManagerListener {
	
	private UaClient client; 
	
	public AppIoManagerListener (UaClient client) {
		this.client = client;
	}

	@Override
	public AccessLevelType onGetUserAccessLevel(
			ServiceContext serviceContext, NodeId nodeId, UaVariable node) {
		if (node.getHistorizing())
			return AccessLevelType.of(AccessLevelType.CurrentRead,
					AccessLevelType.CurrentWrite, AccessLevelType.HistoryRead);
		else
			return AccessLevelType
					.of(AccessLevelType.CurrentRead, AccessLevelType.CurrentWrite);
	}

	@Override
	public Boolean onGetUserExecutable(ServiceContext serviceContext,
			NodeId nodeId, UaMethod node) {
		return true;
	}

	@Override
	public AttributeWriteMask onGetUserWriteMask(
			ServiceContext serviceContext, NodeId nodeId, UaNode node) {
		return AttributeWriteMask.WriteMask;
	}

	@Override
	public boolean onReadNonValue(ServiceContext serviceContext, NodeId nodeId,
			UaNode node, UnsignedInteger attributeId, DataValue dataValue)
			throws StatusException {
		return false;
	}

	@Override
	public boolean onReadValue(ServiceContext serviceContext, NodeId nodeId,
			UaValueNode node, NumericRange indexRange,
			TimestampsToReturn timestampsToReturn, DateTime minTimestamp,
			DataValue dataValue) throws StatusException {

		String name = translateNode(node);

		int sourceNs = 2; // TODO get sourceNs from client?
		try {
            DataValue sourceValue = client.readValue(new NodeId(sourceNs, name));
			dataValue.setSourceTimestamp(sourceValue.getSourceTimestamp());
			dataValue.setValue(sourceValue.getValue());
			dataValue.setStatusCode(StatusCode.GOOD);
			node.setValue(dataValue);
			return true;
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		
		return false;
	}
	
	@Override
	public boolean onWriteNonValue(ServiceContext serviceContext,
			NodeId nodeId, UaNode node, UnsignedInteger attributeId,
			DataValue dataValue) throws StatusException {
		return false;
	}

	@Override
	public boolean onWriteValue(ServiceContext serviceContext, NodeId nodeId,
			UaValueNode node, NumericRange indexRange, DataValue dataValue)
			throws StatusException {

		String name = translateNode(node);

		int sourceNs = 2; // TODO get sourceNs from client?
		try {
			if (node.getBrowseName().getName().equals("Simulation state")) {
				String val = dataValue.getValue().booleanValue() ? "MANUAL" : "AUTO";
				dataValue = new DataValue(new Variant(val));
			}
		    client.writeValue(new NodeId(sourceNs, name), dataValue);
			node.setValue(dataValue);
			return true;
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		return false;
	}
	
}
