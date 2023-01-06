package basics;

public class StringConcatenation {

	public static void main(String[] args) {
int a = 100;
int b = 200;
String x ="Hello";
String y = "World";

    System.out.println(a+b);
    System.out.println(x+y);
    System.out.println(a+b+x+y);
    System.out.println(x+y+a+b);
    System.out.println(x+y+(a+b));
    //' +  ' is concatenation operator
    
    System.out.println(" Our first program output is   :" +x+y);
    System.out.println(" Addition of a and b is   :" +(a+b));
    
	}

}
