package codes.solution;

public class SalesPrinter extends Printer{
    private static SalesPrinter instance;

    private SalesPrinter() { }

    @Override
    public HrPrinter createPrinter() {
        if (instance == null) {
            instance = new SalesPrinter();
        }
        return instance.createPrinter();
    }
}
