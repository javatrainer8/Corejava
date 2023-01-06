package main;

public class MainMethod {
	public void methodname() { // regular method
		// your business logic
		System.out.println(" this is regular method logic ");
	}

	public static void main(String[] abc) { // execution starts from here

		// 'public' ---- access to all
		// 'static' --- call without an object
		// 'void' ---- it doesnt return any value
		// 'main' ----- name of method

		// 'String[] ' ----- array of String type arguments
		// ' args ' ----- is a parameter

		System.out.println("This is main method ");

		MainMethod obj = new MainMethod();
		obj.methodname();

	}

}
