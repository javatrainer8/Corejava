package basics;
public class AssignmentOperator {
	      // =, += , -=, *=, /=, %=   Assignment operators     
	
	public static void main(String args[]) {
	      int num1 = 10;  // variable num1
	      int num2 = 20;  // variable num2 
	 
	      num2 = num1;    // 10 is replacing the value 20 
	      System.out.println("= Output: "+num2);
	 
	      num2 += num1;
	      System.out.println("+= Output: "+num2);
		      
	      num2 -= num1;
	      System.out.println("-= Output: "+num2);
		      
	      num2 *= num1;
	      System.out.println("*= Output: "+num2);
		      
	      num2 /= num1;
	      System.out.println("/= Output: "+num2);
		      
	      num2 %= num1;
	      System.out.println("%= Output: "+num2);
	   }
	}

