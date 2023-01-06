package constructor;

public class Demo1 {
  // three types of constructors  1. default no argument constructor by compiler
	                           // 2. no argument constructor by user 
	                           // 3. parameterized constructor  
	 int i;
	 String s;
	 Demo1(){  // user defined no argument constructor 
		 System.out.println("no argument constructor ");
	 }
    // parameterized constructor 
//	 Demo1(int i, String s){
//		 
//	 }
	 
	 public Demo1(int i, String s) {  // parameterized constructor 
			super();
			this.i = i;
			this.s = s;
		}
	
	 public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.i+ "  "+d.s);  // '0' and 'null' is the output
		
	}
	
}
