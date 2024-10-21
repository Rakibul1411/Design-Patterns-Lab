package codes.solution;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PrinterFactory printerFactory = PrinterFactory.getInstance();

        Scanner scanner = new Scanner(System.in);
        String department;
        String document;

        while (true) {
            System.out.println("\nEnter department name (or type 'exit' to quit): ");
            department = scanner.nextLine();


            if (department.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the system..");
                break;
            }

            System.out.println("Enter document name to print: ");
            document = scanner.nextLine();

            Printer printer = printerFactory.getPrinter(department);

            printer.print(document);
        }

        scanner.close();
    }
}
