package solution.codes;

public class Main {
    public static void main(String[] args) {
        ProductRegistry registry = new ProductRegistry();

        // Adding base prototypes to the registry
        registry.addPrototype("Basic T-Shirt", new ClothingProduct("T-Shirt", 19.99, "Blue", "M"));
        registry.addPrototype("Smartphone", new ElectronicProduct("Smartphone", 599.99, 128, 24));

        // Cloning and customizing product variants
        ProductPrototype tShirtClone = registry.getPrototype("Basic T-Shirt");
        if (tShirtClone != null) {
            System.out.println("Original: " + tShirtClone);
        }

        ProductPrototype smartphoneClone = registry.getPrototype("Smartphone");
        if (smartphoneClone != null) {
            System.out.println("Original: " + smartphoneClone);
        }

        // Customizing clones
        ClothingProduct customTShirt = new ClothingProduct((ClothingProduct) tShirtClone);
        customTShirt = new ClothingProduct(customTShirt.getName(), customTShirt.getPrice(), "Red", "L");
        System.out.println("Customized T-Shirt: " + customTShirt);

        ElectronicProduct customSmartphone = new ElectronicProduct((ElectronicProduct) smartphoneClone);
        customSmartphone = new ElectronicProduct(customSmartphone.getName(), customSmartphone.getPrice(), 256, 36);
        System.out.println("Customized Smartphone: " + customSmartphone);
    }
}
