package threads;

class ThreadClassDemo extends Thread { // inheriting Thread class 
 
	private int number; // created a variable number

 public ThreadClassDemo(int number) {    //class constructor with one parameter 
    this.number = number;  // referring current class variable  
 }
 
 
 public void run() {     //overriding run method -- execution code for thread
    int counter = 0;
    int numInt = 2;
    //prints the number till specified number is reached, starting from 0
    do {
       numInt = counter;
       
       System.out.println(this.getName() + " prints " + numInt); // 1 2 3 4 5 and so on
       counter++; // increasing by one
    } 
    while(numInt != number); // 1 != 15  until it reaches 15 number 
    System.out.println("lets print " + this.getName() + "     printed " + counter + " times.");
        //  lets print Thread name printed  times
 }
}








public class MultiThread {

	public static void main(String [] args) {
   
		System.out.println("Starting thread-1...");
        
		Thread thread_1 = new ThreadClassDemo(15);  //create a thread class object for Thread 1
    
        thread_1.start();  //calling start method of  Thread class
 	
     System.out.println("Starting thread-2...");
     
     Thread thread_2 = new ThreadClassDemo(20);
         
    thread_2.start();  //start thread_2 
   
 }
}