public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    // deposit throws CustomException for invalid amounts
    public void deposit(double amount) throws CustomException {
        if (amount <= 0) {
            throw new CustomException("Deposit failed: amount must be positive.");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
