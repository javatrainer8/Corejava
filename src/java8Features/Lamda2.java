package java8Features;

@FunctionalInterface
interface Cab1{
	public void	methodB(String start, String destination);

}
 
  class Lamda2 {
	public static void main (String []args) {
		  Cab1 ref= (start, destination)->System.out.println("its booked from "+start+ " to " +destination);
		  // no need datatype compiler will take care of that based on context
		  ref.methodB("hyderabd  ", "  Kerala");
		  
	}
		
}