/* Cylinder class
Author: Javier Reyes
*/

public class Cylinder extends Circle {

	private double height;

	Cylinder() {
		super();
		this.height = 1.0; // Default value
	}

	Cylinder(double radius) {
		super(radius);
	}

	Cylinder(double radius, double height, String color) {
		//super(radius, color); // Can't use this constructor because the superclass doesnt have 
		// a constructor with only 2 parameters. 
		super(radius, color, true); // true as default filled value
		this.height = height;
	}

	// Class Methods
	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return super.getArea() * this.height;
	}
}