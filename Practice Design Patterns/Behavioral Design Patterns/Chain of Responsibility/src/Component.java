import java.awt.*;

// Base Component class
abstract class Component implements ComponentWithContextualHelp {
    protected String tooltipText;
    protected Container container;

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public void showHelp() {
        if (tooltipText != null && !tooltipText.isEmpty()) {
            System.out.println("Showing tooltip: " + tooltipText);
        }
        else if (container != null) {
            container.showHelp();
        }
        else {
            System.out.println("No help available");
        }
    }
}
