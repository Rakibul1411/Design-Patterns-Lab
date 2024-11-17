public class Main {
  public static void main(String[] args) {
      Labrador original = new Labrador("Dog", "Yellow", "Labrador", 5, true);
      Labrador clone = original.manualClone();

      // Output breed and training status before modification
      System.out.println("Original Breed: " + original.getBreed());
      System.out.println("Clone Breed: " + clone.getBreed());

      // Modify original's breed
      original.setBreed("Canis");

      // Output breed and training status after modification
      System.out.println("Original Breed after modification: " + original.getBreed());
      System.out.println("Clone Breed after modification: " + clone.getBreed());

      System.out.println("Original Training Status: " + original.isTrained());
      System.out.println("Clone Training Status: " + clone.isTrained());

      original.setTrained(false);
      
      System.out.println("Original Training Status: " + original.isTrained());
      System.out.println("Clone Training Status: " + clone.isTrained());
  }
}