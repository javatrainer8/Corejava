package com.batch.scanner;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
      // scanner class object created
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Student Name  :");
		String name = sc.next();   // it  reads student name entered by user 
		System.out.println("Enter Roll Number  :");
		int rollno = sc.nextInt();   // it reads roll number entered by user
		System.out.println(" Enter School Name  :");
		String sname = sc.next();
		
System.out.println(name+" roll number is  " +rollno+ " and He/She is studying in "+sname+ " School");
	}

}
