package assignments;

import java.util.Scanner;

/* 
 WAP for Addition, Multiplication, Division and Subtraction, modulus WIth the help of Scanner class
 */

public class AS_24_ScannerProgram {
	static int a = 0;
	static int b = 0;

	static void add() {
		System.out.println("Addition: " + (a + b));

	}

	static void subtract() {
		System.out.println("Subtraction: " + (a - b));

	}

	static void multiply() {
		System.out.println("Multiplication : " + (a * b));

	}

	static void division() {
		System.out.println("Division: " + (a / b));

	}

	static void modulus() {
		System.out.println("Modulus: " + (a % b));

	}

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter two values");

		a = s1.nextInt();
		b = s1.nextInt();
		
		add();
		subtract();
		multiply();
		division();
		modulus();

	}

}
