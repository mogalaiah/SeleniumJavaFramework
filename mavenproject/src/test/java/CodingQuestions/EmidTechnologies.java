package CodingQuestions;

public class EmidTechnologies {
	int a;
	int b;
	public EmidTechnologies(){
		System.out.println("sum of two values is: "+ (a+b));
	}
	public EmidTechnologies(int c, int d){
		a=c;
		b=d;
		System.out.println(("sum of two values is: ")+ (a+b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow mogalaiah main method is executed");
		EmidTechnologies obj= new EmidTechnologies();
		System.out.println(obj.a+" and "+ obj.b);
		EmidTechnologies obj1= new EmidTechnologies(10,20);
		System.out.println(obj1.a+" and "+ obj1.b);
	}

}
