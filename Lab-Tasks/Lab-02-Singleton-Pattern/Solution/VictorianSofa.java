package code.solutions;

public class VictorianSofa implements Sofa {

    private final int id;

    @Override
    public void lieOn() {
        System.out.println("Victorian Sofa ID: " + id);
    }

    public VictorianSofa(int id) {
        this.id = id;
    }
}
