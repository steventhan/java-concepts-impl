import java.util.ArrayList;
import java.util.List;

/**
 * Created by steven on 31/05/2017.
 */
public class Class {
  Class parent;
  List<Interface> interfaces;
  List<Field> variables;
  List<Method> methods;

  public Class(Class parent, List<Interface> interfaces) {
    this.parent = parent;
    this.interfaces = interfaces;
    this.variables = new ArrayList<>();
    this.methods = new ArrayList<>();
  }

  public void addVariable(Field f) {
    this.variables.add(f);
  }

  public void addMethod(Method m) {
    this.methods.add(m);
  }

  public boolean containsAllInterfacesMethods() {
    List<MethodSignature> allInterfacesSigs = new ArrayList<>();
    List<MethodSignature> thisSigs = new ArrayList<>();


    for (Interface aInterface : this.interfaces) {
      for (Method method : aInterface.getMethods()) {
        allInterfacesSigs.add(method.getSignature());
      }
    }

    for (Method method : this.methods) {
      thisSigs.add(method.getSignature());
    }

    for (MethodSignature sig : allInterfacesSigs) {
      if (!thisSigs.contains(sig)) {
        return false;
      }
    }
    return true;
  }
}
