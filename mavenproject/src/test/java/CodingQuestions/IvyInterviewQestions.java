package CodingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;

public class IvyInterviewQestions {
	public static void markscomparisionforStudents() {
		Map<String, Integer> stud1 = new HashMap<String, Integer>();
		Map<String, Integer> stud2 = new HashMap<String, Integer>();
		stud1.put("English", 70);
		stud1.put("Maths", 80);
		stud1.put("Social", 90);
		stud2.put("English", 70);
		stud2.put("Maths", 70);
		stud2.put("Social", 75);
		for (Entry<String, Integer> entry : stud1.entrySet()) {
			for (Entry<String, Integer> entry1 : stud2.entrySet()) {
				if (entry.getKey().equals(entry1.getKey())) {
					if (entry.getValue() > entry1.getValue()) {
						System.out.println("Student1 got better marks comated student2: " + entry.getKey());

					} else if (entry.getValue().equals(entry1.getValue())) {
						System.out.println("Student1 got same marks comated student2: " + entry1.getKey());

					} else {
						System.out.println("Student2 got bettter marks comated student1: " + entry1.getKey());
					}
				}
			}
		}
	
	}
	public static void wsordreverseforstring() {
		String str="my name is mogalaiah";
		String str2="";
		String[] spl= str.split(" ");
		for(String word:spl) {
			StringBuffer stb= new StringBuffer(word);
			str2= str2+" "+stb.reverse();
		}
		System.out.println(str2);
	}
	
	public static void stringlenthincreasedfindtherepeatedchar(int n) {
		String str= "AABBCC";
		int rem=n%(str.length());
		int quotent= n/(str.length());
		String str2=str;
		for(int i=0;i<n;i++) {			
			if(quotent>0) {
				str2= str2+str;
				i=i+str.length();
				quotent--;
			}
			else {
				str2=str2+str.substring(0, rem);
				i=i+str.length();
			}
		}
System.out.println("After updated string is: "+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//markscomparisionforStudents();
		//wsordreverseforstring();
		stringlenthincreasedfindtherepeatedchar(1);
		
		}

}