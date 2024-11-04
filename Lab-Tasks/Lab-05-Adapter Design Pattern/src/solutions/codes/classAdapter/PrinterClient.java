package solutions.codes.classAdapter;

public class PrinterClient {
    private final Printer printer;

    public PrinterClient(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.printDocument(message);
    }
}
