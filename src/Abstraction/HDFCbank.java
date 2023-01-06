package Abstraction;

public class HDFCbank extends Bank {   // bank is abstract class so...
	                                    //HDFC bank should implemented abstract methods of Bank abstract class (abstract loan mehtod)
	              
	public void loan() {
		System.out.println( " abstract method from parent  is overriden by child class ");
	}
	
}
