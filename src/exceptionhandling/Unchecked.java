package exceptionhandling;

public class Unchecked {
	public static void main(String[] args)   {
		
		try {
			int a =2000;
			int b =10;
			int c = a/b;   // 2000/10  
			System.out.println(c);  // 200   no arithemetic exception 
		}
		catch (ArithmeticException e){
			System.out.println(" ok let it go ");
		
		}
		
		finally {
		System.out.println("  this block execute anyway... whether try block or catch block didnt work out");
	}

}}