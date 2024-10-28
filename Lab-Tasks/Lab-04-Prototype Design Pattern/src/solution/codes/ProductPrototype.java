package solution.codes;

abstract class ProductPrototype {
    protected String name;
    protected String category;
    protected double price;

    public ProductPrototype(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Abstract method for deep copying
    public abstract ProductPrototype manualClone();

    // Getters for accessing attributes in subclasses
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [Name: " + name + ", Category: " + category + ", Price: $" + price + "]";
    }
}
