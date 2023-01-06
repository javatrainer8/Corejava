package overriding;


public class Audi extends Car{  // HAS a relation 
	 // can call ..start, stop, fuel,  engine methods 
	
	public void start() {   // parent class methods 
		System.out.println(" start method from child class AUDI ");
	}
	public void stop() {   // parent class Car methods
		System.out.println(" stop method from child class AUDI ");
	}
 public void engine() {    // parent class
	 System.out.println(" engine method overridden from AUDI  ");
 }

}
