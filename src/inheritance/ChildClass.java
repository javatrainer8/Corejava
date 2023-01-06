package inheritance;

public class ChildClass extends ParentClass {

	public void method2() {
		System.out.println(" This is my own method... child method ");
	}
	public static void main(String[] args) {
		
		// create an object
		ParentClass xyz = new ParentClass();  // object is created 
          // xyz.method1();  // calling with parent class object  
	
		ChildClass abc = new ChildClass();  // child class object created 
		//abc.method1();  ///Calling parent class method by using child class object 
		 abc.method2();// calling child class method by child class object  
		
		
		
	}

}
