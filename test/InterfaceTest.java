import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by steven on 31/05/2017.
 */
public class InterfaceTest {
  Interface Shape;
  Class Circle;
  Class Rectangle;
  Class Square;

  @Before
  public void setUp() throws Exception {
    Method area = new Method(new MethodSignature("area", "double"), "");
    MethodSignature ms = new MethodSignature("compareTo", "int");
    ms.addArguments(new Field("Shape", "s"));
    Method compareTo = new Method(ms, "");

    this.Shape = new Interface();
    this.Shape.addMethod(area);
    this.Shape.addMethod(compareTo);

    List<Interface> interfacesList = new ArrayList<>();
    interfacesList.add(this.Shape);

    this.Circle = new Class(null, interfacesList);
    this.Rectangle = new Class(null, interfacesList);
    this.Square = new Class(null, interfacesList);

    area = new Method(new MethodSignature("area", "double"), "");
    ms = new MethodSignature("compareTo", "int");
    ms.addArguments(new Field("Shape", "shape"));
    compareTo = new Method(ms, "");
    this.Circle.addMethod(area);
    this.Circle.addMethod(compareTo);

    area = new Method(new MethodSignature("area", "double"), "");
    ms = new MethodSignature("compareTo", "int");
    ms.addArguments(new Field("Shape", "shape"));
    compareTo = new Method(ms, "");
    this.Rectangle.addMethod(compareTo);
    this.Rectangle.addMethod(area);

    ms = new MethodSignature("compareTo", "int");
    ms.addArguments(new Field("Shape", "shape"));
    compareTo = new Method(ms, "");
    this.Square.addMethod(compareTo);
  }

  @Test
  public void testClassImplementsAllInterfacesMethods() throws Exception {
    assertTrue(this.Circle.containsAllInterfacesMethods());
    assertTrue(this.Rectangle.containsAllInterfacesMethods());
    assertFalse(this.Square.containsAllInterfacesMethods());
  }

  @Test
  public void addMethod() throws Exception {
  }

  @Test
  public void getMethods() throws Exception {
  }

}