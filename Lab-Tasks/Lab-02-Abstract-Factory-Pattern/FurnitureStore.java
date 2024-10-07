public class FurnitureStore {
  private Chair chair;
  private Table table;
  private Sofa sofa;

  public FurnitureStore(FurnitureFactory factory) {
    this.chair = factory.createChair();
    this.table = factory.createTable();
    this.sofa = factory.createSofa();
  }

  public void useFurniture() {
    chair.sitOn();
    table.putOn();
    sofa.lieOn();
  }
}
