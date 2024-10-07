package code.solutions;

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

        int choice1 = scanner.nextInt();
        FurnitureFactory factory1 = null;

        if (choice1 == 1) {
            factory1 = ModernFurnitureFactory.getInstance();
        }
        else if (choice1 == 2) {
            factory1 = VictorianFurnitureFactory.getInstance();
        }
        else if (choice1 == 3) {
            factory1 = RusticFurnitureFactory.getInstance();
        }
        else {
            System.out.println("Input valid choice");
        }

        FurnitureStore client1 = new FurnitureStore(factory1);

        System.out.println("\nYou have selected the following furniture:");
        client1.useFurniture();

        int choice2 = scanner.nextInt();
        FurnitureFactory factory2 = null;

        if (choice2 == 1) {
            factory2 = ModernFurnitureFactory.getInstance();
        }
        else if (choice2 == 2) {
            factory2 = VictorianFurnitureFactory.getInstance();
        }
        else if (choice2 == 3) {
            factory2 = RusticFurnitureFactory.getInstance();
        }
        else {
            System.out.println("Input valid choice");
        }

        FurnitureStore client2 = new FurnitureStore(factory2);

        System.out.println("\nYou have selected the following furniture:");
        client2.useFurniture();

        int choice3 = scanner.nextInt();
        FurnitureFactory factory3 = null;

        if (choice3 == 1) {
            factory3 = ModernFurnitureFactory.getInstance();
        }
        else if (choice3 == 2) {
            factory3 = VictorianFurnitureFactory.getInstance();
        }
        else if (choice3 == 3) {
            factory3 = RusticFurnitureFactory.getInstance();
        }
        else {
            System.out.println("Input valid choice");
        }

        FurnitureStore client3 = new FurnitureStore(factory3);

        System.out.println("\nYou have selected the following furniture:");
        client3.useFurniture();

        scanner.close();
    }
}
