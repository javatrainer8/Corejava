package Typecasting;

class  Parent{  
	   
	void PrintData() {                                         // parent class method
	      System.out.println("method of parent class");  
	   }  
	}  
	

	class Child extends Parent {  
	   void PrintData() {                                       // child class method 
	      System.out.println("method of child class");  
	   }  
	}  
	
		
	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
	      Parent obj1 =  (Parent)new Child();  
	      Parent obj2 = (Parent) new Child();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	   }  
	}  
