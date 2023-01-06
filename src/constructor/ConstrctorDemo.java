package constructor;

public class ConstrctorDemo {
	 int i;    // default assigned by jvm is '0'
     double d; // '0'0'
     String name; // 'null'     // these are instance varibles .... 


	public static void main(String[] args) {
          int a; // local variable 
           ConstrctorDemo c = new ConstrctorDemo();
           System.out.println(" default value of int is :" +c.i);
           System.out.println(" default value of double is :" +c.d);
           System.out.println(" default value of String is :" +c.name);
		
	}
}

