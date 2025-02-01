public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");

        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(150.0);

        System.out.println("\n");

        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(175.0);

        System.out.println("\n");

        PaymentStrategy bankTransferPayment = new BankTransferPayment("9876543210");
        paymentContext.setPaymentStrategy(bankTransferPayment);
        paymentContext.executePayment(150.0);
    }
}
