package assignments;


import java.util.Scanner;

public class Bille {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bill, amount;
		System.out.println("enter the units of electricity ");
		bill = sc.nextInt();
		if (0 < bill && bill <= 100) {
			System.out.println("No bill for the customers");
		} else if (100 < bill && bill <= 200) {
			amount = bill * 5;
			System.out.println("Customer has to pay " + amount);
		} else if (200 < bill && bill <= 300) {
			amount = bill * 20;
			System.out.println("Customer has to pay " + amount);
		} else if (300 < bill && bill <= 1000) {
			amount = bill * 100;
			System.out.println("Customer has to pay " + amount);
		}

		else if(bill>1000)
		{
			System.out.println("Warning to disconnect the connection");
		}
		sc.close();
	}

}