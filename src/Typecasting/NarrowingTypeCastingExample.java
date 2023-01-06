package Typecasting;

public class NarrowingTypeCastingExample     // DOWNCASTNG 
{  
public static void main(String args[]) {
	
	//double -> float -> long -> int -> short -> byte

double d = 166.66;       

                                                 
long l = (long)d;    // CONVERTING double to long 

                
               int i =(int)l;  //  converting long to int 
                                                           
 
System.out.println("Before conversion: "+d);   // 166.66
 
System.out.println("After conversion into long type: "+l);   //166  

System.out.println("After conversion into int type: "+i);  
}  
}  
