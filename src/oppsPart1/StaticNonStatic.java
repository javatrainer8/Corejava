package oppsPart1;

public class StaticNonStatic {

	String name = "MADHU";  // non-static global variable
	static int age = 40;    // static global variable .. static vars and methods stores in separate memory, so that you can access directly
	
	public static void main(String[] args) {
		// calling static method and variables
		// 1. direct calling
		sum();
		System.out.println(age);    
		//2. by using classname
		StaticNonStatic.sum();
		System.out.println(StaticNonStatic.age);
		
		// calling non-static method
		// by creating object
		StaticNonStatic lucky = new StaticNonStatic();
		lucky.division();
		System.out.println( lucky.name);
		
		// you can access static methods by using objects, but it is unnecessary, when you have option to  call directly, using object is stuupid.
		lucky.sum();

	}

	public static void sum() {
		System.out.println( "This is static method" );  // static method
	}
	
	public void division() {
		System.out.println(" non-static method calling ");      // non-static method 
	}
	
}
