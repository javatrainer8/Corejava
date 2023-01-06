package constrSuperThis;

public class ConstructorDemo {
	int x;
	String name;

	/*
	 * void sample() {
	 * System.out.println(" x value assigned by a constructor   "+x);
	 * 
	 * }
	 */
	ConstructorDemo(int x, String name){   // constructor job is to intialization of object
		this.name=name;                    // new keyword is responsible to create an object and jvm will default values to it 
		this.x=x; 
		
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo(10,"chikago");
		ConstructorDemo obj1 = new ConstructorDemo(20,"fads");
		
		// obj.sample();
		System.out.println(obj.x);
		System.out.println(obj.name);
		System.out.println(obj1.x);
		System.out.println(obj1.name);

	}
}
