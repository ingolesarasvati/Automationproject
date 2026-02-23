package assignments;

/*
 WAP using this calling statement
 */

public class AS_35_ThisCallingStatement {
	AS_35_ThisCallingStatement(int a) {
		System.out.println("Constructor 1");
	}

	AS_35_ThisCallingStatement(String name) {
		this(50);
		System.out.println("Constructor 2");
	}

	AS_35_ThisCallingStatement(char geneder) {
		this("MKT");
		System.out.println("Constructor 3");
	}

	public static void main(String[] args) {
		new AS_35_ThisCallingStatement('M');

	}

}
