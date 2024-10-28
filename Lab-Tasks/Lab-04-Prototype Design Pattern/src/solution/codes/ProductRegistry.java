package solution.codes;
import java.util.HashMap;
import java.util.Map;

class ProductRegistry {
    private Map<String, ProductPrototype> prototypes = new HashMap<>();

    public void addPrototype(String key, ProductPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public ProductPrototype getPrototype(String key) {
        ProductPrototype prototype = prototypes.get(key);
        return prototype != null ? prototype.manualClone() : null; // Deep clone with manualClone method
    }
}

