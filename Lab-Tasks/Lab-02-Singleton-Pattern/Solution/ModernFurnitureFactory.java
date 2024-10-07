package code.solutions;

public class ModernFurnitureFactory implements FurnitureFactory{

    private static volatile ModernFurnitureFactory instance;
    private static int idCounter = 0;

    private ModernFurnitureFactory() { }

    public static ModernFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (ModernFurnitureFactory.class) {
                if (instance == null) {
                    instance = new ModernFurnitureFactory();
                }
            }
        }

        return instance;
    }

    private synchronized int generateUniqueId() {
        return ++idCounter;
    }

    @Override
    public Chair createChair() {
        return new ModernChair(generateUniqueId());
    }

    @Override
    public Table createTable() {
        return new ModernTable(generateUniqueId());
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa(generateUniqueId());
    }
}
