package codes.solution;


class AccountInfo {
    private int pin;
    private double balance;

    public AccountInfo(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        this.balance -= amount;
    }
}
