
public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double area() {
		return height * width;
	}

	@Override
	public double perimeter() {
		return (2.0 * height) + (2.0 * width);
	}
	public String toString() {
		System.out.println("Shape: Rectangle, Area: " + this.area() + ", Perimeter: " + this.perimeter());
		return "Shape: Rectangle, Area: " + this.area() + ", Perimeter: " + this.perimeter();
    
	}
}
