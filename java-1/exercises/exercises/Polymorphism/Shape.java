/* Shape Abstract Class
Author: Javier Reyes
*/

public abstract class Shape {

	protected String color;
	protected boolean filled;

	// Constructors
	public Shape() {}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Set and get methods
	public String getColor() { return this.color; }
	public void setColor(String color) { this.color = color;}
	public boolean isFilled() { return this.filled; }
	public void setFilled(boolean filled) { this.filled = filled; }

	// Abstract methods
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();	
}