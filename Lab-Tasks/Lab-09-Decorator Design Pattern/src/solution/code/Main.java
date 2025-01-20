package solution.code;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new PlainCoffee();
        System.out.println("Cost: $" + coffee.getCost() + ", Description: " + coffee.getDescription());

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println("Cost: $" + coffeeWithMilk.getCost() + ", Description: " + coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost() + ", Description: " + coffeeWithMilkAndSugar.getDescription());

        Coffee coffeeWithMilkSugarAndWhippedCream = new WhippedCreamDecorator(coffeeWithMilkAndSugar);
        System.out.println("Cost: $" + coffeeWithMilkSugarAndWhippedCream.getCost() + ", Description: " + coffeeWithMilkSugarAndWhippedCream.getDescription());
    }
}
