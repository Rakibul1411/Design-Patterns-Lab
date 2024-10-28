package codes.solution;

class LedgerService {
    public void makeEntry(String cardNumber, double amount, String operation) {
        System.out.println("Ledger entry made for " + operation + " of $" + amount + " on card: " + cardNumber);
    }
}