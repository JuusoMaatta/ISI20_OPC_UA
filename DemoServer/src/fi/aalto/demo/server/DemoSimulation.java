package fi.aalto.demo.server;

import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaValueNode;

public class DemoSimulation implements Runnable {
	
	double x = Math.PI;
	double y = 0;
	boolean exit = false;
	UaServer server;
	
	public DemoSimulation (UaServer server) {
		super();
		this.server = server;
	}
	
	public void run() {
		/*
	    try {
		    UaValueNode node = (UaValueNode)server.getNodeManagerRoot().getNode(new NodeId(2, "P300_MeasVal"));
		    UaValueNode nodeHH = (UaValueNode)server.getNodeManagerRoot().getNode(new NodeId(2, "P300_AlrmEvtHH"));
		    UaValueNode nodeH = (UaValueNode)server.getNodeManagerRoot().getNode(new NodeId(2, "P300_AlrmEvtH"));
		    UaValueNode nodeL = (UaValueNode)server.getNodeManagerRoot().getNode(new NodeId(2, "P300_AlrmEvtL"));
		    
		    
		    while (!exit) {
		        y = 50 * Math.sin(x) + 60;
		        node.setValue(new Float(y));
			    //System.out.println(y);
		        if (y > 100) {
		        	if (!nodeHH.getValue().getValue().booleanValue()) nodeHH.setValue(true);
		        } else if (y > 80) {
		        	if (nodeHH.getValue().getValue().booleanValue()) nodeHH.setValue(false);
		        	if (!nodeH.getValue().getValue().booleanValue()) nodeH.setValue(true);
		        } else if (y < 20) {
		        	if (!nodeL.getValue().getValue().booleanValue()) nodeL.setValue(true);
		        } else {
		        	if (nodeH.getValue().getValue().booleanValue()) nodeH.setValue(false);
		        	if (nodeL.getValue().getValue().booleanValue()) nodeL.setValue(false);
		        }
		        x = x + Math.PI / 100;
		        Thread.sleep(100);
		    }
		} catch (Exception e) {
				System.out.println(e.getMessage());
		} */
	}
	
	public void stop() {
		exit = true;
	}
}