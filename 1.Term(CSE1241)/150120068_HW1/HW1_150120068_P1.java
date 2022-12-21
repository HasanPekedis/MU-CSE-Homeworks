// Hasan Pekedis 150120068

//This program's purpose is calculate your total driving cost from 3 different inputs.

import java.util.Scanner;

public class HW1_150120068_P1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double Distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double MilesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double PricePerGallon = input.nextDouble();
		
		
				
		System.out.println("The cost of driving is " + (Distance / MilesPerGallon * PricePerGallon)  );

		
		

	}

}
