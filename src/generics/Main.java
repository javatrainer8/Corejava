package generics;

import java.util.ArrayList;

class MyGenericClass<T>      // generic class created 
{  
    T obj;      /// object of type T 
    void add(T obj)              // add method to add element s    
    {
           this.obj=obj;   // current class object 
    }  
    T get()               // get method to get the elemets or values or objects
    {
           return obj;
    }  
}  
 
class Main{ 
     public static void main(String args[])
     {  
           MyGenericClass<Integer> objInt=new MyGenericClass<>();   // generic class object creation  .. Integer type
           
           objInt.add(2);  // we adding element  ...
           
           
           MyGenericClass <String>  objStr = new MyGenericClass<>();    // generic object created .. String type  
           
           objStr.add("This is String type");    // we are adding some 
 
           System.out.println("Member of MyGenericClass<Integer>   :" + objInt.get());   //  2 
           System.out.println("Member of MyGenericClass<String>    :" + objStr.get());    // This is String Type
     }
}  
