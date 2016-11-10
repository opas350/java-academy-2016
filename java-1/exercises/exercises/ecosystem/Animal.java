/* Animal class
author: Javier Reyes

This class will be the template for the different animal clases
*/


public class Animal {

	// Class variables can't be modified by another class
	private int legs;
	private String color;
	private String size;

	// Default Constructor
	Animal() {
		this.legs = 4;
		this.color = "Undefined";
		this.size = "Undefined";
	}

	// Constructors
	Animal(int legs, String color, String size) {

		this.legs = legs;
		this.color = color;
		this.size = size;
	}

	// Set and Get methods
	public int getNumberOfLegs() { return this.legs;}
	public void setNumberOfLegs(int legs) { this.legs = legs; }
	public String getColor() { return this.color; }
	public void setColor(String color) { this.color = color; }
	public String getSize() { return this.size; }
	public void setSize(String size) { this.size = size; }

	// Other methods
	public void eat(){ System.out.println("Animal is eating"); }
	public void sleep(){ System.out.println("Animal is sleeping"); }
	public void AnimalSound() { System.out.println("Animal is making sound"); }

}