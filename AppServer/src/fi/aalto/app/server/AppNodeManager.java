package fi.aalto.app.server;

import java.io.File;
import java.util.Locale;

import com.prosysopc.ua.nodes.*;
import com.prosysopc.ua.padim.*;
import com.prosysopc.ua.padim.server.*;
import com.prosysopc.ua.server.*;
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
import com.prosysopc.ua.server.instantiation.NodeBuilder;
import com.prosysopc.ua.server.instantiation.TypeDefinitionBasedNodeBuilderConfiguration;
import com.prosysopc.ua.server.instantiation.TypeDefinitionBasedNodeBuilderConfiguration.Builder;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.types.di.DiIds;
import com.prosysopc.ua.types.opcua.AlarmConditionType;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.Ids;
import com.prosysopc.ua.types.opcua.NonExclusiveLimitAlarmType;
import com.prosysopc.ua.types.opcua.TwoStateVariableType;
import com.prosysopc.ua.types.opcua.server.AlarmConditionTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.opcua.server.ConditionTypeNode;
import com.prosysopc.ua.types.opcua.server.NonExclusiveLimitAlarmTypeNode;
import com.prosysopc.ua.types.opcua.server.TwoStateVariableTypeNode;
import com.prosysopc.ua.types.plc.CtrlConfigurationType;
import com.prosysopc.ua.types.plc.PlcIds;
import com.prosysopc.ua.types.plc.server.CtrlConfigurationTypeNode;

public class AppNodeManager extends NodeManagerUaNode {

	public static final String NAMESPACE = "http://localhost/OPCUA/AppAddressSpace";
	private final MethodManager methodManager;
	private final UaClient client;

	public AppNodeManager(UaServer arg0, String arg1, UaClient client) {
		super(arg0, arg1);

		this.client = client;

		TypeDefinitionBasedNodeBuilderConfiguration.Builder conf =
				TypeDefinitionBasedNodeBuilderConfiguration.builder();

		conf.addOptional(UaBrowsePath.from(PadimIds.PADIMType,
				UaQualifiedName.from("http://opcfoundation.org/UA/DI/", "MethodSet")));

		conf.addOptional(UaBrowsePath.from(PlcIds.CtrlConfigurationType,
				UaQualifiedName.from("http://PLCopen.org/OpcUa/IEC61131-3/", "MethodSet")));
		conf.addOptional(UaBrowsePath.from(PlcIds.CtrlConfigurationType,
				UaQualifiedName.from("http://opcfoundation.org/UA/DI/", "ParameterSet")));
		conf.addOptional(UaBrowsePath.from(PlcIds.CtrlConfigurationType,
				UaQualifiedName.from("http://opcfoundation.org/UA/DI/", "Configuration")));
		conf.addOptional(UaBrowsePath.from(PlcIds.CtrlConfigurationType,
				UaQualifiedName.from("http://opcfoundation.org/UA/DI/", "GlobalVars")));

		this.setNodeBuilderConfiguration(conf.build());
		methodManager = new MethodManagerUaNode(this);
	}

