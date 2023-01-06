package basics;

public class IfConcept {

	public static void main(String[] args) {
		int age =20;
	   String area="mumbai";
		
		if (age<18) {
			System.out.println("  this person is not  eligible for voting");
		}
				
		else if (age==18) {
 System.out.println("  He has to wait for one more year  ");
	}
	else if (age > 18 && area == "chennai") {
				
			System.out.println(" This person can vote ");
		}
		
			
		else  {
			System.out.println("  all are not eligible to vote .. because nobody satisfies the conditions");
		}
		
		
}
}
