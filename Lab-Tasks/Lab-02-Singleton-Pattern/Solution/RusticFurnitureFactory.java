package code.solutions;

public class RusticFurnitureFactory implements FurnitureFactory{

    private static volatile RusticFurnitureFactory instance;
    private static int idCounter = 0;

    private RusticFurnitureFactory() { }

    public static RusticFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (RusticFurnitureFactory.class) {
                if (instance == null) {
                    instance = new RusticFurnitureFactory();
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
        return new RusticChair(generateUniqueId());
    }

    @Override
    public Table createTable() {
        return new RusticTable(generateUniqueId());
    }

    @Override
    public Sofa createSofa() {
        return new RusticSofa(generateUniqueId());
    }
}
