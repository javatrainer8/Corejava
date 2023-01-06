package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal objA= new Animal();  // object created for Animal class
		Pig objP = new Pig();//// object for Pig class
		Dog objD= new Dog();   // object for Dog class 
		
		objA.sound();  // calling animal class method 
		
	    objP.sound();  // calling pig class sound method 
		objD.sound();  // calling dog calss sound method 
		
		

	}

}
