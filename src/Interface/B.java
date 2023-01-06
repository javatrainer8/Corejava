package Interface;

class B implements A {
	public void method1() { // this is interface A abstract method
		System.out.println(" inhertied method  from interface A");
	}

	public void method2() { // this is interface A abstract method
		System.out.println(" this is also inhertied method from interface ");
	}

	void show() { // its own method
		System.out.println(" this is my normal show method");
	}

	public static void main(String[] args) {
		B obj = new B(); // object created for class 'B'
		obj.method1(); // calling interface abstract methods using B object
		obj.method2();
		obj.show();

	}
}
