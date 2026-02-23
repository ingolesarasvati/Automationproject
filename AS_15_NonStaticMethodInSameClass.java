package assignments;

/*
 WAP for calling NonStatic method inside the same class
 */
public class AS_15_NonStaticMethodInSameClass {
	static void add() {
		System.out.println("Addition");
		
	}
	
	
	void sub() {
		
		System.out.println("Subtraction");
	}
	
	public static void main(String[] args) {
		add();
		
		AS_15_NonStaticMethodInSameClass t= new AS_15_NonStaticMethodInSameClass();
		
		t.sub();
	}

}
