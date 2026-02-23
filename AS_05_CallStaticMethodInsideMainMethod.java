package assignments;

/*
 Call Static Methods inside the main method
 */
public class AS_05_CallStaticMethodInsideMainMethod {
	
	static void m1() {
		System.out.println("Static method");
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method ");
		
		m1();      //Static method 
 
	}

}
