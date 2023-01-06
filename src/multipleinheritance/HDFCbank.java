package multipleinheritance;

public class HDFCbank implements USbank, CanadaBank{   // Multiple inheritance achieved through interfaces 
	
	public void deposit(){   // overriding methods in USbank interface ..
		                    // all methods of interface should be overridden, otherwise error will appear 
		System.out.println( " implemented method in hdfc bank");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void withdraw(){
		System.out.println( " withdraw  method in hdfc bank");
	}
	public void moneytransfer(){
		System.out.println( " moneytransfer  method in hdfc bank");
	}
	public void myownmethod1(){           // creating its own method1  and method 2
		System.out.println( " this my hdfc bank method 1");
	}
	public void myownmetho2(){
		System.out.println( " this is my hdfcbank method 2");
	}
	public void insurance(){   // Canada Bank method overridden 
		System.out.println( " canada bank insurance method");
	}


}
