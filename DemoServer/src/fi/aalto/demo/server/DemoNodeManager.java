package fi.aalto.demo.server;

import java.util.Locale;

import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.core.Identifiers;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.nodes.UaNodeFactoryException;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.UaInstantiationException;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.server.nodes.PlainVariable;
import com.prosysopc.ua.server.nodes.UaObjectNode;

public class DemoNodeManager extends NodeManagerUaNode {

	public static final String NAMESPACE = "http://localhost/OPCUA/DemoAddressSpace";

	public DemoNodeManager(UaServer arg0, String arg1) {
		super(arg0, arg1);
		// Auto-generated constructor stub
	}

	private void createAddressSpace() throws StatusException, UaInstantiationException {
		// Create demo address space

		int ns = getNamespaceIndex();
		final UaNode objectsFolder = getServer().getNodeManagerRoot().getObjectsFolder();

		UaNode parent = objectsFolder;

		// Base objects
		parent = createFolder(ns, "CoDeSys.OPC.DA", parent);
		parent = createFolder(ns, "PLC_GW3", parent);
		parent = createFolder(ns, "Application", parent);
		parent = createFolder(ns, "GVL_WP_HPP", parent);
				
        // L300 High level alarm
		createVariable(ns, "L300_AlrmEvtMsg", "L300: Boiler NOT FULL", Identifiers.String, parent);
		createVariable(ns, "L300_AlrmEvtOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "L300_CurModeVal", "AUTO", Identifiers.String, parent);
		createVariable(ns, "L300_MeasMan", false, Identifiers.Boolean, parent);
		createVariable(ns, "L300_MeasVal", false, Identifiers.Boolean, parent);
		createVariable(ns, "L300_SetModeAuto", true, Identifiers.Boolean, parent);
		createVariable(ns, "L300_SetModeMan", false, Identifiers.Boolean, parent);

		// L301 Low level alarm
		createVariable(ns, "L301_AlrmEvtMsg", "L301: Boiler EMPTY", Identifiers.String, parent);
		createVariable(ns, "L301_AlrmEvtOn", true, Identifiers.Boolean, parent);
		createVariable(ns, "L301_CurModeVal", "AUTO", Identifiers.String, parent);
		createVariable(ns, "L301_MeasMan", false, Identifiers.Boolean, parent);
		createVariable(ns, "L301_MeasVal", false, Identifiers.Boolean, parent);
		createVariable(ns, "L301_SetModeAuto", true, Identifiers.Boolean, parent);
		createVariable(ns, "L301_SetModeMan", false, Identifiers.Boolean, parent);

		// P300 Pressure sensor
		createVariable(ns, "P300_AlrmEvtH", false, Identifiers.Boolean, parent);
		createVariable(ns, "P300_AlrmEvtHH", false, Identifiers.Boolean, parent);
		createVariable(ns, "P300_AlrmEvtL", false, Identifiers.Boolean, parent);
		createVariable(ns, "P300_AlrmEvtLL", false, Identifiers.Boolean, parent);
		createVariable(ns, "P300_AlrmEvtMsg", "P300: (L) Boiler pressure at 0.0bar(g)", Identifiers.String, parent);
		//createVariable(ns, "P300_AlrmEvtQ", false, Identifiers.Boolean, parent);
		createVariable(ns, "P300_CurModeVal", "AUTO", Identifiers.String, parent);
		createVariable(ns, "P300_MeasMan", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "P300_MeasVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "P300_SetModeAuto", true, Identifiers.Boolean, parent);
		createVariable(ns, "P300_SetModeMan", false, Identifiers.Boolean, parent);
		//createVariable(ns, "P300_SetModeSim", false, Identifiers.Boolean, parent);
		createVariable(ns, "P300_ZeroMeas", false, Identifiers.Boolean, parent);
		
		// T300 Temperature sensor
		createVariable(ns, "T300_AlrmEvtH", false, Identifiers.Boolean, parent);
		createVariable(ns, "T300_AlrmEvtHH", false, Identifiers.Boolean, parent);
		createVariable(ns, "T300_AlrmEvtL", false, Identifiers.Boolean, parent);
		createVariable(ns, "T300_AlrmEvtLL", false, Identifiers.Boolean, parent);
		createVariable(ns, "T300_AlrmEvtMsg", "T300: (L) Boiler temperature at 3.104C", Identifiers.String, parent);
		//createVariable(ns, "P300_AlrmEvtQ", false, Identifiers.Boolean, parent);
		createVariable(ns, "T300_CurModeVal", "AUTO", Identifiers.String, parent);
		createVariable(ns, "T300_MeasMan", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "T300_MeasVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "T300_SetModeAuto", true, Identifiers.Boolean, parent);
		createVariable(ns, "T300_SetModeMan", false, Identifiers.Boolean, parent);
		//createVariable(ns, "T300_SetModeSim", false, Identifiers.Boolean, parent);
		createVariable(ns, "T300_ZeroMeas", false, Identifiers.Boolean, parent);
		
		// M200 Pump
		createVariable(ns, "M200_AlrmEvtMsq", "M200: NORMAL", Identifiers.String, parent);
		createVariable(ns, "M200_AlrmEvtOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "M200_CtrlOut", new Integer(0), Identifiers.Integer, parent);
		createVariable(ns, "M200_CurCtrlVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "M200_CurModeVal", "MANUAL", Identifiers.String, parent);
		createVariable(ns, "M200_IntActive", false, Identifiers.Boolean, parent);
		createVariable(ns, "M200_IntMsg", "M200: NORMAL", Identifiers.String, parent);
		createVariable(ns, "M200_ManCtrlVal", new Float(0), Identifiers.Float, parent);
		//createVariable(ns, "M200_SeqCtrlVal", new Float(0), Identifiers.Float, parent);		
		createVariable(ns, "M200_SetModeAuto", false, Identifiers.Boolean, parent);
		createVariable(ns, "M200_SetModeMan", true, Identifiers.Boolean, parent);
		//createVariable(ns, "M200_SetModeSeq", false, Identifiers.Boolean, parent);
		
		// Y301 and Y303 Cut-off valves
		createVariable(ns, "Y301_AlrmEvtMsq", "Y301: NORMAL", Identifiers.String, parent);
		createVariable(ns, "Y301_AlrmEvtOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y301_CtrlOut", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y301_CurOutINT", new Integer(0), Identifiers.Integer, parent);
		createVariable(ns, "Y301_CtrlVal", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y301_CurModeVal", "MANUAL", Identifiers.String, parent);
		createVariable(ns, "Y301_IntActive", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y301_IntMsg", "Y301: NORMAL", Identifiers.String, parent);
		createVariable(ns, "Y301_ManCtrlVal", false, Identifiers.Boolean, parent);
		//createVariable(ns, "Y301_SeqCtrlVal", false, Identifiers.Boolean, parent);		
		createVariable(ns, "Y301_SetModeAuto", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y301_SetModeMan", true, Identifiers.Boolean, parent);
		//createVariable(ns, "Y301_SetModeSeq", false, Identifiers.Boolean, parent);

		createVariable(ns, "Y303_AlrmEvtMsq", "Y303: NORMAL", Identifiers.String, parent);
		createVariable(ns, "Y303_AlrmEvtOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y303_CtrlOut", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y303_CurOutINT", new Integer(0), Identifiers.Integer, parent);
		createVariable(ns, "Y303_CtrlVal", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y303_CurModeVal", "MANUAL", Identifiers.String, parent);
		createVariable(ns, "Y303_IntActive", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y303_IntMsg", "Y303: NORMAL", Identifiers.String, parent);
		createVariable(ns, "Y303_ManCtrlVal", false, Identifiers.Boolean, parent);
		//createVariable(ns, "Y303_SeqCtrlVal", false, Identifiers.Boolean, parent);		
		createVariable(ns, "Y303_SetModeAuto", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y303_SetModeMan", true, Identifiers.Boolean, parent);
		//createVariable(ns, "Y303_SetModeSeq", false, Identifiers.Boolean, parent);
		
		// Y501 Control valve
		createVariable(ns, "Y501_AlrmEvtMsq", "Y501: NORMAL", Identifiers.String, parent);
		createVariable(ns, "Y501_AlrmEvtOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y501_CtrlOut", new Integer(0), Identifiers.Integer, parent);
		createVariable(ns, "Y501_CtrlVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "Y501_CurCtrlVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "Y501_CurModeVal", "MANUAL", Identifiers.String, parent);
		createVariable(ns, "Y501_IntActive", true, Identifiers.Boolean, parent);
		createVariable(ns, "Y501_IntMsg", "Y501: FORCED OFF", Identifiers.String, parent);
		createVariable(ns, "Y501_ManCtrlVal", new Float(0), Identifiers.Float, parent);
		//createVariable(ns, "Y501_SeqCtrlVal", new Float(0), Identifiers.Float, parent);		
		createVariable(ns, "Y501_SetModeAuto", false, Identifiers.Boolean, parent);
		createVariable(ns, "Y501_SetModeMan", false, Identifiers.Boolean, parent);
		//createVariable(ns, "Y501_SetModeSeq", false, Identifiers.Boolean, parent);
		
		// PIC300 Pressure PID control
		createVariable(ns, "PIC300_AlrmEvtMsq", "PIC300: NORMAL", Identifiers.String, parent);
		createVariable(ns, "PIC300_AlrmEvtOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "PIC300_CtrlOff", true, Identifiers.Boolean, parent);
		createVariable(ns, "PIC300_CtrlOn", false, Identifiers.Boolean, parent);
		createVariable(ns, "PIC300_CtrlVal", 0, Identifiers.Float, parent);
		createVariable(ns, "PIC300_CurModeVal", "MANUAL", Identifiers.String, parent);		
		createVariable(ns, "PIC300_CurSPVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "PIC300_Enable", false, Identifiers.Boolean, parent);
		createVariable(ns, "PIC300_Kp", new Float(10), Identifiers.Float, parent);
		createVariable(ns, "PIC300_Td", new Float(1), Identifiers.Float, parent);
		createVariable(ns, "PIC300_Ti", new Float(0.1), Identifiers.Float, parent);
		createVariable(ns, "PIC300_ManCtrlVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "PIC300_PIDReset", false, Identifiers.Boolean, parent);
		// SP2, SP2Active, SP3, SP3Active, SPSeq
		createVariable(ns, "PIC300_SPVal", new Float(0), Identifiers.Float, parent);
		createVariable(ns, "PIC300_SetModeAuto", false, Identifiers.Boolean, parent);
		createVariable(ns, "PIC300_SetModeMan", false, Identifiers.Boolean, parent);
		//createVariable(ns, "PIC300_SetModeSeq", false, Identifiers.Boolean, parent);

		return;
	}	

	@Override
	protected void init() throws StatusException, UaNodeFactoryException {
		super.init();

		createAddressSpace();
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

	private <T> PlainVariable<T> createVariable(int ns, String name, T value, NodeId dataTypeId, UaNode parent)
	{
		NodeId id = new NodeId(ns, name);
		PlainVariable<T> variable = new PlainVariable<T>(this, id, name, LocalizedText.NO_LOCALE);
		variable.setDataTypeId(dataTypeId);
		variable.setTypeDefinitionId(Identifiers.BaseDataVariableType);
		parent.addComponent(variable);
		variable.setCurrentValue(value);
		variable.setDescription(new LocalizedText(name)); 

		return variable;
	}
	
}
