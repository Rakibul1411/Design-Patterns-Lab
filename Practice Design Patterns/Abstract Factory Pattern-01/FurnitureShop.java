public class FurnitureShop {

  private Chair chair;
  private Sofa sofa;
  private CoffeeTable coffeeTable;

  public FurnitureShop(FurnitureFactory factory) {
      this.chair = factory.createChair();
      this.sofa = factory.createSofa();
      this.coffeeTable = factory.createCoffeeTable();
  }

  public void furnish() {
      chair.sitOn();
      sofa.lieOn();
      coffeeTable.putOn();
  }
}
