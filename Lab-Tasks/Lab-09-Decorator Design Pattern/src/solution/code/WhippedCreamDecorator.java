package solution.code;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 80.0; // Adding cost of whipped cream
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}
