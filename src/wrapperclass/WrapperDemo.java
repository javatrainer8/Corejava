package wrapperclass;

public class WrapperDemo {

	public static void main(String[] args) {
       
		// conversion from String to integer
		String  x ="200";
		System.out.println(x+333);  // 200333
		int i = Integer.parseInt(x);
		System.out.println(i+333);
		
		// conversion from String to double 
		String s = "34.34";
		double d = Double.parseDouble(s);  
		System.out.println(d+10);
		
		
		// int to String 
		int j = 500; 
		System.out.println(j+10);         // before conversion 500+10
		   String st = String.valueOf(j);
		   System.out.println(st+300);  //after conversion 500300
		
	}

}
