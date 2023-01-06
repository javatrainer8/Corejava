package java8Features;
@FunctionalInterface
interface MyInterface {
	public void demo(); // abstract method
	public static void display() { // static method
		System.out.println("This is a static method");
	}
	default void dMethod() { // default method
		System.out.println(" This is DEFAULT METHOD ");
	}
}
public class InterfaceStaticMethod implements MyInterface {
	public void demo() { // overriding abstract method
		System.out.println("This is the implementation of the demo  abstract method from interface");
	}
	public static void display() {
		System.out.println(" Trying to override static method of Interface ");
	}
	public static void main(String args[]) {
		InterfaceStaticMethod obj = new InterfaceStaticMethod(); // object
		obj.demo(); // calling overridden abstract method by object reference
		obj.dMethod(); // calling default method by object reference
		MyInterface.display(); // calling static method by interface name.staticmethodname
		InterfaceStaticMethod.display(); // you cannot override static method
	}}

