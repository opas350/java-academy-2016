/* Class for the interface example problem
author: Javier Reyes
*/

public class InterfaceExample implements CharSequence {

	private String workingString;

	// Default contructor
	InterfaceExample() {
		this.workingString = ""; // empty string
	}

	// Overload contructor
	InterfaceExample(String workingString) {
		this.workingString = workingString;
	}

	// methods
	@Override
	public char charAt(int index) { return workingString.charAt(index); }

	@Override 
	public int length() { return workingString.length(); }

	@Override
	public CharSequence subSequence(int start, int end) { return workingString.substring(start,end); } // substring part of StringBuffer

	public String reverseOrder() { 

	// using StringBuffer reverse method the input stream can be easily reversed
		StringBuffer reversedString = new StringBuffer(this.workingString);
		reversedString.reverse();
		return reversedString.toString();
	}

}