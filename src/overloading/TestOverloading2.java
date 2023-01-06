package overloading;

class Adder1{  
static int add(int a, int b){  // add method with 2 parameters 
	return a+b;
	}  
static double add(int a, double b){  // add method with 2 different datatypes parameters 
	return a+b;
	}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder1.add(11,11));  
System.out.println(Adder1.add(12,12.6));  
}} 



 
