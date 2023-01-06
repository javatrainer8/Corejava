package scannerdemo;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);    // created an object for Scanner class -  's'
        
        System.out.println( " Enter User Name : ");
        
        String name = obj.nextLine();  // request for the input  -- String type
        
        System.out.println(" My name is : "   +name);
        
        obj.close();   // closing the scanner 
        
		
	}

}
