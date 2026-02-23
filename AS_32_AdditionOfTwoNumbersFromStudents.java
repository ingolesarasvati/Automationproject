package assignments;

import java.util.Scanner;

/*
 WAP to do addition of 2 number from 10 student
means->10 student should use the same program to do addition.
10 student should use the same calculator
 */

public class AS_32_AdditionOfTwoNumbersFromStudents {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		System.out.println("This program will perform additiion of 10 sets of numbers");

		for (int i = 1; i <= 10; i++) {

			System.out.println("Student  " + i + "--");

			System.out.println("Enter the First number : ");
			int num1 = s1.nextInt();

			System.out.println("Enter the Second number : ");
			int num2 = s1.nextInt();
			int sum = num1 + num2;

			System.out.println("THE SUM OF " + num1 + " and " + num2 + " is :" + sum);

		}

	}

}
