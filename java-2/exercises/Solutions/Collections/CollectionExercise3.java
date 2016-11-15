/* 
	Exercise 3 of Collections
	Author: Javier Reyes
*/

/*3.-Write a program that prints its arguments in random order. 
Do not make a copy of the argument array.
Demonstrate how to print out the elements using both streams 
and the traditional enhanced for statement. */

import java.util.*;

public class CollectionExercise3 {

	// the args parameter will be the input of this program from cmd line
	public static void main(String[] args) {

		// create the List for the args[]
		// using the asList method from the Arrays class
		List<String> argsInput = Arrays.asList(args);	
		// suffle the order using the suffle method from the Collections class
		//shuffle(List<?> list)
		Collections.shuffle(argsInput);

		// Using java.util.stream
		// forEach(Consumer<? super T> action)
		// example argsInput.stream().forEachOrdered()
		// Using lambda expression (Java8) for this implementation.
		System.out.println("Using .stream().forEach() method");
		argsInput.stream().forEach(argument ->System.out.println(argument));
		System.out.println("\nUsing normal forEach method");
		// For each loop
		for(String argument : argsInput) {
		System.out.println(argument);
		}
	}
}