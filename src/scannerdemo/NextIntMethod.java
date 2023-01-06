package scannerdemo;

import java.util.Scanner;

public class NextIntMethod {

	public static void main(String[] args) {
          Scanner obj1 =  new Scanner(System.in);  // create an object for Scanner class
          
          System.out.println( "Enter your phone number  :  " );
          
          int contactno = obj1.nextInt();
          
          System.out.println( "Thanks for enterting your number, Your Phone number is   : " +contactno );
          
          obj1.close();    // closing scanner class 
	}

}
