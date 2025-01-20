package solution.code1;

import java.util.List;

class Robot {
    private final String id;
    private RobotBehavior behavior;
    private final RobotContext context;

    public Robot(String id, Point initialPosition) {
        this.id = id;
        this.context = new RobotContext(initialPosition);
        this.behavior = new NormalBehavior();
    }

    public void setBehavior(RobotBehavior behavior) {
        this.behavior = behavior;
        System.out.println("Robot " + id + " changed behavior to " +
                behavior.getClass().getSimpleName());
    }

    public void updateContext(Point position, List<Point> obstacles) {
        context.setPosition(position);
        context.updateObstacles(obstacles);
    }

    public void performAction() {
        behavior.act(context);
    }

    public String getId() {
        return id;
    }
}
