/* Ecosystem Class
Author: Javier Reyes

This class will use the different animals as well the main thread for
execution
*/

class Ecosystem {

	public static void main(String[] args) {
		
		// Object creation
		Animal defaultAnimal = new Animal(); // Default generic/unspecified animal
		Dog Loki = new Dog(4, "Black", "Small", "Loki");

		System.out.println(" ---- Start ----");

		// Default animal 
		System.out.println("\nTesting Animal class with default constructor\n");
		System.out.println("defaultAnimal color is " + defaultAnimal.getColor());
		System.out.println("defaultAnimal legs are " + defaultAnimal.getNumberOfLegs());
		System.out.println("defaultAnimal size is " + defaultAnimal.getSize());
		defaultAnimal.eat();
		defaultAnimal.AnimalSound();
		defaultAnimal.sleep();

		// Dog class
		System.out.println("\nTesting Dog class\n");
		System.out.println("Loki is " + Loki.getColor());
		System.out.println("Loki's size is " + Loki.getSize());
		Loki.eat();
		Loki.eat("Waffles");
		Loki.sleep();
		Loki.AnimalSound();

		// Creating a new animal by modifying the Animal class
		System.out.println("\nCreating a snake object using Animal class");
		Animal Snake = new Animal();
		Snake.setSize("big");
		Snake.setNumberOfLegs(0);
		Snake.setColor("Green");
		System.out.println("The snake is " + Snake.getSize());
		System.out.println("The snake has " + Snake.getNumberOfLegs() + " legs");
		System.out.println("The snake is " + Snake.getColor());
	}
}