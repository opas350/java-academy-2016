/* 
	Exercise 1 and 3 of Enumerations
	Author: Javier Reyes
*/
// 1.- Write a simple code for a simple enum example
// 3.-Write an example to iterate all values of an enum.


public class EnumerationsEx1 {

	// Code for enum example
	public enum Planets {

		Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune
	}

	public static void main(String[] args) {

		// code for iterate values of enum
		for(Planets num : Planets.values()){
			System.out.println(num);
		}
	}
}