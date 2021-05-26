package CodingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.stream.DoubleStream;
public class Practise {
	public static void eachlatterreeatednumberoftimes(String str) {
		Map<String,Integer> map= new HashMap<String, Integer>();
		for(int i=0;i<str.length();i++) {
		if(map.containsKey(str.charAt(i)+"".trim())) {
			map.put(str.charAt(i)+"".trim(),map.get(str.charAt(i)+"".trim())+1);
		}
		else {
			map.put(str.charAt(i)+"".trim(),1);
		}
	}
		for(Entry<String, Integer> value:map.entrySet()){
			System.out.println(value.getKey()+":"+value.getValue());
			
		}
	}
	
	public static void eachlatterreeatednumberoftimesusingchar(String str) {
		int count;
		char c='0';
		for(int i=0;i<str.length()-1;i++) {
			count=1;
			for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				str.replace(str.charAt(i), c);
			}
		}
			if((str.charAt(i))!='0') {
				System.out.println(str.charAt(i)+":"+count);
		}
		}
	}
	
	public static void maximumOccurences(String str) {
		int min=0,count;
		char c='x';
		for(int i=0;i<str.length()-1;i++) {
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(min<count) {
				min=count;
				c=str.charAt(i);
			}

		}
		System.out.println(c+" :maximum occurences: "+min);
	}

	public static void ramdomnumber() {
		Random ram= new Random();
		int number= (int) ((ram.nextDouble())*1000000);
		System.out.println("Ramdom Number is:"+ number);
	}
	
	public static void removeallduplicatefromstring(String str) {
		boolean flag = false;
		StringBuffer str1 = null;
		int i=0;
		for( i=0;i<str.length()-1;i++) {
			flag=false;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					str.replace(str.charAt(j), '0');
					flag=true;
				}
			}
			if(!flag) {
				System.out.println(str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eachlatterreeatednumberoftimes("my name is mogalaiah");
		eachlatterreeatednumberoftimesusingchar("my name is mogalaiah");
		ramdomnumber();
		maximumOccurences("mynameismogalaiah");
		removeallduplicatefromstring("mynameismogalaiah");
	}

}
