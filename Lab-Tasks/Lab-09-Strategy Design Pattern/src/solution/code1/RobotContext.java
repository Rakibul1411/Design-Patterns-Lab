package solution.code1;

import java.util.ArrayList;
import java.util.List;

// Context class to store robot's environmental information
class RobotContext {
    private Point position;
    private List<Point> nearbyObstacles;

    public RobotContext(Point position) {
        this.position = position;
        this.nearbyObstacles = new ArrayList<>();
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public List<Point> getNearbyObstacles() {
        return nearbyObstacles;
    }

    public void updateObstacles(List<Point> obstacles) {
        this.nearbyObstacles = obstacles;
    }
}
