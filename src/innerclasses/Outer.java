package innerclasses;

class Outer{  //  this is outer class

	     private int data=30;  

	     class Inner{     // this is inner class "member inner class
          void msg(){System.out.println("data is "+data);}  
             }  
     
	     public static void main(String args[]){  
        
	    	 Outer obj=new Outer();   // object created
        
             Outer.Inner in  =  obj.new Inner();  
             //object for inner class.  Syntax:  outerclassname. Innerclassname  objname = outerobjectname.new innerclassname();
        
             in.msg();  // calling the method with inner class object--   "in"
}  
}  
