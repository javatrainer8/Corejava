package StaticFinal;

public class Employee {

	String name;     // two instance vars
	int id;
	static String companyName= "UST GLOBAL";   // one static var
	
	
	Employee(String n, int i){
		name=n;
		id=i;
	}
	void display() {
		System.out.println(" Name is  :  " +name);
		System.out.println(" Id is   :  " +id );
		System.out.println(" Company name is   :  " +companyName);
	}
	public static void main(String[] args) {

	
Employee e = new Employee("Sravya", 001);
          e.display();
          Employee e1 = new Employee ( "Akshay", 002);
          
          e1.display();
}
}