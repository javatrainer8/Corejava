package encapsulation;

 class Student 
{ 
 String abc = "chhcu";                // accesible by another class
 private String xyz="lucky"; ////  declared variable as private " data hiding"
   
 void s() {
	  System.out.println(xyz);
  }

public String getXyz() {
	return xyz;
}

public void setXyz(String xyz) {
	this.xyz = xyz;
}

 
}
      
 

 
  
