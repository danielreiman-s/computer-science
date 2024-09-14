public class BankAccount {
    private int minBalance;
    private int balance;
    
    public BankAccount(int balance, int minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }
    
    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    public void deposit(int amount) {
        balance = balance + amount;
    }

    public boolean transfer(BankAccount target, int amount) {
        if (balance - amount < minBalance) {
            return false;
        }

        this.balance -= amount;
        target.deposit(amount);
        return true;
    }

    public int getBalance() {
        return balance;
    }    
}
