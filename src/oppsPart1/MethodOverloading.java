package oppsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading lucky = new MethodOverloading();
         lucky.sum();
         lucky.sum(5);
         lucky.sum(10, 20); 
         lucky.sum(44,33.33);
         lucky.main(757);
	}
	public static void main(int z) {
		System.out.println(" main method overloading,... very fun.. isnt it"   +z);
	}
	
	//  we can overload main method also by changing the parameters 

	public void sum() {
		System.out.println(" This method is going to overload");
	}
	
	public void sum(int x) {
		System.out.println(" method  OVERLOADED by adding one parameter/argument " +x);
	}
	public void sum (int x, int y) {
		System.out.println(" OVERLOADED again by changin two parameters --- " +(x=y) );
	} 
	public void sum(int x, double y){
		System.out.println(" method with same number of parameters but different datatypes  "  +(x+y));

	}
	}
	// we cannot create a method inside a method, 
	// method with same name different number parameters can be overloaded. 
	  // method with same name and  same number of parameters but different datatypes can be overloaded.

