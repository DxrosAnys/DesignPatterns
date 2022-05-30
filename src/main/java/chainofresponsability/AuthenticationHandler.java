package chainofresponsability;

public abstract class AuthenticationHandler {

  private final AuthenticationHandler next;

  public AuthenticationHandler(AuthenticationHandler next) {
    this.next = next;
  }

  void handleRequest(String requestType) {
    if(next != null) {
      next.handleRequest(requestType);
    }

  }
}
