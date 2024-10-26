public class Ledger {
  private double balance = 1000.0;

  public void credit(double amount) {
    balance += amount;
    System.out.println("Credited " + amount + " to the account. Balance " + balance);
  }

  public void debit(double amount) {
    balance -= amount;
    System.out.println("Debited " + amount + " from the account. Balance: " + balance);
  }

  public double getBalance() {
    return balance;
  }
}
