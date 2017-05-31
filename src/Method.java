/**
 * This class represents a method. A method consists of a method signature and a method body
 */
public class Method {
  private MethodSignature signature;
  private String body;

  public Method(MethodSignature sig, String body) {
    this.signature = sig;
    this.body = body;
  }

  public MethodSignature getSignature() {
    return signature;
  }

  public String getBody() {
    return body;
  }
}
