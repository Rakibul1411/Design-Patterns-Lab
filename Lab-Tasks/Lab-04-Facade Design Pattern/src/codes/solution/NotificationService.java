package codes.solution;

class NotificationService {
    public void sendPaymentNotification(String cardNumber, double amount) {
        System.out.println("Notification sent for payment of $" + amount + " on card: " + cardNumber);
    }
}