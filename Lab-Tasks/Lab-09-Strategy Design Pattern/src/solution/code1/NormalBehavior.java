package solution.code1;

class NormalBehavior implements RobotBehavior {
    @Override
    public void act(RobotContext context) {
        System.out.println("Robot at position " + context.getPosition() +
                " acting normally - Patrolling area!");
    }
}
