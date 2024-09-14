public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(3000, -1000);
        acct1.deposit(500);
        System.out.println(acct1.getBalance());
    }
}
