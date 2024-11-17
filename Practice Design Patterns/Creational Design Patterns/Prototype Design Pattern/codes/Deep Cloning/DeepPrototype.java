public class DeepPrototype {
  private String name;
  private Address address;

  public DeepPrototype(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public DeepPrototype manualClone() {
    return new DeepPrototype(this.name, this.address.manualClone());
  }

  public String getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

}
