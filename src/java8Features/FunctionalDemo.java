package java8Features;


@FunctionalInterface 
interface  DemoFI{           // only one abstract method, any number of default methods and static methods
	public void methodA();   // ABSTRACT METHOD  (nobody)

	}
	

class A implements DemoFI{     // class A is implementation class for DemoFI Functional interface 
	public void methodA() {
		System.out.println(" Method is implemented by child class");
	}
}

public class FunctionalDemo {

	public static void main(String[] args) {
		
		A obj= new A();//child class  object creation 
		DemoFI  refvar = new A();    // parent interface reference variable created for child class objecct 
		
		obj.methodA();
		refvar.methodA();

	}

}
