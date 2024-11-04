package solutions.codes.objectAdapter;

public class OldPrinter implements LegacyPrinter{
    @Override
    public void printOldFormat(String document) {
        System.out.println("Printing in Legacy format..." + document);
    }
}
