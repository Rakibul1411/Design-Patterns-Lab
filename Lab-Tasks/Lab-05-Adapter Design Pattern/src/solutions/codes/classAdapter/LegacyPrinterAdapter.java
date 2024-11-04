package solutions.codes.classAdapter;

public class LegacyPrinterAdapter extends OldPrinter implements Printer {
    @Override
    public void printDocument(String document) {
        printOldFormatDocument(document);
    }
}
