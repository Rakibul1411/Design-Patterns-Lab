package solution.codes;

class ElectronicProduct extends ProductPrototype {
    private int storageCapacity; // in GB
    private int batteryLife; // in hours

    public ElectronicProduct(String name, double price, int storageCapacity, int batteryLife) {
        super(name, "Electronics", price);
        this.storageCapacity = storageCapacity;
        this.batteryLife = batteryLife;
    }

    // Constructor for deep copying using getters
    public ElectronicProduct(ElectronicProduct source) {
        super(source.getName(), source.getCategory(), source.getPrice());
        this.name = source.getName();
        this.category = source.getCategory();
        this.price = source.getPrice();
        this.storageCapacity = source.getStorageCapacity();
        this.batteryLife = source.getBatteryLife();
    }

    @Override
    public ProductPrototype manualClone() {
        return new ElectronicProduct(this); // Deep clone using the copy constructor
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public String toString() {
        return super.toString() + ", Storage: " + storageCapacity + "GB, Battery: " + batteryLife + " hours";
    }
}