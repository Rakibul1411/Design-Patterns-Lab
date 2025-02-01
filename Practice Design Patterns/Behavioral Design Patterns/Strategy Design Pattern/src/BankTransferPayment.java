public class BankTransferPayment implements PaymentStrategy{
    private final String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You have paid $" + amount + " using Bank Account: " + bankAccount);
    }
}
