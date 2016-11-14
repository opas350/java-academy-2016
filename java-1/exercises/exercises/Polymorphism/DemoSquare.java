/* Shape Abstract Class
Author: Javier Reyes
*/

public class DemoSquare {

	public static void main(String[] args) {

		// Obj init
		Rectangle rectangle1 = new Rectangle(1.0 , 2.0 , "Red", true);
		Square square1 = new Square(2, "Gree", true);

		// Testing Rectangle and Square methods
		// Rectangle methods
		System.out.println("\n---- Testing Rectangle methods ----\n");
		System.out.println("Width : " + rectangle1.getWidth());
		System.out.println("Change Width to 5.0");
		rectangle1.setWidth(5.0);
		System.out.println("New Width: " + rectangle1.getWidth());
		System.out.println("Length : " + rectangle1.getLength());
		System.out.println("Change Length to 10.0");
		rectangle1.setWidth(10.0);
		System.out.println("New Length: " + rectangle1.getLength());
		System.out.println("Area : " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());
		System.out.println("toString : " + rectangle1.toString());

		// Square methods
		System.out.println("\n---- Testing Square methods ----\n");
		System.out.println("side : " + square1.getSide());
		System.out.println("Change side to 5.0");
		square1.setSide(5.0);
		System.out.println("New side : " + square1.getSide());
		System.out.println("change side to 2.0 using setWidth");
		square1.setWidth(2.0);
		System.out.println("new side : " + square1.getSide());
		System.out.println("change side to 10.0 using setLength");
		square1.setWidth(10.0);
		System.out.println("new side : " + square1.getSide());
		System.out.println("Area : " + square1.getArea());
		System.out.println("Perimeter: " + square1.getPerimeter());
	}
}