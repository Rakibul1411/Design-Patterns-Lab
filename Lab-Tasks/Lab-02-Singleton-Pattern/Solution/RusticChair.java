package code.solutions;

public class RusticChair implements Chair{

    private final int id;

    @Override
    public void sitOn() {
        System.out.println("Rustic Chair ID: " + id);
    }

    public RusticChair(int id) {
        this.id = id;
    }
}
