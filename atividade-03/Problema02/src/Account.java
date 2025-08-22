public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("Withdraw error: Not enough balance");
        }

        if(amount > withdrawLimit) {
            throw new IllegalArgumentException("Withdraw error: The amount exceeds the limit");
        }
    }
}
