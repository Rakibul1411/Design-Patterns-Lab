public class ShallowPrototype {
  private String name;

  public ShallowPrototype(String name) {
    this.name = name;
  }

  public ShallowPrototype manualClone() {
    return new ShallowPrototype(this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
