package java8Features;

@FunctionalInterface
interface Cab2{
	public double	methodB(String start, String destination, int km, double rs);

}
  class Lamda3 {
	public static void main (String []args) {
		  
         
		Cab2 ref=(start, destination, km, rs)->{
			  System.out.println("its booked from "+start+ " to " +destination);        
			  // no need datatype compiler will take care of that based on context
			  return (km*rs);   //550 X 150
			  };
		  
		 System.out.println( ref.methodB("hyderabd  ", "  Kerala",1550,50 ));
		  
	}
		
}