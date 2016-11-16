/* 
	Exercise 1 and 2 of IO
	Author: Javier Reyes
 */

// 1.-Write an example that counts the number of times a particular character, 
// such as e, appears in a file. The character can be specified at the command line.

// 2.-Create a new directory by using File object


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOExercise {

	public static void main(String[] args) {

		boolean correctInput = true; // variable to check if there were arguments
		
		// Try-Catch block that will offer help in case of no input arguments
		try {
			args[0].charAt(0); // uses the character specified at cmd line
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No input argument \nUsage: java IOExercise arg1");
			correctInput = false;
		}
		
		// Normal execution if the input arguments were valid
		if(correctInput) {
			char charToBeFound = args[0].charAt(0); // uses the character specified at cmd line
			int counterOfFound = 0;	// initialize the counter to 0
			boolean filefound = true;

			FileReader reader = null;  // Declare the Filereader

			File fp = new File("InputText.txt").getAbsoluteFile(); // get the path for the input file 
			File outputPath = new File("OutputText.txt").getAbsoluteFile(); // path for the output file for exercise 2
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

			// This part of the program correspond to the exercise2 
			// to create the file with the output a PrintWriter object will be used

			try (PrintWriter pWriter = new PrintWriter(new FileWriter(outputPath))){

				pWriter.println("The char " + charToBeFound + " appeared " + counterOfFound + " times");
				pWriter.println("on file " + fp.getName());
				System.out.println("\nFile " + outputPath.getName() + " was created");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

