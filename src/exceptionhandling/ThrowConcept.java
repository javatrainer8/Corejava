package exceptionhandling;

public class ThrowConcept {
	
	static void voter(int age){     // created a method 
			
		
		
		
		if (age<21) {
		throw new ArithmeticException("   you are not eligible for Your vote.. this my exception ");
		    // user defined exception by using key word 'throw'	
		}
		else {
			System.out.println(" you can vote now ");
		}
		
	}

	public static void main(String[] args) {
		
		voter(24);   // user defined exception is going to execute
	}

	}


