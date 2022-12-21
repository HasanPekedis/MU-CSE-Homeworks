//Hasan Pekedis 150120068
//This program's purpose is finding the day of the week. We need a formula for calculating.

import java.util.Scanner;

public class HW2_150120068_P2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = input.nextInt() ;
		System.out.println("Enter month:");
		int m = input.nextInt() ;
		System.out.println("Enter the day of the month");
		int f = input.nextInt() ;
	
	
		if (m == 1 ) {
			m = 13;
		    year -= 1;
		}
		
		if (m == 2) { 
			m = 14;		
		    year -= 1;
		}
		
		
		int c = year / 100;
		int y = year % 100;
		
		
		int d = ( f + (26*m + 26)/10 + y + y/4 + c/4 + 5*c )%7;   //Formula of Zeller.
		
		switch (d) {
		case 0:
			System.out.println("Day of the week is Saturday ");
			break;
		case 1:
			System.out.println("Day of the week is Sunday ");
			break;
		case 2:
			System.out.println("Day of the week is Monday ");
			break;
		case 3:
			System.out.println("Day of the week is Tuesday ");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday ");
			break;
		case 5:
			System.out.println("Day of the week is Thursday ");
			break;
		case 6:
			System.out.println("Day of the week is Friday ");
			break;
		
			


		}
			
				
		
		
		

	}

}
