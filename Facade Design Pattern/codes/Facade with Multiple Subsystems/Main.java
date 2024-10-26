public class Main {
  
  public static void main(String[] args) {
    BankingFacade banking = new BankingFacade();

    banking.checkBalance();
    banking.withdraw(150);
    banking.checkBalance();
    banking.deposit(300);
    banking.checkBalance();
  }

}
