package CodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class openText {
	
	public static void shortforms() {
	String str="Baba Saheb Ambedkar Hospital";
	String str2="";
	String[] split=str.split(" ");
	for(int i=0;i<split.length;i++) {
		if(!(i==(split.length-1))) {
			str2=str2+split[i].charAt(0)+".";
		}
		else {
			str2=str2+split[i];
		}
	}
	System.out.println(str2);
	}
	
	public static void mapfun() {
		HashMap<Integer,String> mapobj= new HashMap<Integer, String>();
		mapobj.put(1,"Mogalaiah");
		mapobj.put(2,"Venkat");
		mapobj.put(3,"Shekhar");
		for(Map.Entry<Integer,String> value: mapobj.entrySet()) {
			System.out.println("Value is: "+ value.getValue()+"key is: "+value.getKey());
		}
		
	}
	
	public static void removeduplicatesfromstring() {
		String str = "aabscs";
		String str2="";
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c:set) {
			str2=str2+c;
		}
		System.out.println(str2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shortforms();
		mapfun();
		removeduplicatesfromstring();
	}

}

//
