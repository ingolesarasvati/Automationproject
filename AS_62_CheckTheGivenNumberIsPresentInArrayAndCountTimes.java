package assignments;

import java.util.Arrays;

/*
 WAP to check if the given number is present in the array and count how many times
 */
public class AS_62_CheckTheGivenNumberIsPresentInArrayAndCountTimes {
	static int countofValue;
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 40, 90, 5 };

		int numberCheck = 5;

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numberCheck) {
				System.out.print("The given number is part of the Array, at the index position--->");
				System.out.println(i);
				countofValue++;
			}
		}
		System.out.println("Count of the value is repeated these many times--->"+countofValue);

	}

}
