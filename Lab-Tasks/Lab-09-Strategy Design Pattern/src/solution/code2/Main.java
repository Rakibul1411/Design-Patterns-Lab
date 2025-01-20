package solution.code2;

public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Robot1", "Position: (10,10), Obstacles: None");
        Robot robot2 = new Robot("Robot2", "Position: (10,50), Obstacles: Nearby Vehicles");
        Robot robot3 = new Robot("Robot3", "Position: (-30,70), Obstacles: Moving Object");

        robot1.setBehavior(new AggressiveBehavior());
        robot2.setBehavior(new DefensiveBehavior());
        robot3.setBehavior(new NormalBehavior());

        System.out.println("\n");

        robot1.performAction();
        robot2.performAction();
        robot3.performAction();

        System.out.println("\n-- Changing Behaviors Dynamically --\n");

        // Dynamically change behaviors
        robot1.setBehavior(new DefensiveBehavior());
        robot2.setBehavior(new NormalBehavior());
        robot3.setBehavior(new AggressiveBehavior());

        // Update context and perform actions again
        robot1.updateContext("Position: (10,19), Obstacles: Nearby Building");
        robot2.updateContext("Position: (12,60), Obstacles: Clear Path");
        robot3.updateContext("Position: (-25,65), Obstacles: Enemy Robot");

        robot1.performAction();
        robot2.performAction();
        robot3.performAction();
    }
}
