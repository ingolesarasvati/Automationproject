package assignments;
/*
WAP using super calling statement
 */

class Amazon_GParent {
	Amazon_GParent() {
		System.out.println("Statement 3");
	}
}

class Amazon_Parent extends Amazon_GParent {
	Amazon_Parent(int a) {
		super();

		System.out.println("Statement 1");
	}
}

public class AS_34_SuperCallingStatement_AmazonChild extends Amazon_Parent {
	AS_34_SuperCallingStatement_AmazonChild() {
		super(100);
		System.out.println("Statement 2");

	}

	public static void main(String[] args) {
		new AS_34_SuperCallingStatement_AmazonChild();

	}

}
