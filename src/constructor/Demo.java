package constructor;

public class Demo {

	int age;
	String s;

	public Demo(int a, String s) {

		this.age = a;
		this.s = s;
	}

	public static void main(String[] args) {
		//new Demo();                // object is created for Demo class
		// Demo ref = new Demo();     // reference variable assigned to demo object
		// System.out.println(ref.a); // output '0' default value is given by jvm
		// System.out.println(ref.s); // output 'null' default value provided by jvm

		Demo ref = new Demo(20, "durga");
		Demo ref2 = new Demo(21, "lucky");

		System.out.println(ref.age + "   " + ref.s);
		System.out.println(ref2.age + "   " + ref2.s);

	}

}
