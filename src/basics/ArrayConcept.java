package basics;

public class ArrayConcept {

	public static void main(String[] args) {

	//int i=10;
		//i=20;        // 'i' variable value 10  is replace by 20, 
		           //you can't assign two values to single variable 
       //System.out.println(i);   
	
	     //lowest bound/index = 0
		// upper bound/index = 4-1 (n is size of array)
		
		int i[] = new int[5];  // array size is 5 
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		i[4]=100;
		//int [] i = {10,20,30,40,100};
		
				
		//System.out.println(i["hello"]);  // array allows only similar datatypes
		//System.out.println(i[5]);          java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		
		System.out.println(i.length);     // print size of array
		
		for(int j=0;j<i.length;j++){
		
		 		System.out.println(i[j]);
		 		// disadvantages:: array size is fixed,   
		 		
		 		 // stores only similar type of datatypes.
		   
		 }
			
	}

}
