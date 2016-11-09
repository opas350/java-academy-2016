/* Exercise 2
 * Variables and operators
 * Author: Javier Reyes
 *
 */

package exercises.java;

public class Exercise2 {

	// ------ How to declare primitive and non-primitive data type
	
		// primitive
	int x;
	float y;

		// Non-Primitive
	String word;
	int[] array1;
	

	// ------ Variables Scopes

	int variable1; // variable with class level scope

	public void method1() {
		int variable2; // method scope variable

		for(int i = 0; i < 10; i++){

			System.out.println(i); // i Loop level Scope

		}	
	}

	public static void main(String[] args) {

	// ------ Primitive Types

	byte prim1 = 10; 			// 8 bits
	short prim2 = 10;			// 16 bits
	int prim3 = 10000;			// 32 bits
	long prim4 = 100_000_000;	// 64 bits
	float primt5 = 10.0f;		// 32 bits
	double prim6 = 100.12345;	// 64 bits
	boolean prim7 = true;		//	binary value ( 1 or 0, true or false)
	char prim8 = 'X';			// Unicode

	// ------ Operators
	
		// Arithmetic Operators
		  // Simple mathematical operations
			// sum
	int sum = 2 + 2;
			// substract
	int subs = 2 - 1;
			// multiplication
	int mult = 2 * 2;
			// division
	float div = 2/1;
			// modulus/remainder
	int mod = 3%2;
			// increment operator
	sum++;
			// decrement operator
	subs--;

		// Relational and Logical Operators
		  // relational refers to the relationships that the variables can have with other variables,
		  //  logical refers to the true and false values in relation to the variable

			// relational
			boolean xb = true, yb = false; // variables to use
			int xi = 10, yi = 100;		   // in the examples
				// Equal to
			boolean EqualTo = (xb == yb);
				// not equal to
			boolean NotEqualTo = (xb != yb);
				// greater than
			boolean GreaterThan = (xi > yi);
				//greater than or equal
			boolean GreaterThanOrEqual = (xi >= yi);
				// less than
			boolean LessThan = (xi < yi);

			// Logical
				// Logic And (&&)
			boolean LogicAnd = ((xi>yi)&&(xi<yi));
				//Logic Or(||)
			boolean LogicOr = ((xi>yi)||(xi<yi));
				//Logic Not(!)
			boolean LogicNot = !xb;

		// Assignment Operator
				// Simple assigment
				int x1 = 10;
				int x2 = 10;
				int x3 = 10, x4 = 10;
				// chain assigment
				x2 = x3 = x4 = 20;
				// shorthand assigment
				x1 += 1; // same as xa = xa + 1;
				x1 -= 1; // same as xa = xa - 1;
				x2 *= 1; // xb = xb * 1;
				x2 /= 1; // xb = xb / 1;
				x3 %= 1; // xc = xc % 1;
				x3 &= 1; // bitwise and
				x4 |= 1; // bitwise or
				x4 ^= 1; // bitwise xor

		// Bitwise operators
		  // Operations that compare bit by bit
				int i = 10, j = 10;
				int bwvar;
				// Bitwise And
				bwvar = i & j;
				// Bitwise Or
				bwvar = i | j;
				// Bitwise Xor
				bwvar = i ^ j;
				// Signed left shift
				bwvar = i<<2;
				// Signed Right shift
				bwvar = i>>2;



	// ------ Strings
				String stringExample1 = new String("This is one way to create a string");
				String stringExample2 = "This is another way to create a string";
		// alsco can create a string from another string
				String stringExample3 = new String(stringExample2);

	// ------ Arrays
		// Creating the array and assign the size without giving inital values
				int[] arrayExample = new int[2]; 
		// the assigment of values can be as shown below
				arrayExample[0] = 1;
				arrayExample[1] = 2;
				arrayExample[2] = 3;

		// another way to create an array can be like this
				int[] arrayExample2;
				arrayExample2 = new int[2];

		// The array values and size can be declared in the same operation as follows

				int[] arrayExample3 = {1, 2, 3, 4};
			}
		}
	

