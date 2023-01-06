package StaticFinal;

public class StaticConcept {

static int x=10;           // static variable 
       int y=20;           // instance variable 
       public static void main(String[]args) {
    	   
    	   System.out.println(StaticConcept.x);    // calling static variable
    	  
    	   StaticConcept s = new StaticConcept();   // calling instance variable 
    	   System.out.println(s.y);
    	   
       }
}
