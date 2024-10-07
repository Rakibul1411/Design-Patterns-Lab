package code.solutions;

public class RusticSofa implements Sofa{

    private final int id;

    @Override
    public void lieOn() {
        System.out.println("Rustic Sofa ID: " + id);
    }

    public RusticSofa(int id) {
        this.id = id;
    }
}
