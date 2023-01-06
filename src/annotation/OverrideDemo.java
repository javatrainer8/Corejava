package annotation;


class Parent{
	public void method(){
		System.out.println(" This is parent method logic ");
	}
}

public class OverrideDemo extends Parent  {
	
	@Override
	public void method() {
		System.out.println(" This is overriden by child class logic .... ");
	}

	public static void main(String[] args) {
		
		OverrideDemo obj = new OverrideDemo();
		obj.method();

	}

}
