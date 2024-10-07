package code.solutions;

public class ModernChair implements Chair {

    private final int id;

    @Override
    public void sitOn() {
        System.out.println("Modern Chair ID: " + id);
    }

    public ModernChair(int id) {
        this.id = id;
    }
}
