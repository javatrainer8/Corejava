package oppsPart1;

public class Car {

String company;  // class variables or global variables
int year;

	
	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		
		a.company= "bmw";
		a.year= 2020;
		b.company = "maruthi";
		b.year = 2021;
		
		System.out.println(a.company);
		
		
		System.out.println(b.year);
		
		
	}

}
