import java.util.Scanner;

public class FurnitureStoreApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Furniture Store!");

        System.out.println("Please select the style of furniture you want: ");
        System.out.println("1. Modern");
        System.out.println("2. Victorian");
        System.out.println("3. ArtDeco");

        System.out.print("Enter the number corresponding to your choice: ");
        int choice = scanner.nextInt();

        FurnitureFactory factory = null;

        // Only allowing Modern furniture creation for now
        if (choice == 1) {
            factory = new ModernFurnitureFactory();
            System.out.println("\nYou have selected Modern Furniture.");
        } else {
            System.out.println("Sorry, only Modern furniture is available at this time.");
            return;
        }

        // Create a FurnitureShop with the chosen factory
        FurnitureShop shop = new FurnitureShop(factory);
        System.out.println("\nFurnishing your shop...");
        shop.furnish();
    }
}
