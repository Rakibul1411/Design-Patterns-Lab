package solution.code2;

class NormalBehavior implements Behavior {
    @Override
    public void execute(String robotName, String contextInfo) {
        System.out.println(robotName + " exhibits Normal Behavior: " +
                "Performing routine tasks. (" + contextInfo + ")");
    }
}
