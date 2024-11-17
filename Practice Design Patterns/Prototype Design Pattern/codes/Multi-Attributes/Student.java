public class Student {
  private String name;
  private Address address;

  public Student(Stirng name, Address address) {
    this.name = name;
    
    this.address = new Address(address);
  }

  public Student (Student other) {
    this.name = other.name;

    this.address = new Address(other.address);
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
      return address;
  }

  public void setAddress(Address address) {
      // Deep copy the address when setting it
      this.address = new Address(address);
  }
}
