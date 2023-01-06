package Abstraction;

public  abstract class Bank {	              // atleast one method should be abstract in nature ( abstract method  -- no body)
	
		public abstract void loan(); 
		                                      // this is abstract method  -- only declaration no body
		
	public void credit() {                    // this is non abstract method 
		System.out.println("   this is parent credit method ");
	}
			
	public void debit() {                     // this is non abstract method 
			System.out.println("  this is parent debit method ");
		
					
			
		// this is partial abstraction because this abstract class has one abstract method and two non abstract methods
			// abstraction means hiding the implementation logic 
		// so abstract class can give partial abstration 
			// object cannot be created for abstract class and interface 
	}

}
