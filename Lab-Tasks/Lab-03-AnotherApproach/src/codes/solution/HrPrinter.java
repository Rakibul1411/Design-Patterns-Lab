package codes.solution;

public class HrPrinter extends Printer {
    private static HrPrinter instance;

    private HrPrinter() { }

    @Override
    public HrPrinter createPrinter() {
        if (instance == null) {
            instance = new HrPrinter();
        }
        return instance;
    }
}
