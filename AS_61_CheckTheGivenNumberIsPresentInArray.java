package assignments;

import java.util.Arrays;

/*
 WAP to check if the given number is present in the array input[1,2,3,40,90,5]
  user input=5 Output=>the given number is present in the array
 */
public class AS_61_CheckTheGivenNumberIsPresentInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 40, 90, 5 };

		int numberCheck = 5;

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numberCheck) {
				System.out.print("The given number is part of the Array, at the index position--->");
				System.out.println(i);
			}
		}

	}

}
