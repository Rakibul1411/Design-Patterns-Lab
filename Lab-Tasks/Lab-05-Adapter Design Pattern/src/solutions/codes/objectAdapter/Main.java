package solutions.codes.objectAdapter;

public class Main {
    public static void main(String[] args) {
        Printer modernPrinter = new ModernPrinter();
        PrinterClient modernPrinterClient = new PrinterClient(modernPrinter);
        modernPrinterClient.print("Modern Document");

        // Using a legacy printer through the adapter with the client
        LegacyPrinter oldPrinter = new OldPrinter();
        Printer legacyAdapter = new LegacyPrinterAdapter(oldPrinter);
        PrinterClient legacyPrinterClient = new PrinterClient(legacyAdapter);
        legacyPrinterClient.print("Legacy Document via Object Adapter");
    }
}