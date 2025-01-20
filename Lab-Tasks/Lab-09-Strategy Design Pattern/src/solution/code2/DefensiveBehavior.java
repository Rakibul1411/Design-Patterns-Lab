package solution.code2;

class DefensiveBehavior implements Behavior {
    @Override
    public void execute(String robotName, String contextInfo) {
        System.out.println(robotName + " exhibits Defensive Behavior: " +
                "Defending position! (" + contextInfo + ")");
    }
}
