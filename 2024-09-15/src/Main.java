import java.util.*;

public class Main {
	public static Scanner input = new Scanner(System.in); 
	
    public static void main(String[] args) {
    	bankAccountEx();
    	
    	rectangleEx();
    }

    public static void bankAccountEx() {
        BankAccount bob = new BankAccount("Bob" ,1000, -1000);
        BankAccount lisa = new BankAccount("Lisa", 1000, -1000);

        System.out.println("Bob's balance: " + bob.getBalance());
        System.out.println("Lisa's balance: " + lisa.getBalance());
        
        boolean transfer01Success = bob.transfer(lisa, 500);
        System.out.println("\nTransfering 500 to Lisa...");

        if (transfer01Success) {
            System.out.println("\nSYSTEM: Transaction 01 Completed Successfully");
            System.out.println("\nAfter Transfer 01\n-----------------");
            System.out.println("Bob's balance: " + bob.getBalance());
            System.out.println("Lisa's balance: " + lisa.getBalance());
        }
        
        boolean transfer02Success = bob.transfer(lisa, 1600);
        System.out.println("\nTransfering 1600 to Lisa...");

        if (transfer02Success) {
            System.out.println("\nTransaction 02 Completed Successfully");
            System.out.println("\nAfter Transfer 02\n-----------------");
            System.out.println("Bob's balance: " + bob.getBalance());
            System.out.println("Lisa's balance: " + lisa.getBalance());
        } else {
            System.out.println("\nSYSTEM: Bob have exceeded his account limits, the transaction could not be completed.");
        }
        
        System.out.println("BOB OBJECT TO STRING    " + bob.toString());
        System.out.println("LISA OBJECT TO STRING   " + lisa.toString());
    }
    
    public static void rectangleEx() {
    	// Get the user input about the rectangles's info
    	System.out.println("---- Input ----");

    	System.out.println("Enter rectangle one length: ");
    	int recOneLength = input.nextInt();
    	
    	System.out.println("Enter rectangle one width: ");
    	int recOneWidth = input.nextInt();
    	
    	Rectangle recOne = new Rectangle(recOneLength, recOneWidth);
    	
    	
    	System.out.println("Enter rectangle two length: ");
    	int recTwoLength = input.nextInt();
    	
    	System.out.println("Enter rectangle two width: ");
    	int recTwoWidth = input.nextInt();
    	
    	Rectangle recTwo = new Rectangle(recTwoLength, recTwoWidth);
    	
    	// Draw the rectangles
    	System.out.println("---- Draw ----");
    	recOne.draw();
    	recTwo.draw();
    	
    	// Scale the first rectangle times 2
    	recOne.scale(2);
    	System.out.println("---- Scale ----");
    	System.out.println("Rectangle One new size || length: " + recOne.getLength() + ", width: " + recOne.getWidth() + " ||");
    	recOne.draw();

    	// Sum the Area and the Perimeter of both of the rectangles
    	System.out.println("---- Sum the Area and the Perimeter of both of the rectangles ----");
    	
    	int sumArea = recOne.calcArea() + recTwo.calcArea();
    	int sumPerimeter = recOne.calcPerimeter() + recTwo.calcPerimeter();
    	
    	System.out.println("Sum Area: " + sumArea);
    	System.out.println("Sum Perimeter: " + sumPerimeter);
    	
    	// To String
    	System.out.println("---- To String ----");
    	System.out.println("Rectangle 01    " + recOne.toString());
    	System.out.println("Rectangle 02    " + recTwo.toString());

    	
    }
}
