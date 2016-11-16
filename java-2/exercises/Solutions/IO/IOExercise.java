/* 
	Exercise 1 of IO
	Author: Javier Reyes
 */

// 1.-Write an example that counts the number of times a particular character, 
// such as e, appears in a file. The character can be specified at the command line.


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExercise {

	public static void main(String[] args) {

		char charToBeFound = args[0].charAt(0); // uses the character specified at cmd line
		int counterOfFound = 0;	// initialize the counter to 0
		boolean filefound = true;

		FileReader reader = null;  // Declare the Filereader

		File fp = new File("InputText.txt").getAbsoluteFile(); // get the path for the input file 

		// First Try-catch block
		try {
			String path = fp.getAbsolutePath();	
			//System.out.println(path);  // debug output

			reader = new FileReader(path);
			
			// Using try with resources (Java8)
			try (BufferedReader buffReader= new BufferedReader(reader)) {
				
				String lineRead;	// String variable to use while reading
				// While loop to read the file
				while( (lineRead = buffReader.readLine()) != null) {
					for(char letter : lineRead.toCharArray()) {
						if(letter == charToBeFound )
							counterOfFound++;  // if char is found the counter increments
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch(FileNotFoundException e) {
			System.out.println("File not found, verify that the file exist on the following path:");
			System.out.println(fp.getAbsolutePath());
			filefound = false;
			
		}
		// if the file was found the program will show the following output
		if(filefound){
		System.out.print("The char " + charToBeFound + " appeared " + counterOfFound + " times");
		System.out.print(" on file " + fp.getName());
		}
	}
}

