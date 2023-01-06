package generics;

class Test_Generics<T1, T2>        // Generic class with two parameters
{
    T1 obj1;  // An object of type T1
    T2 obj2;  // An object of type T2
 
    // constructor to initialise T1 & T2 objects
    Test_Generics(T1 obj1, T2 obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;   // refers current class obj
    }
 
    public void print()
    {
        System.out.println("T1 Object   :" + obj1);
        System.out.println("T2 Object   :" + obj2);
    }
}
 
class TwoParameters
{
     public static void main (String[] args)
    {
         Test_Generics<String, Integer>obj = new Test_Generics<>("Java Generics", 1);  // object created 
 
         obj.print(); // calling print method  
    }
}

