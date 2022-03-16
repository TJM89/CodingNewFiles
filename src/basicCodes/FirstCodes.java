
package basicCodes;

import java.util.Scanner;

public class FirstCodes {

	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 4;

		int multiply = num1 * num2;

		System.out.println("Multiplication is " + multiply);

		// if condition - if there is snow, take boots, else take slippers

		boolean isSnowing = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIs it snowing outside ? - write True or False");
		isSnowing = sc.nextBoolean();

		if (!isSnowing) {
			System.out.println("Wear the slippers");
		} else {
			System.out.println("Wear the boots");
		}

		// if condition - if there is gas, use the car, else take the bus 
		/*I entered yes to see the output and got the exception called
		 * inputMismatchException scanner input was entered wrong hence the error -
		 * point for interview
		 */

		boolean isGasAvailable = true;
		System.out.println("\nIs there gas in your car?");
		isGasAvailable = sc.nextBoolean();

		if (isGasAvailable) {
			System.out.println("Take the car for drive");
		} else {
			System.out.println("Use the bus");
		}

		// using elseif conditions // find out the tallest of 3 people

		int enterHeight;
		System.out.println("\nEnter your height:");
		enterHeight = sc.nextInt();
		if (enterHeight <= 100) {
			System.out.println("You are short..");
		} else if (enterHeight >= 150 && enterHeight <= 180) {
			System.out.println("You have average height");

		} else {
			System.out.println("You are a tall person!");
		}

		
		
		
	}
}
