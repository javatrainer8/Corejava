package Abstraction;

public class Benz implements CarInterface {   // when you hove over Benz class name .. you will see auto unimplemented method options 

	@Override
	public void start() {
System.out.println(" overridden start ");		
	}

	@Override
	public void stop() {
		System.out.println(" overridden stop ");		
	}

	@Override
	public void fuel() {
		System.out.println(" overridden fuel ");		
	}

}
