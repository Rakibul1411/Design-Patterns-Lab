package solution.code1;

class AggressiveBehavior implements RobotBehavior {
    @Override
    public void act(RobotContext context) {
        System.out.println("Robot at position " + context.getPosition() +
                " acting aggressively - Moving towards nearest robot!");
    }
}
