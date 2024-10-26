public class BankingFacade {
  private Account account;
  private PaymentGateway paymentGateway;
  private Ledger ledger;

  public BankingFacade() {
    this.account = new Account();
    this.paymentGateway = new PaymentGateway();
    this.ledger = new Ledger();
  }

  public void withdraw(double amount) {
    if(paymentGateway.verifyAccount((account.getAccountNumber()))) {
      ledger.debit(amount);
    }
  }

  public void deposit(double amount) {
    if(paymentGateway.verifyAccount((account.getAccountNumber()))) {
      ledger.credit((amount));
    }
  }

  public void checkBalance() {
    System.out.println("Current Balance: " + ledger.getBalance());
  }
}
