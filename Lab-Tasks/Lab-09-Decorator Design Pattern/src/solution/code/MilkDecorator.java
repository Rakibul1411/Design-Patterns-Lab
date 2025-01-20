package solution.code;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0; // Adding cost of milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