	public void createAddressSpace() throws StatusException, UaInstantiationException {

		int ns = getNamespaceIndex();
		final UaNode objectsFolder = getServer().getNodeManagerRoot().getObjectsFolder();

		try {
			createPADIM(ns, "P300", objectsFolder);
			createPLC(ns, "PIC300", objectsFolder);
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
		
		createMethod(ns, "ZeroPointAdjustment",
				name + measurement.getBrowseName().getName(), measurement, padim);

		UaNode methodSet = padim.getMethodSetNode();
		createMethod(ns, "SetModeAuto", name, methodSet, padim);
		createMethod(ns, "SetModeMan", name, methodSet, padim);
		
		try {
			createAlarms(ns, padim, parent);
		} catch (StatusException e) {
			e.printStackTrace();
		} catch (UaInstantiationException e) {
			e.printStackTrace();
		}
	
		return padim;
	}

	private void createPLC(int ns, String name, UaNode parent) {
		final NodeId id = new NodeId(ns, name);
		CtrlConfigurationType plc = createInstance(CtrlConfigurationTypeNode.class, name, id);
		parent.addComponent(plc);

		// Methods
		UaNode methodSet = plc.getMethodSetNode();
		PlainMethod ctrlon = createMethod(ns, "CtrlOn", name, methodSet, plc);
		PlainMethod ctrloff = createMethod(ns, "CtrlOff", name, methodSet, plc);
		PlainMethod enable = createMethod(ns, "Enable", name, methodSet, plc);
		PlainMethod reset = createMethod(ns, "PIDReset", name, methodSet, plc);
		createMethod(ns, "SetModeAuto", name, methodSet, plc);
		createMethod(ns, "SetModeMan", name, methodSet, plc);

		UaNode config = plc.getConfigurationNode();
		config.addReference(ctrlon, Identifiers.Organizes, false);
		config.addReference(ctrloff, Identifiers.Organizes, false);
		config.addReference(enable, Identifiers.Organizes, false);
		config.addReference(reset, Identifiers.Organizes, false);

		// Parameters
		UaNode paramSet = plc.getParameterSetNode();
		PlainVariable<String> curMode = createVariable(ns, "CurModeVal", Identifiers.String, paramSet);
		PlainVariable<Float> ctrlVal = createVariable(ns, "CtrlVal", Identifiers.Float, paramSet);
		PlainVariable<Float> curSPVal = createVariable(ns, "CurSPVal", Identifiers.Float, paramSet);
		PlainVariable<Float> manCtrlVal = createVariable(ns, "ManCtrlVal", Identifiers.Float, paramSet);
		PlainVariable<Float> Kp = createVariable(ns, "Kp", Identifiers.Float, paramSet);
		PlainVariable<Float> Td = createVariable(ns, "Td", Identifiers.Float, paramSet);
		PlainVariable<Float> Ti = createVariable(ns, "Ti", Identifiers.Float, paramSet);
		PlainVariable<Float> SPVal = createVariable(ns, "SPVal", Identifiers.Float, paramSet);

		UaNode globalVars = plc.getGlobalVarsNode();
		globalVars.addReference(curMode, Identifiers.Organizes, false);
		globalVars.addReference(ctrlVal, Identifiers.Organizes, false);
		globalVars.addReference(curSPVal, Identifiers.Organizes, false);
		globalVars.addReference(manCtrlVal, Identifiers.Organizes, false);

		UaNode configVars = plc.getConfigVarsNode();
		configVars.addReference(Kp, Identifiers.Organizes, false);
		configVars.addReference(Td, Identifiers.Organizes, false);
		configVars.addReference(Ti, Identifiers.Organizes, false);
		configVars.addReference(SPVal, Identifiers.Organizes, false);

		// Alarm
		try {
			createAlarms(ns, plc, parent);
		} catch (StatusException e) {
			e.printStackTrace();
		}
	}

	private void createAlarms(int ns, UaNode parent, UaNode objFolder) throws StatusException, UaInstantiationException {
		String parentName = parent.getDisplayName().toString();
		final NodeId alarmObj_id = new NodeId(ns, parentName + " Alarm");
		ConditionTypeNode Alarm = initAlarm(parentName, "Alarm", alarmObj_id);
		Alarm.setEnabled(false);
		parent.addComponent(Alarm);
		parent.addReference(Alarm, Identifiers.HasEventSource, false);
		objFolder.addReference(parent, Identifiers.HasNotifier, false);
		if (parentName.equals("M200") || parentName.equals("Y301") || parentName.equals("Y303") ||parentName.equals("Y501")) {
			final NodeId alarmObj_id2 = new NodeId(ns, parentName + " Interrupt");
			ConditionTypeNode Alarm2 = initAlarm(parentName, "Interrupt", alarmObj_id2);
			Alarm2.setEnabled(false);
			parent.addComponent(Alarm2);
			parent.addReference(Alarm2, Identifiers.HasEventSource, false);
		}
	}
	
	private ConditionTypeNode initAlarm(String type, String name, NodeId id) {
		ConditionTypeNode Alarm;
		if (type.equals("P300") || type.equals("T300")) {
			TypeDefinitionBasedNodeBuilderConfiguration.Builder conf = ConfigureLimitAlarm(type);
			NodeBuilder<NonExclusiveLimitAlarmTypeNode> nb = createNodeBuilder(NonExclusiveLimitAlarmTypeNode.class, conf.build());
			nb.setBrowseName(new QualifiedName(name));
			nb.setDisplayName(new LocalizedText(name));
			nb.setNodeId(id);
			NonExclusiveLimitAlarmTypeNode Alarm1;
			try {
				Alarm1 = nb.build();
				Alarm1.setHighHighState(false);
				Alarm1.setHighState(false);
				Alarm1.setLowState(false);
				Alarm1.setLowLowState(false);
				Alarm = Alarm1;
				return Alarm;
			} catch (NodeBuilderException e) {
				e.printStackTrace();
				return null;
			}
		}
		else if (type.equals("PIC300") || type.equals("L300") || type.equals("L301") || type.equals("M200") || type.equals("Y301") || type.equals("Y303") || type.equals("Y501")) {
			AlarmConditionTypeNode Alarm1 = createInstance(AlarmConditionTypeNode.class, name, id);
			Alarm1.setActive(false);
			Alarm = Alarm1;
			return Alarm;
		}
		return null;
	}

	private TypeDefinitionBasedNodeBuilderConfiguration.Builder ConfigureLimitAlarm(String type) {
		TypeDefinitionBasedNodeBuilderConfiguration.Builder conf =
				TypeDefinitionBasedNodeBuilderConfiguration.builder();
		conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("HighHighState")));
		conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("HighState")));
		conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("LowState")));
		conf.addOptional(UaBrowsePath.from(Ids.NonExclusiveLimitAlarmType, UaQualifiedName.standard("LowLowState")));
		return conf;
	}

	private PlainMethod createMethod(int ns, String name, String name_prefix, UaNode parent, UaNode device) {
		final NodeId id = new NodeId(ns, name_prefix + " " + name);
		PlainMethod method = new PlainMethod(this, id, name, Locale.ENGLISH);
		parent.addComponent(method);

		AppMethodManagerListener listener = new AppMethodManagerListener(method, this.client, device);
		((MethodManagerUaNode)methodManager).addCallListener(listener);

		return method;
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
