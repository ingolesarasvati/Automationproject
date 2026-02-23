package assignments;

import java.util.Scanner;

/*WAP to find circumference of circle, triangle and Square and Rectangle with help of Scanner class
 */
public class AS_26_CircumferenceOfCircle_Triangle_Square_Rectangle {
	 static double r;static double b;
		static double a;static double c;
		static double l;
		static void CircumferenceOfCircle() {
			double CircumferenceOfCircle =2* Math.PI * r;
			System.out.println("CircumferenceOfCircle: " + CircumferenceOfCircle);
		}
		static void CircumferenceOfTriangle() {
			double CircumferenceOfTriangle =a+b+c;
			System.out.println("CircumferenceOfTriangle: " + CircumferenceOfTriangle);
		}
		static void CircumferenceOfSquare() {
			double CircumferenceOfSquare = 4* a;
			System.out.println("CircumferenceOfSquare: " + CircumferenceOfSquare);
		}
		static void CircumferenceOfRectangle() {
			double CircumferenceOfRectangle = 2*(l + b);
			System.out.println("CircumferenceOfRectangle: " + CircumferenceOfRectangle);
		}
		public static void main(String[] args) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter value of r");
			System.out.println("Enter value of b");
			System.out.println("Enter value of c");
			System.out.println("Enter value of a");
			System.out.println("Enter value of l");
            r = s1.nextDouble();
			b = s1.nextDouble();
			c = s1.nextDouble();
			a = s1.nextDouble();
			l = s1.nextDouble();
			CircumferenceOfCircle();
			CircumferenceOfTriangle();
			CircumferenceOfSquare();
			CircumferenceOfRectangle();


}}
