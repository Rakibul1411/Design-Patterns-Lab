package solution.code;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0; // Adding cost of sugar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
