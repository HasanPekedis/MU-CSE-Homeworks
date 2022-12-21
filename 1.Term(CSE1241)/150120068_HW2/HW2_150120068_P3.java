//Hasan Pekedis 150120068
//This program's purpose is computing your tax value with your income value and year value.  


import java.util.Scanner;

public class HW2_150120068_P3 {

	public static void main(String[] args) {
 	   Scanner input = new Scanner(System.in);
 	   
 	   System.out.println("Enter year and your income:");
	   
	   int year = input.nextInt() ;
	   double income = input.nextDouble() ;   
 	   
 	   
 	   double tax = 0;
 	   
 	   if (income <= 0)                                       //
 		  System.out.println("Income must be > 0");           //First if else uses for 
 	                                                          //check income value.
 	   else                                                   //
 		  if (year == 2017) {
 	 		   if(income < 13000)
 	 			   tax = income*15/100.0;
 	 	           
 	 		   else if (income < 30000)
 	 			   tax = 1950 + (income-13000)*20/100.0;
 	 		   else if (income < 110000)
 	 			   tax = 5350 + (income-30000)*27/100.0;
 	 		   else if (income >= 110000)
 	 			   tax = 26950 + (income-110000)*35/100.0;
 	 		   System.out.println("Income: " + income);
 	 	 	   System.out.println("Tax amount: " + tax);
 	 	 	   System.out.println("Income after tax: " + (income - tax));
 	 	 	   double RealTaxRate = tax/income*100;
 	 	 	   System.out.println("Real tax rate: " + (int)(RealTaxRate*100)/100.0+ "%"); 
 	 	   
 	 	   }  
 	 	   
 	 	    	   
 	 	   else if (year == 2018) {
 	 		  if(income < 14800)
 				   tax = income*15/100.0;	           
 			  else if (income < 34000)
 				   tax = 2220 + (income-14800)*20/100.0;
 			  else if (income < 120000)
 				   tax = 6060 + (income-34000)*27/100.0;
 			  else if (income >= 120000)
 				   tax = 29280 + (income-120000)*35/100.0;
 	 		   System.out.println("Income: " + income);
 	 	 	   System.out.println("Tax amount: " + tax);
 	 	 	   System.out.println("Income after tax: " + (income - tax));
 	 	 	   double RealTaxRate = tax/income*100;
 	 	 	   System.out.println("Real tax rate: " + (int)(RealTaxRate*100)/100.0+ "%"); 
 	 	   
 	 	   } 
 	 	   
 	 	   
 	 	   else if (year == 2019) {
 	 		  if(income < 18000)
 				   tax = income*15/100.0;	           
 			  else if (income < 40000)
 				   tax = 2700 + (income-18000)*20/100;
 			  else if (income < 148000)
 			       tax = 7100 + (income-40000)*27/100;
 			  else if (income <500000)
 				   tax = 36260 + (income-148000)*35/100;
 			  else if (income >= 500000)
 				   tax = 159460 + (income-500000)*40/100;
 	 		   System.out.println("Income: " + income);
 	 	 	   System.out.println("Tax amount: " + tax);
 	 	 	   System.out.println("Income after tax: " + (income - tax));
 	 	 	   double RealTaxRate = tax/income*100;
 	 	 	   System.out.println("Real tax rate: " + (int)(RealTaxRate*100)/100.0+ "%"); 
 	 		   
 	 	    } 
 	 	   
 	 	   else if (year == 2020) {
 	 		  if(income < 22000)
 				   tax = income*15/100.0;	           
 			  else if (income < 49000)
 				   tax = 3300 + (income-22000)*20/100.0;
 			  else if (income < 180000)
 			       tax = 8700 + (income-49000)*27/100.0;
 			  else if (income < 600000)
 				   tax = 44070 + (income-180000)*35/100.0;
 			  else if (income >= 600000)
 				   tax = 191070 + (income-600000)*40/100.0;
 	 		   System.out.println("Income: " + income);
 	 	 	   System.out.println("Tax amount: " + tax);
 	 	 	   System.out.println("Income after tax: " + (income - tax));
 	 	       double RealTaxRate = tax/income*100;
 	 	 	   System.out.println("Real tax rate: " + (int)(RealTaxRate*100)/100.0 + "%"); 
 	 	    } 
 	 	   
 			  else {
 				  System.out.println("Undefined year value");
 				  
 			  }
 		   
 	   
 	   
	}

} 	   
 	  
 	   
 	   
 	   
 		   
 		   
 	   
 	   
			 
			  
 	     
 	   
 	   
 		   
 		   
 	   


 	   

		


