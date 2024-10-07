import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Furniture Store!");
        System.out.println("Please select the style of furniture you would like:");
        System.out.println("1. Modern");
        System.out.println("2. Victorian");
        System.out.println("3. Rustic");
        System.out.print("Enter your choice (1, 2, or 3): ");
        
        int choice = scanner.nextInt();
        FurnitureFactory factory = null;

        if (choice == 1) {
          factory = new ModernFurnitureFactory();
        }
        else if (choice == 2) {
          factory = new VictorianFurnitureFactory();
        }
        else if (choice == 3) {
          factory = new RusticFurnitureFactory();
        }
        else {
          System.out.println("Input valid choice");
        }

        FurnitureStore client = new FurnitureStore(factory);

        System.out.println("\nYou have selected the following furniture:");
        client.useFurniture();

        scanner.close();
    }
}

