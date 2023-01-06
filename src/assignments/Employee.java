package assignments;

public class Employee extends Person 
{ 
  int age = 30; 
  void insertStudentAge() 
  { 
    int age = 20; 

// Here, we have two ways to call instance variable 'age' of the person. 
// 1st way: 
     Person p = new Person(); 
     System.out.println(p.age); // 50 

// 2nd way: 
    System.out.println(super.age); // 50 
 // Calling Local variable. 
    System.out.println(age); 

// Calling instance variable of the same class. 
    System.out.println(this.age); // 30 
  } 
}
