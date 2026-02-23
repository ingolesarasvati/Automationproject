package LogicalOperators;

public class AND_OR_Operator {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 30;

		if (((a > 15 || b == c) || c == 30) && b != c) {

			System.out.println("Conditional Statement 1");
		}

		if ((a > 15 || b == c) && c == 30) {

			System.out.println("Conditional Statement 2");
		}

	}

}
