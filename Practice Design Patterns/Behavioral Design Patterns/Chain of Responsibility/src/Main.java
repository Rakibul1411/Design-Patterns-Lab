public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        Panel panel = new Panel();
        Button button1 = new Button();
        Button button2 = new Button();


        // Build hierarchy
        dialog.addChild(panel);
        dialog.addChild(button1);
        dialog.addChild(button2);

        dialog.setWikiPageURL("https://en.wikipedia.org/wiki/Main_Page");
        panel.setModalHelpText("Panel configuration guide");
        button1.setTooltipText("Submit form button");

        // Test help propagation
        System.out.println("--- Button 1 Help ---");
        button1.showHelp();  // Handled by button

        System.out.println("\n--- Button 2 Help ---");
        button2.showHelp();  // Handled by panel -> dialog

        System.out.println("\n--- Panel Help ---");
        panel.showHelp();    // Handled by panel

        System.out.println("\n--- Dialog Help ---");
        dialog.showHelp();   // Handled by dialog

        System.out.println("\n--- Reconfigured Help ---");
        Button button3 = new Button();
        button3.showHelp();  // No help available

    }
}
