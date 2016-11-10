/* Interface Test class
author: Javier Reyes
*/

public class InterfaceTest {

	public static void main(String[] args) {

		String string1 = "Select one of the sentences from this book to use as the data";
		InterfaceExample toBeReversed = new InterfaceExample(string1);

		System.out.println("original String: " + string1);
		System.out.println("String length: " + toBeReversed.length());
		System.out.println("Character at [15]: " + toBeReversed.charAt(15));
		System.out.println("Subsequence from 10 to 25: " + toBeReversed.subSequence(10,25));
		System.out.println("String reversed: " + toBeReversed.reverseOrder());
	}
}