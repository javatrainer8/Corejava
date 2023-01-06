package Typecasting;


 
public class Test 
{ 
  public static void main(String[] args) 
  { 
     One o = new Two(); 
     Two t = (Two)o; 
      t.m1(); 
      t.m2(); 
   } 
 }
 