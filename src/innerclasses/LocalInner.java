package innerclasses;

public class LocalInner{  
	 private int data=30;//instance variable  
	 void display(){      // method declaration
	  
	class Local{    // local inner class inside the method 
	   void msg(){System.out.println(data);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  LocalInner obj=new LocalInner();  
	  obj.display();  
	 }  
	}  
