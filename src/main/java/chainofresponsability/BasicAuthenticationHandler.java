package chainofresponsability;

public class BasicAuthenticationHandler extends AuthenticationHandler {

  public BasicAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("basic")) {
      System.out.println("Handling Basic Authentication");
    } else {
      super.handleRequest(requestType);
    }
  }

}
