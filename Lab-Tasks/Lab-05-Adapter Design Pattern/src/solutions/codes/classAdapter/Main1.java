package solutions.codes.classAdapter;

public class Main1 {
    public static void main(String[] args) {
        Printer modernPrinter = new ModernPrinter();
        modernPrinter.printDocument("Modern Document");


        Printer legacyAdapter = new LegacyPrinterAdapter();
        legacyAdapter.printDocument("Legacy Document via Class Adapter");
    }
}
