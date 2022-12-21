// Hasan Pekedis 150120068

// This program's purpose is find Year, Month and day info with input number.

import java.util.Scanner;
public class HW1_150120068_P2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the day number ");
		int DayNumber = input.nextInt();
		
		int YEAR = (DayNumber / 365);
		int MONTH = (DayNumber % 365 / 31);
		int DAY = (DayNumber % 365 % 31);
		
		System.out.println("Year: " + YEAR + " Month: " + MONTH  + " Day: " + DAY);
		
		

	}

}
