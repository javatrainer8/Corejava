package parametersArguments;
 
public class Arguments {
	  // variables a and b are parameters
    public static int multiply(int a, int b)  // DURING method definition
    {
        return a * b;
    }
  
    public static void main(String[] args)
    {
       // int x = 2;
       // int y = 5;
  
        // the variables x and y are arguments
        int sum = multiply(10, 20);  // these values are arguments
  
        System.out.println("SUM IS: " + sum);
    }}