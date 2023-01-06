package Multithread;

public class Demo extends Thread {    // thread created by using THREAD class
	
	public void run() {
		System.out.println(" This is new thread running ");
	}
	
	public static void main(String[] args) {
		Demo obj= new Demo();
		
		obj.start();

	}

}
