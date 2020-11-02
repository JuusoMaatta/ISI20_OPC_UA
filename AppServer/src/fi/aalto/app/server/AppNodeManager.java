package fi.aalto.app.server;

import java.io.File;
import java.util.Locale;

import com.prosysopc.ua.nodes.*;
import com.prosysopc.ua.padim.*;
import com.prosysopc.ua.padim.server.*;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.server.nodes.*;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.core.Identifiers;
import com.prosysopc.ua.stack.core.BrowseDescription;
import com.prosysopc.ua.stack.core.BrowseDirection;
import com.prosysopc.ua.stack.core.BrowseResult;
import com.prosysopc.ua.stack.core.ReferenceDescription;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.UaInstantiationException;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;

public class AppNodeManager extends NodeManagerUaNode {

	public static final String NAMESPACE = "http://localhost/OPCUA/AppAddressSpace";

	public AppNodeManager(UaServer arg0, String arg1) {
		super(arg0, arg1);
		// Auto-generated constructor stub
	}

	public void createAddressSpace() throws StatusException, UaInstantiationException {

		int ns = getNamespaceIndex();
		final UaNode objectsFolder = getServer().getNodeManagerRoot().getObjectsFolder();

		try {
			createPADIM(ns, "P300", objectsFolder);
		} catch (Exception e) {
		    System.out.println(e.getMessage());
	    }
	}
	
	@Override
	protected void init() throws StatusException, UaNodeFactoryException {
		super.init();
		
	}

	private PADIMType createPADIM(int ns, String name, UaNode parent)
	{
		final NodeId id = new NodeId(ns, name);
		PADIMType padim = createInstance(PADIMTypeNode.class, name, id);
		parent.addComponent(padim);

		final NodeId signalset_id = new NodeId(ns, name + " SignalSet");
		SignalSetType P300_signalset = createInstance(SignalSetTypeNode.class, "SignalSet", signalset_id);
		padim.addComponent(P300_signalset);

		final NodeId measurement_id = new NodeId(ns, name + " Measurement");
		AnalogSignalType P300_measurement = createInstance(AnalogSignalTypeNode.class, "Measurement", measurement_id);
		P300_signalset.addComponent(P300_measurement);

		UaNode P300_signal = P300_measurement.getComponent(new QualifiedName(2, "AnalogSignal"));

		final NodeId simu_id = new NodeId(ns, name + " Simulation value");
		PlainProperty<Number> simu = new PlainProperty<Number>(this, simu_id, "Simulation value", Locale.ENGLISH);
		simu.setDataTypeId(Identifiers.Float);
		P300_signal.addComponent(simu);

		final NodeId actual_id = new NodeId(ns, name + " Actual value");
		PlainProperty<Number> actual = new PlainProperty<Number>(this, actual_id, "Actual value", Locale.ENGLISH);
		actual.setDataTypeId(Identifiers.Float);
		P300_signal.addComponent(actual);

		final NodeId state_id = new NodeId(ns, name + " Simulation state");
		PlainProperty<Boolean> state = new PlainProperty<Boolean>(this, state_id, "Simulation state", Locale.ENGLISH);
		state.setDataTypeId(Identifiers.Boolean);
		P300_signal.addComponent(state);

		final NodeId zeropointadjustment_id = new NodeId(ns, name + " ZeroPointAdjustment");
		PlainMethod zpa = new PlainMethod(this, zeropointadjustment_id, "ZeroPointAdjustment", Locale.ENGLISH); //createInstance(PlainMethod.class, "ZeroPointAdjustment", zeropointadjustment_id);
		P300_measurement.addComponent(zpa);

		return padim;
	}

	private UaObjectNode createFolder(int ns, String name, UaNode parent)
	{
	    final NodeId id = new NodeId(ns, name);
	    UaObjectNode node = new UaObjectNode(this, id, name, Locale.ENGLISH);
	    node.setTypeDefinitionId(Identifiers.FolderType);
		try {
		    this.addNodeAndReference(parent, node, Identifiers.Organizes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		node.setDescription(new LocalizedText(name)); 
		
		return node;
	}

	private <T> PlainVariable<T> createVariable(int ns, String name, NodeId dataTypeId, UaNode parent)
	{
		NodeId id = new NodeId(ns, name);
		PlainVariable<T> variable = new PlainVariable<T>(this, id, name, LocalizedText.NO_LOCALE);
		variable.setDataTypeId(dataTypeId);
		variable.setTypeDefinitionId(Identifiers.BaseDataVariableType);
		parent.addComponent(variable);
		variable.setDescription(new LocalizedText(name)); 

		return variable;
	}

}
