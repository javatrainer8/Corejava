package ThisSuper;

class A{  
void eat(){System.out.println("eating... by Animal");}  // parent class method 'eat'
}  
class D extends A{  
void eat(){System.out.println("eating bread... by dog ");}  // current /child class method 'eat'
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
this.eat();  
}  
}  
class ThisSuperMethod{  
public static void main(String args[]){  
D d=new D();  
d.work(); 

}}  
