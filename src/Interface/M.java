package Interface;

	 interface Continent{    // interface 1
		public abstract void ContinentName();  // abstract method
		
	}
		
	 interface Country{       // interface 2
		void CountryName();  // abstract method
	}
	
	
    interface City{         // interface 3
		void CityName();    // abstract method
	}
		
	public class M implements Continent,Country,City {   // multiple inheritance by interface  
	
		public void ContinentName() {
			System.out.println(" Europe");
		}
	
		public void  CountryName() {
			System.out.println(" Denmark");
		}
		public void  CityName() {
			System.out.println(" Copenhagen");
		}
		
	public static void main(String[] args) {
		
		M obj= new M(); // object created 
		obj.ContinentName();
		obj.CountryName();
		obj.CityName();

	}

}
