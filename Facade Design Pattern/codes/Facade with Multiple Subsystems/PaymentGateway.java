public class PaymentGateway {
  
  public boolean verifyAccount(String accountNumber) {
    System.out.println("Verifying account: " + accountNumber);
    return true;
  }

  public boolean makePayment(double amount) {
    System.out.println("Payment of " + amount + " completed.");
    return true;
  }
}
