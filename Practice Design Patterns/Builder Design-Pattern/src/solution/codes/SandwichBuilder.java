package solution.codes;

public class SandwichBuilder implements Builder{
    private Sandwich sandwich;

    public SandwichBuilder() {
        this.reset();
    }

    @Override
    public void setBreadType(String breadType) {
        sandwich.setBreadType(breadType);
    }

    @Override
    public void setFilling(String filling) {
        sandwich.setFilling(filling);
    }

    @Override
    public void setSpread(String spread) {
        sandwich.setSpread(spread);
    }

    @Override
    public void reset() {
        this.sandwich = new Sandwich();
    }

    public Sandwich getSandwich() {
        return this.sandwich;
    }
}
