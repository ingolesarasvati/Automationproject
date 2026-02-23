package assignments;

/*	
 WAP to check person can vote only if he/she is 18 or above
and should not vote if age is less.
 */
public class AS_07_PersonCanVoteUsingIfBlock {

	public static void main(String[] args) {
		int age = 25;

		if (age >= 18) {

			System.out.println("Person can vote");
		}
		else {
			System.out.println("Person cann't vote");
		}
	}

}
