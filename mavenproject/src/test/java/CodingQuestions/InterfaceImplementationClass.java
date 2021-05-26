package CodingQuestions;

public class InterfaceImplementationClass implements Interface1,Interface2{

	@Override
	public int div(int a, int b) {
		return a/b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;

	}

}
