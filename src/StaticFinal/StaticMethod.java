package StaticFinal;

public class StaticMethod {

	int y = 100; // instance var
	static int x = 200; // static var

	void display() { // regular method
		System.out.println(y);
		System.out.println(x);
	}

	static void show() { // static method

		System.out.println(x);
		// System.out.println(y);
	}

	public static void main(String[] args) {

		StaticMethod obj = new StaticMethod();

		obj.display(); // normal method calling with object ref
		show(); // calling static method
	}

}
