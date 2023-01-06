package oppsPart1;

public class LocalVsGlobalVariables {

	String name;
	int x;   // these are global variables.. if you want call global variable, you should use object
	
	
	public static void main(String[] args) {
		
		int i=10;  // local variable -- local variable declares inside method
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();   // creating object  to call global variables
		System.out.println(obj.name);
		System.out.println(obj.x);
		
		
	}
	
	public void sum() {
		int i=15;    // these are local variables 
		int j=20;
		
		
		
	}
	
}
