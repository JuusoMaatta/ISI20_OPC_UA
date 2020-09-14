package fi.aalto.demo.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServerUserIdentity;
import com.prosysopc.ua.server.Session;
import com.prosysopc.ua.server.UserValidator;
import com.prosysopc.ua.stack.core.UserIdentityToken;
import com.prosysopc.ua.stack.core.UserTokenType;

public class DemoUserValidator implements UserValidator {

  @Override
  public boolean onValidate(Session session, ServerUserIdentity userIdentity) throws StatusException {
    //System.out.println("onValidate: userIdentity=" + userIdentity);
    if (userIdentity.getType().equals(UserTokenType.UserName)) {
      if (userIdentity.getName().equals("opcua") && userIdentity.getPassword().equals("opcua")) {
        return true;
      } else if (userIdentity.getName().equals("opcua2") && userIdentity.getPassword().equals("opcua2")) {
        return true;
      } else {
        return false;
      }
    }
    if (userIdentity.getType().equals(UserTokenType.Certificate)) {
      // Implement your strategy here, for example using the
      // PkiFileBasedCertificateValidator
      return true;
    }
    return true;
  }


  @Override
  public void onValidationError(Session session, UserIdentityToken userToken, Exception exception) {
    System.out.println("onValidationError: User validation failed: userToken=" + userToken + " error=" + exception);
  }
}
