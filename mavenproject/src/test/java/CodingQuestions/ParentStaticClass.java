package CodingQuestions;

public class ParentStaticClass {
	static int a=10;
	int b=10;
	static {
		System.out.println("Static Block Executed");
	}
	
	public static void m1() {
		System.out.println("Static method is executed");
	}
	
	public void m2() {
		System.out.println("Class Method is executed");
	}

}
