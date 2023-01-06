package java8Features;
//public   no access modifier 

// void   no return type
// no method name

@FunctionalInterface
interface Cab {
	public void methodB(); // abstract method

}

class Lamda {
	public static void main(String[] args) {
		Cab ref = () -> System.out.println("its booked....... whw eek fa;skdf.   lambda exresssion "); 
		ref.methodB();

	}

}
