package CodingQuestions;


public class IVY {

	public static void findthecharecters(String str) {
		int integercount=0;
		int charecterre=0;
		int specialchar=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)+"").matches("[0-9]")) {
				integercount++;
				
			}
			if((str.charAt(i)+"").matches("[A-Za-z]")) {
				charecterre++;
			}
			if((str.charAt(i)+"").matches("[#$@^&*]")) {
				specialchar++;
			}
		}
		System.out.println("interger count: "+ integercount);
		System.out.println("Charecter count: "+ charecterre);
		System.out.println("Secial count: "+ specialchar);
	}
	
	public static int fun(int n) {
		if(n==100)
			return 100;
		System.out.println((n));
		return fun(n+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findthecharecters("ABC123##$@^");
		//int a=fun(1);
		//System.out.println(a);

	}

}
