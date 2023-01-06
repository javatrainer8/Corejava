package threads;
// creating a Thread 
class SingleThread extends Thread{  // inheriting  Thread class ...
	  public void run(){            // overriding ''run'' method which is in Runnable interface 
	    System.out.println(" Ok Thread is running  ..........");  
	  }   
	  
	  public static void main(String args[]){  
	  
		  SingleThread obj=new SingleThread();  //object  
	     
		  obj.start();   // calling thread class method  '' start'' 
	  }  
	}
