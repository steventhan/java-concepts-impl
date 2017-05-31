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

  public boolean equals(MethodSignature ms) {
    if (this.name.equals(ms.getName()) && this.returnType.equals(ms.getReturnType())
            && this.arguments.size() == ms.getArguments().size()) {
      for (int i = 0; i < this.arguments.size(); i++) {
        if (!this.arguments.get(i).equals(ms.getArguments().get(i))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof MethodSignature && this.equals((MethodSignature) o);
  }
}
