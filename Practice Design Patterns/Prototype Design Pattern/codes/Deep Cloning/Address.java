public class Address {
  private String city;

  public Address (String city) {
    this.city = city;
  }

  public Address manualClone() {
    return new Address(this.city);
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
