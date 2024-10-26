public class Main {
  
  public static void main(String[] args) {
    
    Address address = new Address("Dhaka");

    DeepPrototype original = new DeepPrototype("Original", address);

    DeepPrototype clone = original.manualClone();

    System.out.println("Original Address: " + original.getAddress().getCity());
    System.out.println("Clone Address: " + clone.getAddress().getCity());

    // Modify the original address
    original.getAddress().setCity("Kushtia");

    System.out.println("Original Address after modification: " + original.getAddress().getCity());
    System.out.println("Clone Address after modification: " + clone.getAddress().getCity());
  }

}
