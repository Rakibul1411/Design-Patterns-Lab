package solution.codes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuBuilder menuBuilder = new MenuBuilder();
        Director director = new Director(menuBuilder);
        director.constructChickenSandwichMenu();
        Menu menu = menuBuilder.getResult();
        System.out.println("     Menu     ");
        System.out.println("Chicken Sandwich Menu > " + "Bread Type: "+ menu.getBreadType() + ", Filling: " + menu.getFilling() + ", Spread: " + menu.getSpread());

        director.constructEggSandwichMenu();
        menu = menuBuilder.getResult();
        System.out.println("Egg Sandwich Menu > " + "Bread Type: "+ menu.getBreadType() + ", Filling: " + menu.getFilling() + ", Spread: " + menu.getSpread());

        System.out.println("Enter your choice: (Press 3 to exit)");

        int choice;
        Sandwich sandwich;
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        Director director1 = new Director(sandwichBuilder);
        Scanner scanner = new Scanner(System.in);
        do {
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    director1.constructChickenSandwich();
                    sandwich = sandwichBuilder.getResult();
                    System.out.println("Ordered and Cooked! \nChicken Sandwich > " + "Bread Type: "+ sandwich.getBreadType() + ", Filling: " + sandwich.getFilling() + ", Spread: " + sandwich.getSpread());
                    break;
                case 2:
                    director1.constructEggSandwich();
                    sandwich = sandwichBuilder.getResult();
                    System.out.println("Ordered and Cooked! \nEgg Sandwich > " + "Bread Type: "+ sandwich.getBreadType() + ", Filling: " + sandwich.getFilling() + ", Spread: " + sandwich.getSpread());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
