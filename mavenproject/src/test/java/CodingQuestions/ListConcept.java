package CodingQuestions;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ListConcept {
	static ArrayList<String> list = new ArrayList<String>();

	public static void addListItems() {
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
	}

	public static void getListItems() {
		Iterator itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}

	}

	public static void removeListItems() {
		System.out.println("Removed Elemet From List: " + list.remove(0));

	}

	public static void sortListItems() {
		Collections.sort(list);
		System.out.println("After sorting: " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addListItems();
		getListItems();
		removeListItems();
		System.out.println("After Remove The Element from List below are the Elements: ");
		getListItems();

	}

}
