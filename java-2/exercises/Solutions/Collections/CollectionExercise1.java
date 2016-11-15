/*
	Solution of Excercise 1 
	Author: Javier Reyes
*/

// 1.-Provides a clean syntax for looping over the elements of a Set, 
// List, array, or other collection
// Set grades = new HashSet();

// The use of generics will allow to use the code for diferent types(List, array, ...)

import java.util.Collection;
import java.util.*;

public class CollectionExercise1 {


	public static void main(String[] args) {

		// Example of Set
		HashSet<Integer> grades1 = new HashSet<Integer>();
		// add elements
		grades1.add(100);
		grades1.add(65);
		grades1.add(99);
		grades1.add(80);
		grades1.add(75);
		// loop
		System.out.println("\n---- HashSet ----\n");
		loopElements(grades1);
		// output: 100, 80, 99 ... not in the order because they depend on the HashMap created

		// Example of List
		ArrayList<String> animals = new ArrayList<String>();
		// add elements
		animals.add("Zebra");
		animals.add("Cat");
		animals.add("Lizard");
		animals.add("Shark");
		animals.add("Dog");
		// loop
		System.out.println("\n---- ArrayList -----\n");
		loopElements(animals);

	}

	public static <T> void loopElements(Collection<T> inputCollection) {

		// For each loop
		for(T e : inputCollection) {
			System.out.println(e);
		}
	}
}