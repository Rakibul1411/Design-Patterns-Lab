package codes.solution;

public class PaymentFacade {
    private AccountService accountService;
    private LedgerService ledgerService;
    private NotificationService notificationService;

    public PaymentFacade() {
        this.accountService = new AccountService();
        this.ledgerService = new LedgerService();
        this.notificationService = new NotificationService();
    }

    public boolean processPayment(String cardNumber, int pin, double amount, String operationType) {
        System.out.println("\n--- Processing Payment ---");

        if (!accountService.verifyAccount(cardNumber)) {
            System.out.println("Account verification failed.");
            return false;
        }

        if (!accountService.verifyPIN(cardNumber, pin)) {
            System.out.println("PIN verification failed.");
            return false;
        }

        if (!accountService.checkBalance(cardNumber, amount)) {
            System.out.println("Insufficient balance.");
            return false;
        }

        accountService.deductBalance(cardNumber, amount);
        ledgerService.makeEntry(cardNumber, amount, operationType);
        notificationService.sendPaymentNotification(cardNumber, amount);

        System.out.println("Payment processed successfully.");
        return true;
    }
}
