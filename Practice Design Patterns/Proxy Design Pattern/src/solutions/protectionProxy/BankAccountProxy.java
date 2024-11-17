package solutions.protectionProxy;

public class BankAccountProxy implements BankAccount {
   private String userRole;
   private RealBankAccount realBankAccount;

   public BankAccountProxy(double initialBalance, String userRole) {
       this.realBankAccount = new RealBankAccount(initialBalance);
       this.userRole = userRole;
   }

    @Override
    public void deposit(double amount) {
       realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
       if (userRole.equalsIgnoreCase("Admin")) {
           realBankAccount.withdraw(amount);
       }
       else {
           System.out.println("Unauthorized access: Only admins can withdraw money!");
       }
    }
}
