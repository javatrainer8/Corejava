package threads;
// creating a thread by using Runnable interface 

class RunnableThread implements Runnable{ // implementing Runnable interface which in Thread class  
	  
	public void run(){  //  run method of Thread class // overriding 'run' method 
	    System.out.println("My thread is in running state.");  
	  }   
	  public static void main(String args[]){  
		  
		  RunnableThread obj=new RunnableThread();  // object  for our class 'RunnableThread'
	     Thread tobj = new Thread(obj);    // object for Thread class
	     tobj.start();  // calling start method 
	 }  
	}

