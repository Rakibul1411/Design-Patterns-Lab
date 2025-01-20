package solution.code2;

// Context: Robot
class Robot {
    private final String name;
    private Behavior behavior;
    private String contextInfo;

    public Robot(String name, String contextInfo) {
        this.name = name;
        this.contextInfo = contextInfo;
        this.behavior = new NormalBehavior();
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void updateContext(String contextInfo) {
        this.contextInfo = contextInfo;
    }

    public void performAction() {
        behavior.execute(name, contextInfo);
    }
}
