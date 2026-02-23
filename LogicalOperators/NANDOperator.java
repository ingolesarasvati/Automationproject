package LogicalOperators;

public class NANDOperator {

	public static void main(String[] args) {
		 int age=21;
		 char gender='M';
		 
		 if(!(age>=18 && gender=='M')){
				 
			 System.out.println("You are eligible for Racing ");
		 }
		 
		 if(!(age>=18 || gender=='F')){
			 
			 System.out.println("You are eligible for Racing");
		 }
		 
	}

}
