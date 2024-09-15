public class BankAccount {
    private int minBalance;
    private int balance;
    private String owner;
    
    public BankAccount(String owner, int balance, int minBalance) {
    	this.owner = owner;
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
    
    public String getOwner() {
    	return this.owner;
    }
    
    public void setOwner(String newValue) {
    	this.owner = newValue;
    }
    
    public String toString() {
    	return  "Balance of " + this.owner + ": " + this.balance;
    }
    
    
}
