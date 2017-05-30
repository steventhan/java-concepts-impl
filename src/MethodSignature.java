import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a new method signature.
 */
public class MethodSignature {
  private String name;
  private List<Field> arguments;
  private String returnType;

  public MethodSignature(String name, String returnType) {
    this.name = name;
    this.returnType = returnType;
    this.arguments = new ArrayList<Field>();
  }

  public void addArguments(Field arg) {
    arguments.add(arg);
  }

  public String getName() {
    return name;
  }

  public List<Field> getArguments() {
    return arguments;
  }

  public String getReturnType() {
    return returnType;
  }
}
