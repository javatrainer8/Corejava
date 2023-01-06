package basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of Physics ");
		 int phyMarks = sc.nextInt();
		 		
		System.out.println("Enter the marks of Chemistry ");
		 int chemMarks = sc.nextInt();
		System.out.println("Enter the marks of Maths ");
		 int mathsMarks = sc.nextInt();
  int total = phyMarks+chemMarks+mathsMarks;
  double avg = total/3;
		 System.out.println(avg);
	}

}
