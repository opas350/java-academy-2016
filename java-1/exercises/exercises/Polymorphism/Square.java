/*
	Square class
	Javier Reyes
*/

public class Square extends Rectangle {

	// The Class diagram (Shape.jpg) doesnt include 
	// new class properties even when the methods and constructors
	// used have a side parameter.
	// To avoid errors a private parameter was added.
	private  double side;

	// Constructors
	Square() {
		this.side = 1; // 1 as default value
	}

	Square(double side) {
		this.side = side;
	}

	Square(double side, String color, boolean filled) {
		super(side, side, color, filled); // using side as width and length
		this.side = side;
	}

	// class methods
	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// The setWidth and setLenght methods are not use on rectangle 
	// because the side = width = length
	@Override @Deprecated
	public void setWidth(double width){
		this.side = width;
		System.out.println("Warning: Use setSide() to change the size");
	}

	@Override @Deprecated
	public void setLength(double length){
		this.side = length;
		System.out.println("Warning: Use setSide() to change the size");
	}

	@Override
	public String toString() {
		return "Side : " + this.side;
	}

}
