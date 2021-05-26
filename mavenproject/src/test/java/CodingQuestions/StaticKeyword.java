package CodingQuestions;

public class StaticKeyword extends ParentStaticClass{	
	
	public void m2() {
		System.out.println("Overried Method is Executed");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Is Executed");
		System.out.println("Static Variable a is: "+ ParentStaticClass.a);
		ParentStaticClass obj= new ParentStaticClass();
		obj.m2();

	}

}
