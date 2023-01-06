
public class MultiCatch {

	public static void main(String[] args) {
		
		try {
		int a[]= {1,2,3,4,6,7};
		System.out.println(a[1]);
		
		System.out.println(" no exception in try block  ");
		}
		catch (ArithmeticException e) {
			System.out.println(" logic is not right ");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("  show this message if there is exception regarding out of arrany range  ");
		}
		
		finally { 
			System.out.println(" This is going to execute at the end ...... if there"
					+ "are exceptions present or not ");
		}
		

	}

}
