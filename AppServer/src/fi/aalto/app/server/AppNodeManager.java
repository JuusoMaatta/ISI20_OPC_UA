package fi.aalto.app.server;

import java.util.Locale;

import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.core.Identifiers;
import com.prosysopc.ua.stack.core.BrowseDescription;
import com.prosysopc.ua.stack.core.BrowseDirection;
import com.prosysopc.ua.stack.core.BrowseResult;
import com.prosysopc.ua.stack.core.ReferenceDescription;
import com.prosysopc.ua.nodes.UaVariable; 
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaNodeFactoryException;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.UaInstantiationException;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.server.nodes.PlainVariable;
import com.prosysopc.ua.server.nodes.UaObjectNode;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.client.UaClient;

public class AppNodeManager extends NodeManagerUaNode {

	public static final String NAMESPACE = "http://localhost/OPCUA/AppAddressSpace";

	public AppNodeManager(UaServer arg0, String arg1) {
		super(arg0, arg1);
		// Auto-generated constructor stub
	}

	public void createAddressSpace(UaClient client) throws StatusException, UaInstantiationException {
		
		AddressSpace sourceAddressSpace = client.getAddressSpace();

		int ns = getNamespaceIndex();
		final UaNode objectsFolder = getServer().getNodeManagerRoot().getObjectsFolder();

		UaNode parent = objectsFolder;

		// Base objects
		parent = createFolder(ns, "CoDeSys.OPC.DA", parent);
		parent = createFolder(ns, "PLC_GW3", parent);
		parent = createFolder(ns, "Application", parent);
		parent = createFolder(ns, "GVL_WP_HPP", parent);
		
		int sourceNs = 2; // TODO get sourceNs from client?
		try {
		    BrowseDescription browseDesc = new BrowseDescription();
		    browseDesc.setNodeId(new NodeId(sourceNs, "GVL_WP_HPP"));
		    browseDesc.setBrowseDirection(BrowseDirection.Forward);
		    browseDesc.setReferenceTypeId(Identifiers.HasComponent);
		    //browseDesc.setNodeClassMask(NodeClass.Variable.getMask());
	
			BrowseResult[] browseResult = sourceAddressSpace.browse(null, 0, browseDesc);
	    	ReferenceDescription[] refs = browseResult[0].getReferences();

	    	System.out.println("Number of variables: " + refs.length);
			    
		    for (ReferenceDescription ref : refs) {
		    	UaVariable var = sourceAddressSpace.getNode(ref.getNodeId(), UaVariable.class);
		        String name = var.getBrowseName().getName();
		        NodeId dataTypeId = var.getDataTypeId();
		        createVariable(ns, name, dataTypeId, parent);
		    }
		} catch (Exception e) {
		    System.out.println(e.getMessage());
	    }
	}
	
	@Override
	protected void init() throws StatusException, UaNodeFactoryException {
		super.init();
		
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
