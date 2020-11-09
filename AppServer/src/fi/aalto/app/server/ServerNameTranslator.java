package fi.aalto.app.server;

import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaReference;
import com.prosysopc.ua.nodes.UaValueNode;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.FolderType;

import java.util.HashMap;

public class ServerNameTranslator {
    static HashMap<String, String> mapping = new HashMap<String, String>() {{
        put("Simulation value", "MeasMan");
        put("Actual value", "MeasVal");
        put("Simulation state", "CurModeVal");
        put("HighState", "AlrmEvtH");
    }};

    public static String translateNode(UaNode node) {
        UaNode device = findPADIMParent(node);
        return device.getBrowseName().getName() + "_" + mapping.get(node.getBrowseName().getName());
    }

    public static String inverseTranslateNode(String orig_name) {
        String[] parts = orig_name.split("_");
        String device_name = parts[0];
        String feature_name = parts[1];

        for (String key : mapping.keySet()) {
            if (mapping.get(key).equals(feature_name)) {
                return device_name + " " + key;
            }
        }
        throw new RuntimeException("No AppServer node found for " + orig_name);
    }

    private static UaNode findPADIMParent(UaNode child) {
        UaNode parent = child;
        while (!isPADIM(parent)) {
            parent = getParent(parent);
        }
        return parent;
    }

    private static boolean isPADIM(UaNode node) {
        UaReference[] refs = node.getReferences();
        for (UaReference ref : refs) {
            if (ref.getSourceNode() == node &&
                    ref.getReferenceType().getDisplayName().getText().equals("HasTypeDefinition")) {
                return ref.getTargetNode().getBrowseName().getName().equals("PADIMType");
            }
        }
        return false;
    }

    private static UaNode getParent(UaNode child) {
        UaReference[] refs = child.getReferences();
        for (UaReference ref : refs) {
            if (ref.getTargetNode() == child &&
                    ref.getReferenceType().getDisplayName().getText().equals("HasComponent")) {
                return ref.getSourceNode();
            }
        }
        return null;
    }
}
