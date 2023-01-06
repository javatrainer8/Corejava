
public class Unchecked {

	public static void main(String[] args) {
		
		try {
			int a =10;
			int b =0;
			int c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e){
			System.out.println(" ok let it go ");
		
		}
		System.out.println(" This is my rest of program ...... continues ");

	}

}
