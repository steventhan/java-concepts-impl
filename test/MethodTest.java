import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit tests for Method class.
 */
public class MethodTest {
  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testOne() {
    MethodSignature[] list1;
    MethodSignature[] list2;
    MethodSignature sig;

    list1 = new MethodSignature[3];
    list2 = new MethodSignature[3];

    //method 1
    sig = new MethodSignature("foo", "void");
    sig.addArguments(new Field("String", "var"));
    list1[0] = sig;

    sig = new MethodSignature("foo", "void");
    sig.addArguments(new Field("String", "var2"));
    list2[0] = sig;

    //method 2
    sig = new MethodSignature("toString", "String");
    list1[1] = sig;

    sig = new MethodSignature("toString", "String");
    list2[1] = sig;

    //method 3
    sig = new MethodSignature("getNumber", "int");
    list1[2] = sig;

    sig = new MethodSignature("getNumber", "int");
    list2[2] = sig;

    assertArrayEquals(list1, list2);
  }

  @Test
  public void getSignature() throws Exception {
  }

  @Test
  public void getBody() throws Exception {
  }

}