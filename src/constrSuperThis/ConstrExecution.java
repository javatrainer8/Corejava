package constrSuperThis;

public class ConstrExecution {
	// constructor executes for each and every object 
	int i;
	ConstrExecution(){     // plane constructor to check execution for each object 
		System.out.println("constructor executes for each object ");
	}

	public static void main(String[] args) {
         // three objects created to check constructor execution 
		ConstrExecution a = new ConstrExecution();
		ConstrExecution b = new ConstrExecution();
		//ConstrExecution c = new ConstrExecution();
		System.out.println(a.i);
		System.out.println(b.i);

	}

}
