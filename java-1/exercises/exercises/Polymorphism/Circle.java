/* Circle class
Author: Javier Reyes
*/

public class Circle extends Shape {

	// Class variables
	private double radius;

	// Class constructors
	Circle() {
		this.radius = 1.0; 	// Default value
	}

	Circle(double radius) {
		this.radius = radius;
	}

	Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	// Class Methods
	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.radius,2);
	}

	@Override
	public String toString() {return "radius: " + this.radius + "\nColor: " + this.color;}

}