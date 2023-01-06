package ThisSuper;

class Animal{    
String color="white";   // parent class instance variable name is 'color'  
}


class Dog extends Animal{    // dog inherited from Animal
String color="black";        // current/child class instance variable name is 'color' 

void printColor(){          // method name is printColor
	String color="green";   // local variable name is 'color' 
System.out.println(color);     // current class local variable  // green
System.out.println(super.color);  // parent class variable      // white 
System.out.println(this.color);   // current class instance variable // black
}  
} 
class ThisSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  // object created 
d.printColor();  
}}  
