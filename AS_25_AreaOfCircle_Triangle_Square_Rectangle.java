package assignments;
/*
 WAP to find area of circle, triangle and Square and Rectangle with help of Scanner class
 */

import java.util.Scanner;

public class AS_25_AreaOfCircle_Triangle_Square_Rectangle {
    static double r;static double b;
	static double h;static double a;
	static double l;
	static void areaOfCircle() {
		double areaOfCircle = Math.PI * r;
		System.out.println("areaOfCircle: " + areaOfCircle);
	}
	static void areaOfTriangle() {
		double areaOfTriangle = 0.5 * b * h;
		System.out.println("areaOfTriangle: " + areaOfTriangle);
	}
	static void areaOfSquare() {
		double areaOfSquare = a * a;
		System.out.println("areaOfSquare: " + areaOfSquare);
	}
	static void areaOfRectangle() {
		double areaOfRectangle = l * b;
		System.out.println("areaOfTriangle: " + areaOfRectangle);
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of r");
		System.out.println("Enter value of b");
		System.out.println("Enter value of h");
		System.out.println("Enter value of a");
		System.out.println("Enter value of l");

		r = s1.nextDouble();
		b = s1.nextDouble();
		h = s1.nextDouble();
		a = s1.nextDouble();
		l = s1.nextDouble();
		areaOfCircle();
		areaOfRectangle();
		areaOfSquare();
		areaOfTriangle();

	}
}
