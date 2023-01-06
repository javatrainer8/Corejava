
public class ThrowException {
	
	static int sum (int a, int b) {
		if (a <=9)
	throw new ArithmeticException ("Your balance toooo low, can't able to withdraw ");
		// user defined exception 
		else System.out.println(" Eligible to withdraw ");
		return a+b;  
		
		
	}

	public static void main(String[] args) {
		int tot= sum(0,10);
		System.out.println(tot);
		System.out.println(" continue further transactions ");
       
	}

}
