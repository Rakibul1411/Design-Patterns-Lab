package solution.code1;

class DefensiveBehavior implements RobotBehavior {
    @Override
    public void act(RobotContext context) {
        System.out.println("Robot at position " + context.getPosition() +
                " acting defensively - Moving away from nearby obstacles!");
    }
}
