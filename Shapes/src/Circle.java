
public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return Math.PI * 2.0 * radius;
	}
	
	public String toString() {
		System.out.println("Shape: Circle, Area: " + this.area() + ", Perimeter: " + this.perimeter());
		return "Shape: Circle, Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}

}
