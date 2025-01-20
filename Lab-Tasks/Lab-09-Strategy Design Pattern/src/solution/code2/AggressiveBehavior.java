package solution.code2;

class AggressiveBehavior implements Behavior {
    @Override
    public void execute(String robotName, String contextInfo) {
        System.out.println(robotName + " exhibits Aggressive Behavior: " +
                "Attacking nearby target! (" + contextInfo + ")");
    }
}
