package solutions.codes.classAdapter;

public class Main2 {
    public static void main(String[] args) {
        Printer modernPrinter = new ModernPrinter();
        PrinterClient modernPrinterClient = new PrinterClient(modernPrinter);
        modernPrinterClient.print("Modern Document");


        Printer legacyAdapter = new LegacyPrinterAdapter();
        PrinterClient legacyPrinterClient = new PrinterClient(legacyAdapter);
        legacyPrinterClient.print("Legacy Document via Object Adapter");
    }
}
