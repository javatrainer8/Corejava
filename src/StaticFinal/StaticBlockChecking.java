package StaticFinal;

public class StaticBlockChecking {

	static {
		System.out.println("  check static block is goind execute first before main method ");
	}
	
	  public static void main(String[] args) {
	  
	  System.out.println(" main method is goind to execute next");
	  
	  }
	 

}
