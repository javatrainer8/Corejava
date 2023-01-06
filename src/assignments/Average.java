package assignments;



public class Average {
	
	public static void main(String[]args) {
	double avg=0;
	
	int x [] = new int[5];  // declaring the size of an array
	
	x[0]=100;
	x[1]=100;
	
	x[2]=90;
	x[3]= 80;
			
    x [4]= 70;  //90+80+70/5
	
	for(int i=0;i<5; i++)  // i value is going to be 1
		avg=avg+x[i];     //  x[2]=40  = 75+40+90...   a[2]  =   avg =75+80+35+99+90/5             = total marks stores in avg variable
	
	System.out.println(" The average of five subjects is :   " +avg/5 );
	
}}
