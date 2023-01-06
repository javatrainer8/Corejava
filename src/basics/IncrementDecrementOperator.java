package basics;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
              // ++  increment  ++
		      //--  decrement
		
		int i=10;
		
		
		System.out.println(i++); // post increment   10+1=11  the original value of variable  is returned first; then variable is incremented by 1.
		System.out.println(++i);  // pre  increment  1+11=12---the value of variable  is incremented by 1; then it returns the value.
		System.out.println(--i);  // pre decrement   --12
		System.out.println(i--);    
		System.out.println(i);
	}

}
