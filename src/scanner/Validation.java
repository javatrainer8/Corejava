package scanner;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer value  :");
		
		if (sc.hasNextInt()) {
			
			i = sc.nextInt();
			System.out.println( " Entered value is an Integer ");
		}
		else {
			System.out.println(" Entered value  is not an integer number ");
		}

	}

}
