package solution.codes;

class ClothingProduct extends ProductPrototype {
    private String color;
    private String size;

    public ClothingProduct(String name, double price, String color, String size) {
        super(name, "Clothing", price);
        this.color = color;
        this.size = size;
    }

    // Constructor for deep copying using getters
    public ClothingProduct(ClothingProduct source) {
        super(source.getName(), source.getCategory(), source.getPrice());
        this.color = source.getColor();
        this.size = source.getSize();
    }

    @Override
    public ProductPrototype manualClone() {
        return new ClothingProduct(this); // Deep clone using the copy constructor
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color + ", Size: " + size;
    }
}