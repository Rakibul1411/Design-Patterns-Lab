package code.solutions;

public class ModernSofa implements Sofa {

    private final int id;

    @Override
    public void lieOn() {
        System.out.println("Modern Sofa ID: " + id);
    }

    public ModernSofa(int id) {
        this.id = id;
    }
}
