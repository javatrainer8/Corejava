package main;

public class MainTest 
{ 
 public static void main(int a)  // first main method 
 { 
   System.out.println("First main() method"); 
    main(); 
 } 
public static void main()   //  second main method 
{ 
   System.out.println("Second main method"); 
 } 
public static void main(String[] args)    // Real main method 
{ 
   System.out.println("Real main method with (String[] args)"); 
     main(20); 
 } 
}
