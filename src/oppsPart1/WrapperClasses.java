package oppsPart1;

public class WrapperClasses {

	public static void main(String[] args) {
		
		 String x ="100";
		 System.out.println(x+80);    // you will get 10080 output, because of string concatenation
		
		 // converting  string to int
		 
		 int a = Integer.parseInt(x);
		 System.out.println(a+80);  // 180 output
		 
		 // wrapper classes  are  Integer, Character  Boolean, Long Short Byte Float Double  
          
		 // converting String to Boolean
		 String k ="true";
		 boolean l = Boolean.parseBoolean(k);
		 System.out.println(l);
		 
		 // int to string
		 
		int j =200;
		System.out.println(j+20);
		String  s = String.valueOf(j);  // String.valueOf method can be used
		System.out.println(s+20);
	}

}
