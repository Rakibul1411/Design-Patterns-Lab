package solution.codes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director();

        SandwichBuilder sandwichBuilder1 = new SandwichBuilder();
        director1.createChickenSandwich(sandwichBuilder1);
        Sandwich chickenSandwich = sandwichBuilder1.getSandwich();
        System.out.println("Prepare Chicken Sandwich --> " + chickenSandwich);

        director1.createEggSandwich(sandwichBuilder1);
        Sandwich eggSandwich = sandwichBuilder1.getSandwich();
        System.out.println("Prepare Egg Sandwich --> " + eggSandwich);

        System.out.println("Enter your choice: (Enter 3 to EXIT");

        int choice;
        Scanner scanner = new Scanner(System.in);

        Sandwich sandwich;
        Menu menu;
        Director director2 = new Director();
        SandwichBuilder sandwichBuilder2 = new SandwichBuilder();
        MenuBuilder menuBuilder = new MenuBuilder();

        while (true) {
            choice = scanner.nextInt();

            if (choice == 1) {
                director2.createChickenSandwich(sandwichBuilder2);
                director2.createChickenSandwichMenu(menuBuilder);
                sandwich = sandwichBuilder2.getSandwich();
                menu = menuBuilder.getMenu();
                System.out.println("Ordered and Cooked! \nChicken Sandwich --> " + "Bread Type: "+ sandwich.getBreadType() + ", Filling: " + sandwich.getFilling() + ", Spread: " + sandwich.getSpread());
                System.out.println("Menu of Chicken Sandwich --> " + menu);
            }

            else if (choice == 2) {
                director2.createEggSandwich(sandwichBuilder2);
                director2.createEggSandwichMenu(menuBuilder);
                sandwich = sandwichBuilder2.getSandwich();
                menu = menuBuilder.getMenu();
                System.out.println("Ordered and Cooked! \nChicken Sandwich: " + "Bread Type: "+ sandwich.getBreadType() + ", Filling: " + sandwich.getFilling() + ", Spread: " + sandwich.getSpread());
                System.out.println("Menu of Chicken Sandwich --> " + menu);
            }

            else if (choice == 3) {
                break;
            }
        }

        scanner.close();
    }
}
