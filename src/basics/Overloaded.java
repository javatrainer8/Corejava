package basics;

public class Overloaded {

	
	public int addition( int a, int b ) {
		return(a+b);
	}
	public int addition( int c, int d, int e) {
		return(c+d+e);
	}
	public double addition ( double f, double g) {
		return (f+g);
	}
	
	
	public static void main(String[] args) {
           Overloaded O = new Overloaded();
           System.out.println(O.addition(100,200));
           System.out.println(O.addition(100,200,300));
           System.out.println(O.addition(12.23,13.22));
		
	}

}
