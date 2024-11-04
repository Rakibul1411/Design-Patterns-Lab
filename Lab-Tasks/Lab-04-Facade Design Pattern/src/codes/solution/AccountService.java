package codes.solution;
import java.util.HashMap;
import java.util.regex.Pattern;

class AccountService {
    private HashMap<String, AccountInfo> accounts = new HashMap<>();

    public AccountService() {
        accounts.put("1234-5678-9012-3456", new AccountInfo(1234, 100.0));
        accounts.put("2345-6789-0123-4567", new AccountInfo(2345, 50.0));
    }

    public boolean verifyAccount(String cardNumber) {
        if (Pattern.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}", cardNumber) && accounts.containsKey(cardNumber)) {
            System.out.println("Account verified for card number: " + cardNumber);
            return true;
        } else {
            System.out.println("Invalid or non-existent card number.");
            return false;
        }
    }

    public boolean verifyPIN(String cardNumber, int pin) {
        AccountInfo accountInfo = accounts.get(cardNumber);
        if (accountInfo != null && accountInfo.getPin() == pin) {
            System.out.println("PIN verified.");
            return true;
        } else {
            System.out.println("Incorrect PIN.");
            return false;
        }
    }

    public boolean checkBalance(String cardNumber, double amount) {
        AccountInfo accountInfo = accounts.get(cardNumber);
        if (accountInfo != null && accountInfo.getBalance() >= amount) {
            System.out.println("Sufficient balance verified.");
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public void deductBalance(String cardNumber, double amount) {
        AccountInfo accountInfo = accounts.get(cardNumber);
        if (accountInfo != null) {
            accountInfo.deductBalance(amount);
            System.out.println("Deducted $" + amount + " from balance. Remaining balance: $" + accountInfo.getBalance());
        }
    }
}