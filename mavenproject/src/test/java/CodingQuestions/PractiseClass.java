package CodingQuestions;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class PractiseClass {
	
	public static void sortbinarynumbers() {
		int a[] = {1,0,1,0,0,0,0,1,1,1,1,0};
		int temp;
		int j=-1;
		for(int i=0;i<a.length-1;i++) {
				if(a[i]<1) {
					j++;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void decimalToBinary(int n) {
		int a[] = new int[10];
		int i=0;
		int rem;
		while(n>0) {
		rem=n%2;
		a[i++]=rem;
		n=n/2;
		}
		for(int j=a.length-1;j>=0;j--) {
			System.out.println(a[j]);
		}
	}
	
	public static void binaryToDecimal(int n) {
		int rem=0,i=0;
		double dec=0;
		while(n>0) {
			rem= n%10;
			n=n/10;
			dec= dec+ rem* Math.pow(2,i);
			++i;
		}
System.out.println("Decimal Number is: "+ dec);
	}
	

	public static void reversewordsnotstatement() {
		String a="My name is mogalaiah";
		String[] spilt= a.split(" ");
		String rev="";
		for(String word:spilt) {
			StringBuffer str= new StringBuffer(word);
			rev=rev+" "+str.reverse();
		}
		System.out.println("Reverse words is:"+rev);
	}
	
	public static void duplicatevalues(String str) {
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}
		}
		for(Map.Entry<Character, Integer>value:map.entrySet()) {
			System.out.println("Key is: "+value.getKey()+" Value is: "+value.getValue());
		}
		
	}
	
	public static void missingnumberfromNnumbers(int n) {
		int a[]= {1,2,3,4,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Missing Number is: "+((n*(n+1))/2-sum));
	}
	
	public static void NonRepeatedValue() {
		int a[]= {1,1,3,3,6,6,7,9,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum^a[i];
		}
		System.out.println("Non-Repeated Number is: "+sum);
	}
	
	public static void SpecialCharecterInString() {
			String str="Mogalaiah$%^&*()))@#$";
			for(int i=0;i<str.length();i++) {
				char c= str.charAt(i);
				int value= (int)c;
				if(33<=value && value<=64) {
					System.out.println("Special Charecter is: "+ str.charAt(i));
				}
			}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SubClass obj= new SubClass();
		//new ParentClass();
		/*
		 * AbstractClass obj= new ParentClass(); obj.sum(2, 3); obj.substraction(3, 2);
		 * obj.multification(10, 5); obj.divition();
		 */
		//sortbinarynumbers();
		//reversewordsnotstatement();
		//duplicatevalues("My name is mogalaiah ganneaka from nellikal");
		//missingnumberfromNnumbers(10);
		//NonRepeatedValue();
		//decimalToBinary(10);
		//binaryToDecimal(1010);
		SpecialCharecterInString();
		
	}

}
