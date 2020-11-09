package fi.aalto.app.server;

import java.util.Arrays;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.server.CallableListener;
import com.prosysopc.ua.server.MethodManager;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.stack.core.StatusCodes;

public class AppMethodManagerListener implements CallableListener {

    private final UaNode method;

    public AppMethodManagerListener(UaNode myMethod) {
        super();
        this.method = myMethod;
    }

    @Override
    public boolean onCall(ServiceContext serviceContext, NodeId objectId, UaNode object, NodeId methodId,
                          UaMethod method, final Variant[] inputArguments, final StatusCode[] inputArgumentResults,
                          final DiagnosticInfo[] inputArgumentDiagnosticInfos, final Variant[] outputs)
            throws StatusException {
        if (methodId.equals(method.getNodeId())) {
            // TODO: actual method implementations
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
