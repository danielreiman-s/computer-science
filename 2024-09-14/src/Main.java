public class Main {
    public static void main(String[] args) {
        BankAccount bob = new BankAccount(1000, -1000);
        BankAccount lisa = new BankAccount(1000, -1000);

        System.out.println("\nBefore Transfer 01\n----------------");
        System.out.println("Bob's balance: " + bob.getBalance());
        System.out.println("Lisa's balance: " + lisa.getBalance());

        boolean transfer01Success = bob.transfer(lisa, 500);

        if (transfer01Success) {
            System.out.println("\nSYSTEM: Transaction 01 Completed Successfully");
            System.out.println("\nAfter Transfer 01\n----------------");
            System.out.println("Bob's balance: " + bob.getBalance());
            System.out.println("Lisa's balance: " + lisa.getBalance());
        }

        boolean transfer02Success = bob.transfer(lisa, 1600);
        if (transfer02Success) {
            System.out.println("\nTransaction 02 Completed Successfully");
            System.out.println("\nAfter Transfer 02\n----------------");
            System.out.println("Bob's balance: " + bob.getBalance());
            System.out.println("Lisa's balance: " + lisa.getBalance());
        } else {
            System.out.println("\nSYSTEM: Bob have exceeded his account limits, the transaction could not be completed.");
        }
        
    }
}
