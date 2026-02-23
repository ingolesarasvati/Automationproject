package assignments;

/*
 WAP for Update value for static and non static for Global Variables
 */
public class AS_21_UpdatingGlobalVariables
{

	int noOfDays = 365; // global variable-instance variable

	static int noOfHours = 24; // global variable

	static boolean answer;

	public static void main(String[] args) {
		answer = true;
		System.out.println(answer);

		noOfHours = 36;
		System.out.println(noOfHours);

		AS_21_UpdatingGlobalVariables v1 = new AS_21_UpdatingGlobalVariables();

		System.out.println(v1.noOfDays);
	}
}