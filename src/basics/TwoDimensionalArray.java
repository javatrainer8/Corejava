

package basics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
  int x[][]=new int[3][5];
  
  x[0][0] = 10;    // first [] is belongs to row and second [] is belongs to column  ,,, 
  x[0][1] = 20;
  x[0][2] = 30;
  x[0][3] = 40;
  x[0][4] = 50;
  
  x[1][0] = 1;    // second row line 
  x[1][1] = 2;
  x[1][2] = 3;
  x[1][3] = 4;
  x[1][4] = 5;
  
  x[2][0] = 100;    // third row line 
  x[2][1] = 200;
  x[2][2] = 300;
  x[2][3] = 400;
  x[2][4] = 500;
  
  System.out.println(x[2][2]);  // to print third row third column
  System.out.println(x.length);    // total number of rows will be printed
 
  System.out.println(x[1].length);   // total number of columns,, you can use x[1].length  to find length of columns
	// use for looop to print all values
  for (int row=0; row<x.length; row++) {
	for (int col=0; col<x[0].length; col++) {
		System.out.println(x[row][col]);
	}
  }
	
	}

}
