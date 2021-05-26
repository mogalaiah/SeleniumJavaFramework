package CodingQuestions;

public class MainClass {
	
	public void main() {
		System.out.println("Main Class Method is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj1 = new BaseClass();
		obj1.m1();
		BaseClass obj4 = new BaseClass();
		obj4.m1(10);
		SubClass obj2 = new SubClass();
		obj2.m1();
		MainClass obj3= new MainClass();
		obj3.main();
		//main();
		InterfaceImplementationClass obj5 = new InterfaceImplementationClass();
		System.out.println("Entering First Number is: "+10+" Second Number is: "+20);
		System.out.println("Sum Of Two Numbers is: "+ obj5.sum(10,20));
		System.out.println("Sub Of Two Numbers is: "+ obj5.sub(10,20));
		System.out.println("Mult Of Two Numbers is: "+ obj5.mul(10,20));
		System.out.println("div Of Two Numbers is: "+ obj5.div(10,20));
	}

}
