package basics;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println((10>5)&& (20>10));   // AND   both are true statements   -- true
		
		
		
		
		System.out.println((10>5) &&(10>11));   // one is wrong statement     --- false
		
		
		
		System.out.println((10>5)||(20<10));     //  OR one is wrong and one is right ----- true
		//System.out.println((10==5)||(20<10));     // both are wrong    -- false 
		
		

	}

}
