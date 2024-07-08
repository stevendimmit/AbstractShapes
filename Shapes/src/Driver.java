
public class Driver {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3.0,4.0,5.0);
		Circle circle = new Circle(2.0);
		Rectangle rectangle = new Rectangle(3.0,4.0);
		Shape[] shapeArray = {triangle, circle, rectangle};
		
		for (Shape shape : shapeArray) {
			shape.toString();
		}

	}

}
