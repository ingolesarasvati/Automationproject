package assignments;

import java.util.Arrays;
import java.util.Scanner;

/*
WAP to demonstrate Exception Handling using try-catch block
 */
public class AS_64_ExceptiongHandlingUsingTryCatchBlock{
	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter size of array");
			int age[] = new int[s1.nextInt()];
			age[0] = 41;
			age[1] = 41;
			age[2] = 41;
			System.out.println(Arrays.toString(age));
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("Handled the exception 1");
		} catch (NegativeArraySizeException a2) {
			System.out.println("Handled the exception 2");
		}

	}

}
