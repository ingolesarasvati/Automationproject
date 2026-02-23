package assignments;

/*
 WAP for Inheritance concept using extends keyword.
 */
class Test {

	static void logIn() {
		System.out.println("Able to login to application");
	}

	static void logOut() {
		System.out.println("Able to logOut from application");
	}
}

public class AS_33_InheritanceUsingExtendsKeyword extends Test {
	public static void main(String[] args) {

		logIn();
		logOut();

	}

}
