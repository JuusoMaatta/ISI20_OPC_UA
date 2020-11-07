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
import com.prosysopc.ua.UaBrowsePath;
import com.prosysopc.ua.UaQualifiedName;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.UaInstantiationException;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.server.instantiation.TypeDefinitionBasedNodeBuilderConfiguration;
import com.prosysopc.ua.server.instantiation.TypeDefinitionBasedNodeBuilderConfiguration.Builder;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.Ids;
import com.prosysopc.ua.types.opcua.NonExclusiveLimitAlarmType;
import com.prosysopc.ua.types.opcua.TwoStateVariableType;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.opcua.server.NonExclusiveLimitAlarmTypeNode;
import com.prosysopc.ua.types.opcua.server.TwoStateVariableTypeNode;

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
		SignalSetType signalset = createInstance(SignalSetTypeNode.class, "SignalSet", signalset_id);
		padim.addComponent(signalset);

		final NodeId measurement_id = new NodeId(ns, name + " Measurement");
		AnalogSignalType measurement = createInstance(AnalogSignalTypeNode.class, "Measurement", measurement_id);
		signalset.addComponent(measurement);

		UaNode signal = measurement.getComponent(new QualifiedName(2, "AnalogSignal"));

		final NodeId simu_id = new NodeId(ns, name + " Simulation value");
		PlainProperty<Number> simu = new PlainProperty<Number>(this, simu_id, "Simulation value", Locale.ENGLISH);
		simu.setDataTypeId(Identifiers.Float);
		signal.addComponent(simu);

		final NodeId actual_id = new NodeId(ns, name + " Actual value");
		PlainProperty<Number> actual = new PlainProperty<Number>(this, actual_id, "Actual value", Locale.ENGLISH);
		actual.setDataTypeId(Identifiers.Float);
		signal.addComponent(actual);

		final NodeId state_id = new NodeId(ns, name + " Simulation state");
		PlainProperty<Boolean> state = new PlainProperty<Boolean>(this, state_id, "Simulation state", Locale.ENGLISH);
		state.setDataTypeId(Identifiers.Boolean);
		signal.addComponent(state);

		final NodeId zeropointadjustment_id = new NodeId(ns, name + " ZeroPointAdjustment");
		PlainMethod zpa = new PlainMethod(this, zeropointadjustment_id, "ZeroPointAdjustment", Locale.ENGLISH); //createInstance(PlainMethod.class, "ZeroPointAdjustment", zeropointadjustment_id);
		measurement.addComponent(zpa);

		//Creating alarm
		try {
			createAlarmNode(ns, name, actual, actual, padim, parent);
		} catch (StatusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UaInstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
		return padim;
	}

	private void createAlarmNode(int ns, String name, UaVariable source, PlainProperty<Number> measurement, UaNode parent, UaNode objFolder) throws StatusException, UaInstantiationException {
		//Creating Alarm object
				final NodeId alarmObj_id = new NodeId(ns, name + " Alarm"); 
				
				// 		String name = source.getBrowseName().getName() + "Alarm";
				// Since the HighHighLimit and others are Optional nodes,
				// we need to define them to be instantiated.
				TypeDefinitionBasedNodeBuilderConfiguration.Builder conf =
				TypeDefinitionBasedNodeBuilderConfiguration.builder();
				conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("HighHighLimit")));
				conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("HighLimit")));
				conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("LowLimit")));
				conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("LowLowLimit")));
				// The configuration must be set to be used
				// this.getNodeManagerTable().setNodeBuilderConfiguration(conf.build()); //global
				// this.setNodeBuilderConfiguration(conf.build()); //local to this NodeManager
				//createNodeBuilder(NonExclusiveLimitAlarmTypeNode.class, conf.build()); //NodeBuilder specific
				// (createInstance uses this internally)
				// for purpose of this sample program, it is set to this manager, normally this would be set
				// once after creating this NodeManager
				this.setNodeBuilderConfiguration(conf.build());
				NonExclusiveLimitAlarmTypeNode Alarm = createInstance(NonExclusiveLimitAlarmTypeNode.class, "Alarm", alarmObj_id);
				// ConditionSource is the node which has this condition
				Alarm.setSource(source);
				// Input is the node which has the measurement that generates the alarm
				Alarm.setInput(measurement);
				Alarm.setMessage(new LocalizedText("Level exceeded"));
				Alarm.setSeverity(500); // Medium level warning
				Alarm.setHighHighLimit(90.0);
				Alarm.setHighLimit(70.0);
				Alarm.setLowLimit(30.0);
				Alarm.setLowLowLimit(10.0);
				Alarm.setEnabled(true);
				parent.addComponent(Alarm); 
				// + HasCondition, the SourceNode of the reference should normally
				// correspond to the Source set above
				source.addReference(Alarm, Identifiers.HasCondition, false);
				// + EventSource, the target of the EventSource is normally the
				// source of the HasCondition reference
				parent.addReference(source, Identifiers.HasEventSource, false);
				// + HasNotifier, these are used to link the source of the EventSource
				// up in the address space hierarchy
				objFolder.addReference(parent, Identifiers.HasNotifier, false);
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
