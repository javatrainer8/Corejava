package encapsulation;

class EncapTest 
{ 
	
 public static void main(String[] arg) 
 { 
   Student obj = new Student();   // created an object for Student class  
  
     
   obj.setXyz("othername");   // set the value 
   
   String ghi = obj.getXyz();  // get the value 
    
   System.out.println(ghi);

 }
 
}
	/*
	 * obj.setName(" this is a encapsulated variable "); obj.getName ();
	 * 
	 * String studentName= obj.getName();
	 * 
	 * System.out.println(studentName);
	 */
   
   
   
                                                   // compilation error. because  name is private. 
             // to solve this error call the getter, getName(), and the setter setName() 
                                      // to read and update the value of variable. 
 
