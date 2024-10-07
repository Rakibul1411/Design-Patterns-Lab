package code.solutions;

public class RusticTable implements Table{

    private final int id;

    @Override
    public void placeItems() {
        System.out.println("Rustic Table ID: " + id);
    }

    public RusticTable(int id) {
        this.id = id;
    }
}
