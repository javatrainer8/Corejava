package basics;


public class Constructor1
{ 
                                   // Declaration of Instance variables. 
    String name; 
    int age; 
    String address; 


     void display() 
     { 
        System.out.println(name); 
        System.out.println(age);
        System.out.println(address);
     } 
 
   public static void main(String[] args) 
   { 
 
    Constructor1 p = new Constructor1();           // Calling default constructor. 

                                                  // Call display() method using object reference variable p. 
     p.display(); 
    } 
}

