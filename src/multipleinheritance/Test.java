package multipleinheritance;

public class Test {

	public static void main(String[] args) {  // main method 
       HDFCbank h = new HDFCbank();    // created object for HDFCbank
       h.deposit(); //
       h.withdraw();
       h.moneytransfer();
       h.myownmethod1();
       h.myownmetho2();
       System.out.println("___________________________________");
       h.insurance();
	}

}
