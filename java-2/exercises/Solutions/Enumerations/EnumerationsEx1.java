/* 
	Exercise 1 of Enumerations
	Author: Javier Reyes
*/
// Write a simple code for a simple enum example

public class EnumerationsEx1 {

	public enum Planets {

		Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune
	}

	public static void main(String[] args) {

		for(Planets num : Planets.values()){
			System.out.println(num);
		}
	}
}