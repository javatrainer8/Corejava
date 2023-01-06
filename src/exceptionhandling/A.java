package exceptionhandling;

public class A {

	public static void main(String[] args) {
         System.out.println(1);
         System.out.println(2);
         System.out.println(3);
         System.out.println(4);
         System.out.println(5);
         try {
         System.out.println(6/0);
         }
         catch(ArithmeticException e) {
        	 System.out.println(" please execute this block of code  and ignore it ");
         }
         System.out.println(7);
         System.out.println(8);
         System.out.println(9);
         System.out.println(10);
       
	}
	

}
