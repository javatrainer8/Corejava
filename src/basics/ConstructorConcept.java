package basics;

public class ConstructorConcept {  // constructor is not a method and it cannot return any value.. 
	                               // name should be same as class name ... 
	                                // two types constructors . default and parameterized constructor
                                   // constrcctor immediately called after creating the object 
	
		
	
	
	public  ConstructorConcept() {
		System.out.println(" default constructor ");
	}
	
		public ConstructorConcept(int i) {
		System.out.println(" single parameterized  constructor ");
		System.out.println(i);
	}
	
	
	
	public ConstructorConcept(double i, int j) {
		System.out.println(" double parametrized constructor ");
		System.out.println(i);
		System.out.println(j);
	}
	
	
	
	
	public static void main(String[] args) {  // constructor can be overloaded 
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20.22,30);
	
	}

}
