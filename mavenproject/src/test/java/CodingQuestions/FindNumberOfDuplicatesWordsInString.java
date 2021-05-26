package CodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfDuplicatesWordsInString {
	static HashMap<String, Integer> map = new HashMap<>();
	
	public static void dublicatecount(String str) {
	//	char[] arr = str.toCharArray();
		String[] arr = str.split(" ");
		for(String str1:arr) {
			if(map.containsKey(str1)) {
				map.put(str1, map.get(str1)+1);
			}
			else {
				map.put(str1, 1);
			}
			
		}
		
	}
	
	public static void getCountValue() {
		for(Map.Entry<String, Integer> ele: map.entrySet()) {
			System.out.println(ele.getKey()+" : "+ele.getValue());
		}
	}
	
	public static void getDublicateKeyAndValues() {
		for(Map.Entry<String, Integer> ele: map.entrySet()) {
			if(ele.getValue()>1) {
			System.out.println(ele.getKey()+" : "+ele.getValue());
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi Team My Name Is Mogalaiah Gannepaka I have Good Knowledge On Java C# and BigData My Name Is Not In the Correct Formate";
		dublicatecount(str);
		getCountValue();
		getDublicateKeyAndValues();

	}

}
