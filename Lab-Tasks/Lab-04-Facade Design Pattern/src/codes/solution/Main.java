package codes.solution;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Card Number (####-####-####-####): ");
        String cardNumber = scanner.nextLine();

        System.out.print("Enter PIN (4 digits): ");
        int pin;
        try {
            pin = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid PIN format. PIN should be a 4-digit number.");
            scanner.close();
            return;
        }

        System.out.print("Enter Payment Amount: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format.");
            scanner.close();
            return;
        }

        System.out.print("Enter Operation Type (e.g., 'Pizza Order'): ");
        String operationType = scanner.nextLine();

        PaymentFacade paymentFacade = new PaymentFacade();
        boolean paymentStatus = paymentFacade.processPayment(cardNumber, pin, amount, operationType);

        if (paymentStatus) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order failed. Please check your payment details.");
        }

        scanner.close();
    }
}
