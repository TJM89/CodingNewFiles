package basicCodes;

import java.util.Scanner;

public class NestedIF {

	public static void main(String[] args) {

		// nested if program to check if a person aged 18 or more is eligible to get booster dose of vaccine

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input age : ");
		int age = sc.nextInt();

		boolean personIsEligible = false;
		// ! means if the option is the opposite of the default boolean value, in the below case, true
		if (!personIsEligible) {
			if (age >= 18 && age<=100) {
				System.out.println("You can take the booster dose");
			} else {
				System.out.println("You cannot take the booster dose now");
			}

		}
	}
}
