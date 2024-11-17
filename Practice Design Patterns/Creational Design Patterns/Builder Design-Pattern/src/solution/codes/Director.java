package solution.codes;

public class Director {

    public void createChickenSandwich(Builder builder) {
        builder.reset();
        builder.setBreadType("regular bread");
        builder.setFilling("grilled chicken");
        builder.setSpread("cheese");
    }

    public void createEggSandwich(Builder builder) {
        builder.reset();
        builder.setBreadType("toasted bread");
        builder.setFilling("fried egg");
        builder.setSpread("sauce");
    }

    public void createChickenSandwichMenu(Builder builder) {
        builder.setBreadType("regular bread");
        builder.setFilling("grilled chicken");
        builder.setSpread("cheese");
    }

    public void createEggSandwichMenu(Builder builder) {
        builder.setBreadType("toasted bread");
        builder.setFilling("fried egg");
        builder.setSpread("sauce");
    }
}
