/*
	Demo class to demostrate the Circle and Cylinder implementation
	Author: Javier Reyes
*/

public class DemoCylinder {

	public static void main(String[] args) {

		// Object Init
		Cylinder cylinder1 = new Cylinder(2, 3, "Red");

		// Testing the methods
		// Shape class
		System.out.println(" --- Testing Shape class methods --\n");
		System.out.println("Color : " + cylinder1.getColor() );
		System.out.println("Change color to Blue");
		cylinder1.setColor("Blue");
		System.out.println("New color: " + cylinder1.getColor() );
		System.out.println("isFilled: " + cylinder1.isFilled());
		System.out.println("Change isFilled to false");
		cylinder1.setFilled(false);
		System.out.println("isFilled: " + cylinder1.isFilled());

		// Circle class
		System.out.println("\n--- Testing Circle class methods ---");
		System.out.println("Radius: " + cylinder1.getRadius() );
		System.out.println("Modify Radius to 5");
		cylinder1.setRadius(5.0);
		System.out.println("New Radius : " + cylinder1.getRadius() );
		System.out.println("Perimeter : " + cylinder1.getPerimeter());
		System.out.println("Area : " + cylinder1.getArea());
		System.out.println("toString: " + cylinder1.toString());

		// Cylinder class 
		System.out.println("\n--- Testing Cylinder class methods ---");
		System.out.println("Height: " + cylinder1.getHeight());
		System.out.println("Modify Height to 5");
		cylinder1.setHeight(5.0);
		System.out.println("new Height : " + cylinder1.getHeight());
		System.out.println("Volume: " + cylinder1.getVolume() );
		
		
	}
}