package dataStructures;

public class ArraysDemo {

	public static void main(String[] args) {
			
		
		 int a =10;  // int is primtive datatype .... it can only one value... '10'
		 double d = 22.3;
		 float f = 99.33f;
		// int accno = 1223333;
		 
		 int [] accno = new int[10000];   // arrays are fixed in size and similar datatypes ..
         accno[0] = 12345;
         accno[1] = 878744;   
         //accno[10001] = 1223333;    //arrays out of bound exception
         //accno[2] = "names";        // type mismatch 
         String [] countryname = new String[220];
         
         String [] months = { "jan", "feb"};
         
         System.out.println(accno[0]);
	}

}
