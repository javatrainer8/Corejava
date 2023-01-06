package assignments;

import java.util.Scanner;

public class ElectricityBill {
  public static void main(String[] args) {
		
		// below 100 units -- free
		// 100 - 200 --- each unit cost 2rs
		// 300 and above   ------ each unit 3 Rs
		
		int units =150;
		double paybill=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units consumed  :");
		units = sc.nextInt();
		
		
		if (units<100) {
			System.out.println("  This customer has to pay 0.00");
			}
		else if (units>100 && units <200 ) {
			paybill=units*2;
		}
		else if (units >200) {
			paybill=units*3;
		}
		System.out.println(" You have to pay  :"  +paybill);

	}

}
