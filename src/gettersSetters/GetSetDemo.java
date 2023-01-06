package gettersSetters;

public class GetSetDemo {

	public static void main(String[] args) {
		
		  //WITHOUT GETTER AND SETTER METHODS 
		  Person p = new Person(); 
		  //p.name = "lucky";
		  // error says p.name is not available without getter and setter methods
		  //System.out.println(p.name); // error  .. no error if you declare 'name' variable as public instead private
		 
		 //WITH GETTER AND SETTER METHODS 
		  p.setName("lucky");     // setting the value of varible name 
		 System.out.println(p.getName());   // getting it by gettte method
		
	}

}
