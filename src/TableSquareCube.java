import java.util.Scanner;

/*
 * @author Alex Wood
 * @date 7/18/2018
 * @pair Julia and Michelle
 */
public class TableSquareCube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// setting an initial condition that will be true so the while loop will
		// execute at least one time.
		String cont = "y";
		int userInput = 0;

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("*****************************************");
			System.out.println("Please enter a number from 1 to 99999999");
			//System.out.println("*****************************************");
			userInput = scan.nextInt();
			System.out.println("*****************************************");
			
			if (userInput >= 1) {
				System.out.printf("%-15.30s  %-15.30s  %-15.30s%n", "Number", "Square", "Cube");
				System.out.printf("%-15.30s  %-15.30s  %-15.30s%n", "******", "******", "******");
				
				mathStuff(userInput);
				
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

		for (int i = 1; i <= input; i++) {
			square = (int) Math.pow(i, 2);
			cube = (int) Math.pow(i, 3);
			System.out.printf("%-15s  %-15s  %s%n", i, square, cube);
			// System.out.println(cube);
		}
	}

}
