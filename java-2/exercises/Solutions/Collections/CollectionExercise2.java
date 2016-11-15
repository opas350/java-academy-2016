/*
	Solution of Excercise 2
	Author: Javier Reyes
*/

/*2.-Set and Ordering. Define the way how the HashSet, TreeSet and LinkedHashSet collections handle the next elements:

Set names = new …();
names.add("Jake");
names.add("Robert");
names.add("Marisa");
names.add("Kasey");
System.out.println(names);*/

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class CollectionExercise2 {

	public static void main(String[] args) {

		// First init and set the Hashset
		Set<String> set1 = new HashSet<String>();
		// then add the elements
		set1.add("Jake");
		set1.add("Robert");
		set1.add("Marisa");
		set1.add("Kasey");
		set1.add("Javier");

		// Call the loop function
		System.out.println("\n---- Using HashSet ----\n");
		loopElements(set1);
		// The loop function will store the information by using Hashing and 
		// associate the data with its key
		// This means that the information displayed by the loop is not neccesarily 
		// in the same order as it was added, it depends on the HashMap
		// ex.
		// Jake
		// Marisa ...

		// TreeSet init
		TreeSet<String> treeSet1 = new TreeSet<String>();
		// Add elements
		treeSet1.add("Jake");
		treeSet1.add("Robert");
		treeSet1.add("Marisa");
		treeSet1.add("Kasey");
		treeSet1.add("Javier");

		// Call the loop function
		System.out.println("\n---- Using TreeSet ----\n");
		loopElements(treeSet1);
		// The TreeSet will arrange the elements in alphabetical order in case of Strings or 
		// natural order in case of Dates
		// ex.
		// Jake
		// Javier
		// Kasey ...

		// LinkedHashSet init
		LinkedHashSet<String> linkedHash1 = new LinkedHashSet<String>();
		// Add elements
		linkedHash1.add("Jake");
		linkedHash1.add("Robert");
		linkedHash1.add("Marisa");
		linkedHash1.add("Kasey");
		linkedHash1.add("Javier");

		// Call the loop function
		System.out.println("\n---- Using LinkedHashSet ----\n");
		loopElements(linkedHash1);

		// The LinkedHashSet will is predictable unlike HashSet because it will order the data
		// in the same order as added.
		// ex.
		// Jake
		// Robert ....


	}

	public static <T> void loopElements(Collection<T> inputCollection) {

		// For each loop
		for(T e : inputCollection) {
			System.out.println(e);
		}
	}
}