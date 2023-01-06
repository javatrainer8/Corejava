package inheritance;

 
public class ChildClass2 extends  ChildClass{
	
	public void grandmethod() {
		System.out.println(" Child class 2 method...........");
	}

	public static void main(String[] args) {
		
		ChildClass2 obj = new ChildClass2();  // object created for childclass2
        //obj.method1();  // we are calling parent class method 'method1'
	}

}
