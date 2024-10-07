package code.solutions;

public class VictorianTable implements Table{

    private final int id;

    @Override
    public void placeItems() {
        System.out.println("Victorian Table ID: " + id);
    }

    public VictorianTable(int id) {
        this.id = id;
    }
}
