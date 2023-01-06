package collectionframework;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList<String> sports = new LinkedList<>(); // create a linked list

		sports.add("fggdfdfhfgh");
		sports.add("cricket"); // adding values to linkedlist by using add () method
		sports.add("Tennis");
		sports.add("kabbaddi");

		System.out.println(" ALL FAMOUS GAMES    :" + sports);

		sports.add(0, "kho-kho"); // adding in the middle of linked list
		System.out.println(" See the Change of element    :" + sports);

		// adding at the end

		sports.addLast("Carrom");
		System.out.println(" Added by using addLast method : " + sports);

		// retrieved from the list
		String o = sports.get(5);
		System.out.println("  Retrieveing  from  5 index   : " + o);

	}
}
