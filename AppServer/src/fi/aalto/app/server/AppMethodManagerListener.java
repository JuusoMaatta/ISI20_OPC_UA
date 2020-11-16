package fi.aalto.app.server;

import java.util.Arrays;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.UaException;
import com.prosysopc.ua.client.UaClient;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaValueNode;
import com.prosysopc.ua.padim.server.PADIMTypeNode;
import com.prosysopc.ua.server.CallableListener;
import com.prosysopc.ua.server.MethodManager;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.stack.builtintypes.*;
import com.prosysopc.ua.stack.core.Attributes;
import com.prosysopc.ua.stack.core.StatusCodes;

import static fi.aalto.app.server.ServerNameTranslator.findPADIMParent;
import static fi.aalto.app.server.ServerNameTranslator.translateNode;

public class AppMethodManagerListener implements CallableListener {

    private final UaNode method;
    private final UaClient client;
    private final UaNode device;

    public AppMethodManagerListener(UaNode myMethod, UaClient client, UaNode device) {
        super();
        this.method = myMethod;
        this.client = client;
        this.device = device;
    }

    @Override
    public boolean onCall(ServiceContext serviceContext, NodeId objectId, UaNode object, NodeId methodId,
                          UaMethod method, final Variant[] inputArguments, final StatusCode[] inputArgumentResults,
                          final DiagnosticInfo[] inputArgumentDiagnosticInfos, final Variant[] outputs)
            throws StatusException {
        if (methodId.equals(method.getNodeId())) {
            String method_name = method.getBrowseName().getName();
            switch (method_name) {
                case "SetModeAuto":
                    try {
                        UaNode state = object.getAddressSpace().getNode(new NodeId(7,
                                device.getBrowseName().getName() + " Simulation state"));
                        ((UaValueNode)state).setValue(false);
                        String client_name = translateNode(state);
                        client.writeValue(new NodeId(2, client_name), new DataValue(new Variant("AUTO")));
                    } catch (UaException e) {
                        e.printStackTrace();
                    }
                    break;
                case "SetModeMan":
                    try {
                        UaNode state = object.getAddressSpace().getNode(new NodeId(7,
                                device.getBrowseName().getName() + " Simulation state"));
                        ((UaValueNode)state).setValue(true);
                        String client_name = translateNode(state);
                        client.writeValue(new NodeId(2, client_name), new DataValue(new Variant("MANUAL")));
                    } catch (UaException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Unhandled method called: " + method_name);
                    break;
            }
            return true;
        } else {
            return false;
        }
    }

    private StatusException inputError(final int index, final String message, StatusCode[] inputArgumentResults,
                                       DiagnosticInfo[] inputArgumentDiagnosticInfos) {
        inputArgumentResults[index] = StatusCode.valueOf(StatusCodes.Bad_InvalidArgument);
        final DiagnosticInfo di = new DiagnosticInfo();
        di.setAdditionalInfo(message);
        inputArgumentDiagnosticInfos[index] = di;
        return new StatusException(StatusCodes.Bad_InvalidArgument);
    }

}
