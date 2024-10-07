package code.solutions;

public class ModernTable implements Table {

    private final int id;

    @Override
    public void placeItems() {
        System.out.println("Modern Table ID: " + id);
    }

    public ModernTable(int id) {
        this.id = id;
    }
}
