package basics;

public class LoopsConcept {

	public static void main(String[] args) {
// 1. using while loop
		int  i = 1;                                   // initialization
		while (i<=10) {                               // conditional part
			System.out.println(" print i value " +i);   // print 1                               // value 1 is going to print
			i=i+1;     // incremental or decrement part  ...... 1+1 =2 value generated,,,,,  if you remove this line code you will get infinite 1's
		}
		System.out.println("_______________________________________ ");
	
	
		
		
// 2. for loop
		for(int j=1;j<=10;j++) {          // j++ means j+1
			System.out.println("    print  "+j);
		}
		
		// print 10 to 1
	for (int k=10;k>=1; k--) {    // 10-1 =9 ,,    9-1=8  8-1=7
		System.out.println("  k value   "+k );
	}
		
		
	}

}
