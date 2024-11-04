package solutions.codes.classAdapter;

public class ModernPrinter implements Printer{
    @Override
    public void printDocument(String document) {
        System.out.println("Printing modern document: " + document);
    }
}
