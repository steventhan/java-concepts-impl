import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steven on 31/05/2017.
 */
public class ClassTest {
  Class Object;

  @Before
  public void setUp() throws Exception {
    this.Object = new Class(null, null);
    this.Object.addMethod(new Method(new MethodSignature("toString", "String"), ""));

    MethodSignature equalsMethodSig = new MethodSignature("equals", "boolean");
    equalsMethodSig.addArguments(new Field("Object", "o"));
    Method equals = new Method(equalsMethodSig, "");
    this.Object.addMethod(equals);
  }

  @Test
  public void addVariable() throws Exception {
  }

  @Test
  public void addMethod() throws Exception {
  }

}