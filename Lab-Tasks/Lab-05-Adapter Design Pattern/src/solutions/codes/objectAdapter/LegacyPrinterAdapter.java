package solutions.codes.objectAdapter;

public class LegacyPrinterAdapter implements Printer{
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    public void printDocument(String content) {
        legacyPrinter.printOldFormat(content);
    }
}
