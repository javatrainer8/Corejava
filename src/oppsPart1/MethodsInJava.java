package oppsPart1;

public class MethodsInJava {

	public static void main(String[] args) {
 
		MethodsInJava miley= new MethodsInJava();   // miley is reference variable, after creating the object,  the copy of all non static methods
                                             //will be given to the object.
	miley.lucky();
	int storesum = miley.addition();
	System.out.println(storesum);
	String storename= miley.name();
	System.out.println(storename);
	int div= miley.pqr(15,3);
	System.out.println(div);
	
	// main method is void because it never returns any value
	
	}

// non-static methods
// void doesn't return any value :  return type  = void
	
	public void lucky() {   // no input and no output
		System.out.println(" this is void method, it doesn't return any value");
	}
// return type = int
	public int addition() {    // not input and some output
		System.out.println("this method will return integer type value");
		int a=1;
		int b = 2;
		int c = a+b;
		return c;
	}
	// return type = String
	public String name() { // no input and some output
		System.out.println(" this is my name");
		String n = "Miley";
		return n;
		
	}
// return type = int  and input parameters
	
	public int pqr (int x, int y) {   // some input and some output 
	System.out.println(" This is method has parameters/arguments");
	
	int z=x/y;
	return z;
}}