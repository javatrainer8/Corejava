package overriding;

public class Car extends Vehicle { // it can use engine method

	public void start() {    // its own method
		System.out.println(" This is start method from  CAR   class");
	}

	public void stop() {   // own method 
		System.out.println("  stop method from car class");
	}

	public void fuel() {   // own method
		System.out.println(" fuel method from car class");
	}

	public void engine() { // parent method
		System.out.println(" car class engine method logic");
	}
}
