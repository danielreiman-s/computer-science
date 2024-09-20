
public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		// Circle area = r^2*pi
		return this.radius * this.radius * Math.PI;
	}
}
