package arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
                 
		
		int [] accno = new int[5];    // you can store five values and only integer values 
		accno [0] = 234;
		accno [1] = 2345;
		accno [2] = 234456;
		//accno [3] = 23444;
		//accno [4] = "somename"; // error -- mismatch 
		//accno [5]  = 98984;
		
		
		System.out.println(accno[0]);
		System.out.println(accno[1]);
		System.out.println(accno[2]);
		System.out.println(accno[3]);   // default value for int datatype ' 0 '
		System.out.println(accno[4]);
		
		String [] names = new String[205];
		
		names [0] = "France";
		names [1] = " Sweden";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		String[] cities = {"london", "paris", "rome"};
		System.out.println(cities[0]);
		
		
	}

}
