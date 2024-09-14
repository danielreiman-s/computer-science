public class Main {
    public static void main(String[] args) {
        // exDeposit();
        exTransfer();
    }

    public static void exDeposit() {
        BankAccount acct1 = new BankAccount(3000, -1000);
        acct1.deposit(500);
        System.out.println(acct1.getBalance());
    }

    public static void exTransfer() {
        BankAccount acct1 = new BankAccount(3000, -1000);
        BankAccount acct2 = new BankAccount(3000, -1000);
        boolean success = acct1.transfer(acct2, 500);
        System.out.println("Transfer success: " + success);
    }
}
