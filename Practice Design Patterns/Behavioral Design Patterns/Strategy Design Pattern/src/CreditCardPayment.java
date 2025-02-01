public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You have paid $" + amount + " using Credit Card: " + cardNumber);
    }
}
