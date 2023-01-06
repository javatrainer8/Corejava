package com.batch.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Double Value  :");
		
		double value = obj.nextDouble();
		System.out.println(" This is double value  "  +value);
		obj.close();
		

	}

}
