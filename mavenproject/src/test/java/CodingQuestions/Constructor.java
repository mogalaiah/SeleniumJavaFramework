package CodingQuestions;

public class Constructor {
	int a=30;
	int b=40;
	public Constructor(){
		System.out.println("default constuctor sum of two values is: "+ (a+b));
	}
	public Constructor(int c, int d){
		this.a=c;
		this.b=d;
		System.out.println(("sum of two values is: ")+ (a+b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow mogalaiah main method is executed");
		Constructor obj= new Constructor();
		System.out.println(obj.a+" and "+ obj.b);
		Constructor obj1= new Constructor(10,20);
		System.out.println(obj1.a+" and "+ obj1.b);
	}

}
