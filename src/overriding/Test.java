package overriding;

public class Test {

	public static void main(String[] args) {
          Audi ob = new Audi();    // overridden method should contain same name and parameters as in parent class.
          ob.start();
          ob.stop();
           
          ob.engine();  //  engine method got from Vehicle class.. because car class extends vehicle 
                        // so engine() method inherited to car class and
                        // car class already inherited by Audi.. so Audi can use engine method.
          
          Car c = new Car();  // Parent class object creation
          c.start();
         // c.mybrand();  // mybrand method is in child class (audi),  parent class cannot inherit methods from child class.
          
          new Audi();  // an empty object created for Audi class
          Car c1= new Audi();   // child class object can referred by parent class reference variable... 
                                //this is called dynamic polymorphism - runtime polymorphism
          
          System.out.println( "___________________________________________________");
          c1.start();
          
	}

}
