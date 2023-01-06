package basics;
class C {

	int myAge= 30;        // instance variable   of parent class 
}

public class ThisSuper extends C {
	
	int myAge= 20;           // instance variable  of child class 
	
	void showage() {
		
		int myAge= 10;       //local variable of child class
		
		System.out.println(myAge);
		System.out.println(this.myAge);     // this keyword refers present/current class instance variable 
	    System.out.println(super.myAge);    // super keyword refers to instance variable of parent class
	}
	
	
	public static void main(String[] args) {
		ThisSuper obj=new ThisSuper();
		obj.showage();

	}

}
