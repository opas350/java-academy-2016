/*  Control Statements
Author: Javier Reyes
*/

class Exercise3 {

	public static void main(String[] args) {

		// From the Following code provice the correct ouput
		// int th = 0;				
		// int daf = 4;

		// The following for loop will execute until the termination condition is meet
		// or the loop is exited by a break in this case
		// for (int i=1; i<25;i++){ 
		// the th variable is using a prefix incrementor
		// 	th = ++th;
		// on the 4th loop the th value is incremented to 5 then the next if statement
		// causes a break on the loop terminating the for loop.
		// 	if(th > daf) 
		// 		break;
		// 	System.out.println("Fishing for hour "+ i);
		// }

		// the break stament makes the for loop terminate sooner than the i<25 condition 
		// the output is the following

		System.out.println("Problem 1 output:\n");
		System.out.println("Fishing for hour 1");
		System.out.println("Fishing for hour 2");
		System.out.println("Fishing for hour 3");
		System.out.println("Fishing for hour 4");


		//From following code, provide the correct output:
		/*int tdc = 0;
		int daf = 5;
		// For loop for the 7 days of the week
		for (int i=1; i<8; ++i){
			// Display the day corresponing to the iteration
			System.out.println("\nDay "+ i + ": camping");
			tdc = ++tdc;
			// on day 6 and 7 the if statement skips the "and Fishing" for the weekend
			if(tdc > daf)
				continue;
			System.out.println("and Fishing");
		}*/

		System.out.println("\nProblem 2 output:\n");
		System.out.println("Day 1: camping");
		System.out.println("and Fishing");
		System.out.println("Day 2: camping");
		System.out.println("and Fishing");
		System.out.println("Day 3: camping");
		System.out.println("and Fishing");
		System.out.println("Day 4: camping");
		System.out.println("and Fishing");
		System.out.println("Day 5: camping");
		System.out.println("and Fishing");
		System.out.println("Day 6: camping");
		System.out.println("Day 7: camping");

		// Decode a code with a return stament
		int r;
		r = sum(3); // 3 + 3 = 6
		System.out.println("\nProblem 3\nUsing the return stament");
		System.out.println("sum(3) = 3 + 3 = " + r);


		//What is the value of b at the end of this code:
		/*foo () {
		int b = 1;	// each time the function is used b = 1
		b++;		// at the end b = 2, but there is no return
		}*/

		System.out.println("\nProblem 4");
		System.out.println("b = 2");
	}

	//method used for the return stament problem
	public static int sum(int a) {
			return a + a;
		}
}