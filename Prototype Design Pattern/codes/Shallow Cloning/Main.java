public class Main {
  
  public static void main(String[] args) {
    
    ShallowPrototype original = new ShallowPrototype("Original");

    ShallowPrototype cloneObj = original.manualClone();

    cloneObj.setName("clone");

    System.out.println("Original Name: " + original.getName());
    System.out.println("Clone Name: " + cloneObj.getName());

  }

}
