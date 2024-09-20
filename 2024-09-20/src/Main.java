import java.util.*;

public class Main {
	public static Scanner input = new Scanner(System.in); 
	
    public static void main(String[] args) {
    	circleEx();
    	
    	rectangleEx();
    }
    public static void circleEx() {
    	Circle c1 = new Circle(2);
    	Circle c2 = new Circle(4);

    	System.out.println("C1's area: " + c1.area());
    	
    	System.out.println("C2's area: " + c2.area());
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
