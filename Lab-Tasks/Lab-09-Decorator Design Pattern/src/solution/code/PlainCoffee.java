package solution.code;

public class PlainCoffee implements Coffee {
    @Override
    public double getCost() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
}
