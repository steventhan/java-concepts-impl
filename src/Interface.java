import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Java interface.
 */
public class Interface {
  List<Method> methods;

  public Interface() {
    this.methods = new ArrayList<>();
  }

  public void addMethod(Method m) {
    methods.add(m);
  }

  public List<Method> getMethods() {
    return methods;
  }
}
