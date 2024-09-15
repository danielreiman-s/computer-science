
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void draw() {
		System.out.println("");
		for(int l=1; l<=length; l++) {
			for(int w=1; w<=width; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public int calcArea() {
		return length * width;
	}
	
	public int calcPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	public void scale(int factor) {
		this.length *= factor;
		this.width *= factor;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public String toString() {
		return "Length: " + this.length + ", Width: " + this.width;
	}
}
