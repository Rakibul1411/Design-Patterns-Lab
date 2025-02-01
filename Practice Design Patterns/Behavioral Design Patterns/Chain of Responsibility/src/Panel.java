public class Panel extends Container{
    private String modalHelpText;

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    public void showHelp() {
        if (modalHelpText != null && !modalHelpText.isEmpty()) {
            System.out.println("Showing modal help: " + modalHelpText);
        }
        else {
            super.showHelp();
        }
    }
}
