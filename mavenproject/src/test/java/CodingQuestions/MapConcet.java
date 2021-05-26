package CodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class MapConcet {
	static HashMap<String, Integer> map = new HashMap<>();

	public static void putMapValues() {
		map.put("Mogalaiah", 100);
		map.put("Samrat", 101);
		map.put("Venkat", 102);
		map.put("Mangamma", 103);
		map.put("Tirupathamma", 104);
		System.out.println("Map Elements: " + map.entrySet());

	}

	public static void getMapValues() {
		for (Map.Entry<String, Integer> str : map.entrySet()) {
			System.out.println(str.getKey() + " Corresponding Value is :" + str.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		putMapValues();
		getMapValues();

	}

}
