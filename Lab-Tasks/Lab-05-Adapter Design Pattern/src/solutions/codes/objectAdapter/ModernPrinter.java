package solutions.codes.objectAdapter;

public class ModernPrinter implements Printer{
    @Override
    public void printDocument(String document) {
        System.out.println("Printing in modern format: " + document);
    }
}
