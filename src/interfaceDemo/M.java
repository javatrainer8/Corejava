package interfaceDemo;
// Multiple inheritance 

interface Continent { // Interface 1
	void continentName(); // abstract method
}

interface Country { /// interface 2
	void countryName();
}

interface City { // interface 3
	void cityName(); // three interfaces with one abstract method ...
}

public class M implements Continent, Country, City{ // multiple inheritance

	@Override
	public void cityName() {
		System.out.println("Europe");
	}
	@Override
	public void countryName() {
		System.out.println("France");
	}
	@Override
	public void continentName() {
		System.out.println("Paris");
	}

	public static void main(String[] args) {
		M obj = new M();
		obj.continentName();
		obj.countryName();
		obj.cityName();

	}
	

}
