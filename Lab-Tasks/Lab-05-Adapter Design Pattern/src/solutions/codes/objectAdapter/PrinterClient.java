package solutions.codes.objectAdapter;

public class PrinterClient {
    private final Printer printer;

    public PrinterClient(Printer printer) {
        this.printer = printer;
    }

    public void print(String content) {
        printer.printDocument(content);
    }
}
