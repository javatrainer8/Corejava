package objectTypecasting;


class Parent{                //DownCasting parent to child
	void car() {
		System.out.println(" child class");
	}
}
class Child extends Parent{
	
	  void car() { System.out.println(" parent class"); }
	 }

public class Downcasting {
	public static void main (String [] args ) {
		         Parent obj =new Child();   // upcasting  child to parent 
		                         
		           Child obj2 = (Child)obj;   // down casting parent to child 
		           obj.car();
		           obj2.car();   // if you remove parent class 'car' method, then child class 'car' method exeutes
	     
	}

}
