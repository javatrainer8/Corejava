package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
       int a=10;
       int [] arr = new int[5];  // arrray declaration
       int [] arr1= {1,2,34,54,54};
       int [] arr2 = new int [4];
       arr2 [0]= 234;
       arr2 [1]=12;
       arr2 [2]= 1234;
       arr2 [3]=121234;
       System.out.println(arr2[2]);  // 1234
       String [] countrynames = new String [206];
       countrynames [0] = "India";
       String [] countrynames1 = {"India", "china", "brazil", "Denmark", "France", "Australia"}; 
       System.out.println(countrynames1[2]);
       System.out.println(countrynames1.length);   // length of the array 
       
       
	}

}
