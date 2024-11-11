package solutions.protectionProxy;

public class Main {
    public static void main(String[] args) {
        BankAccount adminAccount = new BankAccountProxy(1000, "Admin");
        BankAccount userAccount = new BankAccountProxy(2000, "User");

        adminAccount.deposit(5000);
        adminAccount.withdraw(500);

        userAccount.deposit(1000);
        userAccount.withdraw(500);
    }
}
