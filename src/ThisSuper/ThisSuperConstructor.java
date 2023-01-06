package ThisSuper;

class Parent{  
Parent(){System.out.println("parent  is created");}   // parent class constructor 
}  
class Child extends Parent{  
Child(){                       // child class constructor 
super(); 



System.out.println("child  is created");  
}  
}  
class ThisSuperConstructor{  
public static void main(String args[]){  
Child d=new Child();  
}}  
