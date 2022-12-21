//Hasan Pekedis 150120068
//This program's purpose is calculate bills for each flat.
//I used calculateTheInvoice method for calculate each flat based on the inputs.
//Also, calculateTheInvoice method returns bills array to main method.
//I used printBills method for print the values to the console display.

import java.util.Scanner;
public class HW4_Q1_150120068 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int FlatNumber = input.nextInt();
		double[] flats = new double[FlatNumber];
		
		int i;
		for (i=0; i < FlatNumber ; i++) {			
			flats[i] = input.nextDouble();
			
			}
		double totalBill = input.nextDouble();
		
		double[] bills1 = calculateTheInvoice(flats ,totalBill);
		
		printBills(bills1);
															
	}
	
	public static double[] calculateTheInvoice (double[] flats, double totalBill) {
		double CommonPart = (totalBill * 3.0)/10;
		double OtherPart = (totalBill * 7.0)/10;
		double Whole = 0;
		int y;
		for (y=0; y < flats.length ; y++) {
			Whole = Whole + flats[y];
		}
		int x;
		double[] bills = new double[flats.length];
		for (x=0; x < flats.length; x++) {
			bills[x] = (CommonPart/(flats.length*1.0 )) + (OtherPart * ((flats[x]*1.0)/((Whole)*1.0)));
		}
		
	
		return bills;
		
	}
	
	public static void printBills (double[] bills) {
		int a;
		for (a=0; a < bills.length ; a++) {
			System.out.println("Flat #" + (a+1) +": " +(int)(bills[a]*100)/100.0 );
		}
	}
	
	
	
	
	
	
	
	
	
}

	
		
	
		
		

	


