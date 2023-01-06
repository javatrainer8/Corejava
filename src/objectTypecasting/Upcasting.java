package objectTypecasting;

class A{        // UPCASTING PARENT to Child  
	void car() {
		System.out.println(" CAR method");
	}
}
class B extends A{
	
	  void car () { System.out.println(" child  care methd "); }
	 }
class Upcasting {
	public static void main (String[] args) {
		
		/*
		 * B c= new B();        // object for child  class
		 *  A p= (A)c;
		 * 
		 * System.out.println(p); System.out.println(c); // c and p are ref variables
		 * storing at same location c.car(); p.car();
		 */        
		          A obj =new B();  /// in single step upcasting
		          System.out.println(obj);
		          System.out.println(obj);   // if you remove child class 'car' method,, parent class care method executes
		          obj.car();
		          obj.car();
		          
		
		}

}
