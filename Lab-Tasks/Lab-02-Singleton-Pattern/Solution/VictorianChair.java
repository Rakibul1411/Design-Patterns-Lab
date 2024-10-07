package code.solutions;

public class VictorianChair implements Chair{

    private final int id;

    @Override
    public void sitOn() {
        System.out.println("Victorian Chair ID: " + id);
    }

    public VictorianChair(int id) {
        this.id = id;
    }
}
