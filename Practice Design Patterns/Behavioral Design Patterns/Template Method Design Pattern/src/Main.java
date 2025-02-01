public class Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CsvDataProcessor();
        System.out.println("Processing CSV file: ");
        csvProcessor.processData();

        System.out.println();

        DataProcessor xmlProcessor = new XmlDataProcessor();
        System.out.println("Processing XML file: ");
        xmlProcessor.processData();
    }
}
