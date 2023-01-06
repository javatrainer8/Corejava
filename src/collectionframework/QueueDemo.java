package collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
    	
        // Create and initialize a Queue using a LinkedList
        Queue<String> elementQueue = new LinkedList<>();
        
        // Adding new elements to the Queue (The Enqueue operation)   
        elementQueue.add("element1");
        elementQueue.add("element2");
        elementQueue.add("element3");
        elementQueue.add("element4");


        System.out.println("WaitingQueue : " + elementQueue);

	       
		  // Removing an element from the Queue using remove() (The Dequeue operation)
		String name = elementQueue.remove(); // removes the first element
		 System.out.println("Removed from WaitingQueue : " + name + " ,,,,,| New WaitingQueue : " + elementQueue);
		  
		 
		 // The poll() method is similar to remove() except that it returns null if		 the Queue is empty. 
		//  name = elementQueue.poll();
		// System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + elementQueue);
		
    }
}