package scanner;

import java.util.Scanner;

public class AddNum {
   // adding two numbers by user input 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    // scanner class object created 
		System.out.println(" Enter your first number ");  // this statement appears to console 
          int num1 = sc.nextInt();   // reads the integer value entered by user 
          System.out.println( " Enter your second number  : ");  // this statement appears on console
          int num2= sc.nextInt();        // reads the integer value entered by user 
         int sum  = num1+num2;          // add num1+ num2 and stores in a variable 'sum'  
         System.out.println(" The total of two numbers   :" +sum);  // statement followed by sum value 
	}

}
