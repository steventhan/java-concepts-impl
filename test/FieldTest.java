import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steven on 31/05/2017.
 */
public class FieldTest {
  Field field;

  @Before
  public void setUp() throws Exception {
    this.field = new Field("String", "s");
  }

  @Test
  public void testInstanceOf() throws Exception {
    assertTrue(this.field instanceof Object);
  }

  @Test
  public void getType() throws Exception {
  }

  @Test
  public void getName() throws Exception {
  }

  @Test
  public void equals() throws Exception {
  }

  @Test
  public void equals1() throws Exception {
  }

}