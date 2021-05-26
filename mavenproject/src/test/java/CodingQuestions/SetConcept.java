package CodingQuestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {
	static HashSet<String> set=new HashSet<>();

	public static void addsetItems() {
		set.add("Mango");// Adding object in arrayset
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
	}

	public static void getsetItems() {
		Iterator itr = set.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}

	}

	public static void removesetItems() {
		System.out.println("Removed Elemet From set: " + set.remove("Apple"));
	}

	public static void removeAll() {
		System.out.println("Removed All the Elements from set: "+set.removeAll(set));
	}
	
	public static void clearset() {
		set.clear();
		System.out.println("set is cleared: "+set.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addsetItems();
		getsetItems();
		//sortsetItems();
		removesetItems();
		System.out.println("After Remove The Element from set below are the Elements: ");
		getsetItems();
		removeAll();
		clearset();
	}

}
