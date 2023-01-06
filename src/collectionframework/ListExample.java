package collectionframework;

import java.util.*;

public class ListExample {

	public static void main(String args[]) {

		// Creating a List

		List<String> list = new ArrayList<String>();

		// Adding elements in the List
		list.add("grapes");
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
	

		// Iterating the List element using for-each loop
		for (String fruit : list)
			System.out.println(fruit);
		System.out.println(list.get(0));
		list.removeAll(list);
		System.out.println(" after remove all method " +list);

	}
}