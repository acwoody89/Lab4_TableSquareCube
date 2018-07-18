import java.util.Scanner;

/*
 * @author Alex Wood
 * @date 7/18/2018
 * @pair Julia and Michelle
 */
public class TableSquareCube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		String cont = "y";
		int userInput = 0;

		/*
		 * has the user input a number, any higher than specified breaks the program
		 */
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("*****************************************");
			System.out.println("Please enter a number from 1 to 99999999");
			userInput = scan.nextInt();
			System.out.println("*****************************************");
			
			/*
			 * here is the column spacing, justifying to the left, so the output is to
			 * the right of the variables
			 */
			if (userInput >= 1) {
				System.out.printf("%-15.30s  %-15.30s  %-15.30s%n", "Number", "Square", "Cube");
				System.out.printf("%-15.30s  %-15.30s  %-15.30s%n", "******", "******", "******");
				
				mathStuff(userInput); // calls the mathStuff method I created
				
				System.out.println("*****************************************");

			}
			else {
				System.out.println("Invalid Entry");
				System.out.println("*****************************************");
			}
			System.out.println("Continue? y/n");
			cont = scan.next();
		}

		System.out.println("Goodbye");
		scan.close();

	}

	public static void mathStuff(int a) {
		int square = 0;
		int cube = 0;
		int input = a;
		
		/*
		 * this loop starts at 1, and then would loop a total of whatever was inputed by
		 * the user 
		 */
		for (int i = 1; i <= input; i++) {
			square = (int) Math.pow(i, 2);  // raises the input to the power of 2
			cube = (int) Math.pow(i, 3);	// raises the input to the power of 3
			System.out.printf("%-15s  %-15s  %s%n", i, square, cube);
		}
	}

}
