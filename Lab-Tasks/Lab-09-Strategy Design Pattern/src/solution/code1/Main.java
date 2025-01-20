package solution.code1;

import java.util.Arrays;
import java.util.List;

// Main class to demonstrate the implementation
public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot("R1", new Point(0, 0));
        Robot robot2 = new Robot("R2", new Point(5, 5));

        // Create a list of obstacles
        List<Point> obstacles = Arrays.asList(
                new Point(2, 2),
                new Point(3, 3)
        );

        // Update robot contexts
        robot1.updateContext(new Point(1, 1), obstacles);
        robot2.updateContext(new Point(4, 4), obstacles);

        // Initial behavior
        System.out.println("\nInitial behaviors:");
        robot1.performAction();
        robot2.performAction();

        // Change behaviors
        System.out.println("\nChanging behaviors:");
        robot1.setBehavior(new AggressiveBehavior());
        robot2.setBehavior(new DefensiveBehavior());

        // Perform actions with new behaviors
        System.out.println("\nNew behaviors in action:");
        robot1.performAction();
        robot2.performAction();
    }
}
