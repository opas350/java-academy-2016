/* Dog class
author: Javier Reyes

This class will be the template for the different animal clases
*/

public class Dog extends Animal {

	// Class variable that is only for the Dog class
	// can't be modified by another external class
	private String name;

	// Default contructor
	Dog() {
		super();
	}

	Dog(int legs, String color, String size, String name) {
		
		setNumberOfLegs(legs);
		setColor(color);
		setSize(size);
		this.name = name;
	}

	// Methods
	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }


	// Override parent class methods
	@Override
	public void eat() { System.out.println(this.name + " is eating"); }

	@Override
	public void sleep(){ System.out.println( this.name + " is taking a nap"); }
	
	@Override
	public void AnimalSound() { System.out.println(this.name + " is barking"); }

	// Overload method
	public void eat(String food) { System.out.println(this.name + " is eating " + food); }

}
