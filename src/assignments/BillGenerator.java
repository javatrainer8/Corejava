package assignments;

public class BillGenerator {

	
	public static void main(String[] args) {
       
		int unit_no=150;
		double paybill=0;
		
		if (unit_no <100) {
			System.out.println(" No bill due below poverty line");
		}
		else if (unit_no >100 && unit_no<200) {
			paybill=unit_no*2;
		}
		else if (unit_no>200) {
			paybill=unit_no*3;
		}
		System.out.println(" You have to pay  : "+paybill+ " Rupees ");
	}
}
