/**
 * This class represents a simple field. A field has a type and a name.
 */
public class Field {
  private String type;
  private String name;

  public Field(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }

  public boolean equals(Field f) {
    return this.type.equals(f.getType());
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Field && this.equals((Field) o);
  }
}
