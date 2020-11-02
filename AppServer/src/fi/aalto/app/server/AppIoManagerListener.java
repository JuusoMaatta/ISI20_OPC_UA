package fi.aalto.app.server;

import com.prosysopc.ua.nodes.*;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.utils.NumericRange;
import com.prosysopc.ua.stack.core.TimestampsToReturn;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.DataValue;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.stack.core.AccessLevelType;
import com.prosysopc.ua.stack.core.AttributeWriteMask;
import com.prosysopc.ua.server.io.IoManagerListener;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.client.UaClient;

import java.util.HashMap;

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

	private String translateNode(UaValueNode node) {
		UaNode device = findPADIMParent(node);
		HashMap<String, String> mapping = new HashMap<String, String>() {{
			put("Simulation value", "MeasMan");
			put("Actual value", "MeasVal");
			put("Simulation state", "CurModeVal");
		}};
		return device.getBrowseName().getName() + "_" + mapping.get(node.getBrowseName().getName());
	}

	private UaNode findPADIMParent(UaNode child) {
		UaNode parent = getParent(child);
		while (!isPADIM(parent)) {
			parent = getParent(parent);
		}
		return parent;
	}

	private boolean isPADIM(UaNode node) {
		UaReference[] refs = node.getReferences();
		for (UaReference ref : refs) {
			if (ref.getSourceNode() == node &&
					ref.getReferenceType().getDisplayName().getText().equals("HasTypeDefinition")) {
				return ref.getTargetNode().getBrowseName().getName().equals("PADIMType");
			}
		}
		return false;
	}

	private UaNode getParent(UaNode child) {
		UaReference[] refs = child.getReferences();
		for (UaReference ref : refs) {
			if (ref.getTargetNode() == child &&
					ref.getReferenceType().getDisplayName().getText().equals("HasComponent")) {
				return ref.getSourceNode();
			}
		}
		return null;
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
		    client.writeValue(new NodeId(sourceNs, name), dataValue);
			node.setValue(dataValue);
			return true;
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		return false;
	}
	
}
