package solution.codes;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructChickenSandwich() {
        builder.setBreadType("Regular");
        builder.setFilling("Grilled Chicken");
        builder.setSpread("Cheese");
    }

    public void constructEggSandwich(){
        builder.setBreadType("Toasted");
        builder.setFilling("Fried Egg");
        builder.setSpread("Sauce");
    }

    public void constructChickenSandwichMenu() {
        builder.setBreadType("Regular");
        builder.setFilling("Grilled Chicken");
        builder.setSpread("Cheese");
    }

    public void constructEggSandwichMenu(){
        builder.setBreadType("Toasted");
        builder.setFilling("Fried Egg");
        builder.setSpread("Sauce");
    }
}
