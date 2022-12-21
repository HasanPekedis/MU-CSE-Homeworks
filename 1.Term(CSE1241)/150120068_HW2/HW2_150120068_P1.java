//Hasan Pekedis 150120068
//This program's purpose is calculate last character of ISBN number. 

import java.util.Scanner;

public class HW2_150120068_P1 {
	
       public static void main(String[] args) {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the first 9 digits of an ISBN as integer:");
    	   
    	   int MainNumber = input.nextInt() ;
    	   
    	   //Assume input is ABCDEFGHJ
    	   int J = MainNumber % 10;
    	   int H = MainNumber % 100 -J;
    	   H /= 10;
    	   int G = MainNumber % 1000 - H - J;
    	   G /= 100;
    	   int F = MainNumber % 10000 - G - H - J;
    	   F /= 1000;
    	   int E = MainNumber % 100000 - F - G - H - J;  
    	   E /= 10000;
    	   int D = MainNumber % 1000000 - E - F - G - H - J;    
    	   D /= 100000;
    	   int C = MainNumber % 10000000 - D - E - F - G - H - J;
    	   C /= 1000000;
    	   int B = MainNumber % 100000000 - C - D - E - F - G - H - J;
    	   B /= 10000000;
    	   int A = MainNumber % 1000000000 - B - C - D - E - F - G - H - J;
    	   A /= 100000000;
    	   
    	   int Y = ((A*1 + B*2 + C*3 + D*4 + E*5 + F*6 + G*7 + H*8 + J*9) % 11);
    	   
    	   if (Y == 10) {
    	 		  System.out.println("The ISBN-10 number is " + A + B + C + D + E + F + G + H + J + "X");
    	 		   
    	 	   }
    	 	   else {
    	 		  System.out.println("The ISBN-10 number is " + A + B + C + D + E + F + G + H + J + Y);
    	 		   
    	 	   }
   	}

   }
    			   
    	       
    		   
    		   
    	   
    		   

    	  
    			   
    			   
    		   
    	   

    	   
    	   
    	   
    	   
    	   
    			   
    	   
    	    
    	   
    	   
		   
			   
			   
			   
		   
		  

