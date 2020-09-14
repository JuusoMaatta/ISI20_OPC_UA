package fi.aalto.demo.server;

import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.utils.NumericRange;
import com.prosysopc.ua.stack.core.TimestampsToReturn;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.DataValue;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.stack.core.AccessLevelType;
import com.prosysopc.ua.stack.core.AttributeWriteMask;

import com.prosysopc.ua.server.io.IoManagerListener;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaValueNode;

public class DemoIoManagerListener implements IoManagerListener {
	
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
	    //System.out.println("DemoServer/onReadValue: " + node.getDisplayName().getText() + " " + dataValue.getValue().getValue());
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

		try {
		    node.setValue(dataValue.getValue().getValue());
		    //System.out.println("DemoServer/onWriteValue: " + node.getDisplayName().getText() + " " + dataValue.getValue().getValue());
		    return true;
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		return false;
	}
	
}
