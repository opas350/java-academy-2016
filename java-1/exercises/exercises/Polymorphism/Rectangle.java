/*
	Rectangle class
	Javier Reyes
*/

public class Rectangle extends Shape {

	protected double width;
	protected double length;

	Rectangle() {
		// Initializing with default values
		this.width = 2;
		this.length = 1;
	}

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// Class methods
	public double getWidth(){
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	@Override
	public double getPerimeter() {
		return (this.length + this.width) * (2);
	}

	@Override
	public String toString() {
		return "length: " + this.length + "\nwidth: " + this.width;
	}


}