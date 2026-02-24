
public class AverageOfValuesPresentInArray {

	public static void main(String[] args) {
		double[] input = new double[4];

		input[0] = 14;
		input[1] = 16;
		input[2] = 19;
		input[3] = 10;

		double sum = 0;

		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];

		}

		double average = sum / input.length;

		System.out.println("Average of values  Present in the Array is : -->" + average);

	}

}
