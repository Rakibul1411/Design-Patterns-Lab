package code.solutions;

public class VictorianFurnitureFactory implements FurnitureFactory{

    private static volatile VictorianFurnitureFactory instance;
    private static int idCounter = 0;

    private VictorianFurnitureFactory() { }

    public static VictorianFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (VictorianFurnitureFactory.class) {
                if (instance == null) {
                    instance = new VictorianFurnitureFactory();
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
        return new VictorianChair(generateUniqueId());
    }

    @Override
    public Table createTable() {
        return new VictorianTable(generateUniqueId());
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa(generateUniqueId());
    }
}
