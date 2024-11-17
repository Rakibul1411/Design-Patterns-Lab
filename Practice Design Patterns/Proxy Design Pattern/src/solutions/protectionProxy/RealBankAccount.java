package solutions.protectionProxy;

public class RealBankAccount implements BankAccount{
   private double balance;

   RealBankAccount(double balance) {
       this.balance = balance;
   }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
       if (balance >= amount) {
           balance -= amount;
           System.out.println("Withdrawn " + amount + ". New Balance: " + balance);
       }
       else {
           System.out.println("Insufficient Balance");
       }
    }
}
