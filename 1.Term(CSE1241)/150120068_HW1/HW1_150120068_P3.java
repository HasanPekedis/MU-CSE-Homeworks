//Hasan Pekedis 150120068

//This program's purpose is  calculate the compound monthly interest with your 3 inputs.


import java.util.Scanner;

public class HW1_150120068_P3 {

	public static void main(String[] args) {
					
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the Initial Principal value: ");
			double InitialPrincipal = input.nextDouble();
			
			System.out.println("Enter the Annual Interest Rate Percentage value: ");
			double AnnualInterestRate = input.nextDouble();
			
			System.out.println("Enter the Number Of Time Periods in Months: ");
			double NumberOfTimePeriods = input.nextDouble();
			
			
			
			
			double MonthlyInterestRate = AnnualInterestRate / 12;
			
			double FinalBalanceAmount = InitialPrincipal * Math.pow(1 + (AnnualInterestRate / 1200), NumberOfTimePeriods);
			
			double TotalCompoundInterestAmount = FinalBalanceAmount - InitialPrincipal;
			
			
			System.out.println("Initial principal amount: " + InitialPrincipal);
			System.out.println("Monthly interest rate: " + MonthlyInterestRate);
			System.out.println("Total compound interest amount: " + TotalCompoundInterestAmount);
			System.out.println("Final balance amount: " + FinalBalanceAmount);


	}

}
