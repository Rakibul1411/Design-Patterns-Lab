package solutions.codes.classAdapter;

public class OldPrinter implements LegacyPrinter {
    @Override
    public void printOldFormatDocument(String document) {
        System.out.println("Printing old format document: " + document);
    }
}
