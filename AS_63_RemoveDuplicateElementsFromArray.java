package assignments;

import java.util.LinkedHashSet;
import java.util.Set;

/*
WAP to remove duplicate elements from an array
 */
public class AS_63_RemoveDuplicateElementsFromArray {
	public static void main(String[] args) {
		int arr[] = new int[7];

		arr[0] = 15;
		arr[1] = 45;
		arr[2] = 10;
		arr[3] = 15;
		arr[4] = 12;
		arr[5] = 15;
		arr[6] = 12;

		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);

		}
		for (Integer arrr : s) {
			System.out.println(arrr);

		}
	}
}
