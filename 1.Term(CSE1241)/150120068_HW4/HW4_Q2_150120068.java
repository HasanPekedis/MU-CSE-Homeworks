//Hasan Pekedis 150120068
//This program's purpose is determine whether or not it is valid per the Luhn formula.
//Program displays whether the number is valid or invalid.
//I used validateNumber method for check input is right for code.
//Also validateNumber returns a boolean to main method.
//Main Method display all outputs.

import java.util.Scanner;

public class HW4_Q2_150120068 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		boolean ControlBoolean1 = validateNumber(number);
		
		if(ControlBoolean1 == true) {
			String str1="";
			for(int i=0;i<number.length();i++) {
				if(number.charAt(i)>=(char)48&&number.charAt(i)<=(char)57) {
					str1 = str1 + number.charAt(i);								
				}
				else if (number.charAt(i) == (char)32) {
					
				}
			}
			String DNumber = "";
			for(int k=0;k<str1.length();k++) {
				if(str1.length()%2==0) {
					if(k%2 ==0) {
						DNumber = DNumber + str1.charAt(k);
					}
					else if ((k%2 !=0)) {
						DNumber = DNumber + "_";
					}
				}
				else if(str1.length()%2!=0) {
					if(k%2 ==1) {
						DNumber = DNumber + str1.charAt(k);
					}
					else if ((k%2 !=1)) {
						DNumber = DNumber + "_";
					}
				}
			}
			System.out.println("DNumber:" + DNumber);
			String LNumber = "";
			for(int m=0;m<str1.length();m++) {
				if(str1.length()%2 ==0) {
					if(m%2==0) {
						if((str1.charAt(m)-48)*2<9) {
							LNumber = LNumber + (str1.charAt(m)-48)*2;
							                                     
						}
						else if((str1.charAt(m)-48)*2>9) {
							LNumber = LNumber + ((str1.charAt(m)-48)*2-9);
						}
						
					}
					else if (m%2!=0) {
						LNumber = LNumber + str1.charAt(m);
					}
				}
				else if(str1.length()%2 !=0) {
					if(m%2==1) {
						if((str1.charAt(m)-48)*2<9) {
							LNumber = LNumber + (str1.charAt(m)-48)*2;
							                                     
						}
						else if((str1.charAt(m)-48)*2>9) {
							LNumber = LNumber + ((str1.charAt(m)-48)*2-9);
						}
						
					}
					else if (m%2!=1) {
						LNumber = LNumber + str1.charAt(m);
					}
					
				}
			}
			System.out.println("LNumber:" + LNumber);
			int Total =0;
			for(int n=0;n<LNumber.length();n++) {
				Total = Total + (int)LNumber.charAt(n);
			}
			if(Total%10  == 0) {
				System.out.print("Number is Valid");
			}
			else if(Total%10 != 0) {
				System.out.print("Number is Invalid");				
			}
			
			
			
										
		 
			
		
		}
		else if (ControlBoolean1 == false) {
			System.out.print("Invalid Input !");
		}
		
		
		
		
	}
	public static boolean validateNumber (String number) {
		
		boolean ControlBoolean = true;
		String str="";
		for(int i=0;i<number.length();i++) {
			if(number.charAt(i)>=48&&number.charAt(i)<=57) {
				str = str + number.charAt(i);								
			}
			else if (number.charAt(i) == (char)32) {
				
			}
			else {
				ControlBoolean = false;
			}
		}
		return ControlBoolean;
		
	}
	
	

	
	
}
	

