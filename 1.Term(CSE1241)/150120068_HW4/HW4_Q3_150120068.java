//Hasan Pekedis 150120068
//This program's purpose is draw a diamond shape whatever your letter input.
//I used constructDiamond for draw a diamond.
//Also ý used double dimensional array for store diamond.
//Then constructDiamond method returns double dimensional array to main method.
//Finally, printDiamond displays all outputs.

import java.util.Scanner;

public class HW4_Q3_150120068 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letter = input.next().charAt(0);
		int Diffrence = (int)letter - 65;
		char[][] diamond1 = constructDiamond(letter);

		System.out.println("Diamond for letter '"+ letter +"':");
		printDiamond(diamond1,Diffrence);
		
		
		

	}

	public static char[][] constructDiamond (char letter){
		int Diffrence = (int)letter - 65;
		int x=0;
		int y=0;
		char[][] diamond = new char[2*Diffrence+1][2*Diffrence+1]; 
		for (x = 0; x<=2*Diffrence ; x++) {
			for(y = 0; y<=2*Diffrence ; y++) {
				if(x==0) {
					if(y==Diffrence) {
						diamond[x][y] = 'A';
					}
					else {
						diamond[x][y] = ' ';
					}
				}
				else if((x!=0)&&x<=Diffrence) {
					if(x+y == Diffrence || y-x == Diffrence) {
						diamond[x][y] = (char)(x+65);
						
					}
					else {
						diamond[x][y] = ' ';
					}
					
				}
				else if((x!=2*Diffrence)&&(x<2*Diffrence)) {
					if((x-y==Diffrence)||x+y==3*Diffrence) {
						diamond[x][y] = (char)(letter-(x-Diffrence));
					}
					else {
						diamond[x][y] = ' ';
					}
					
				}
				else if(x==2*Diffrence) {
					if(y==Diffrence) {
						diamond[x][y] = 'A';
					}
										
				}
				
				
			}
		}
		
		
		return diamond;
		
	}
	public static void printDiamond (char[][] diamond, int Diffrence) {
		for (int a = 0; a<=2*Diffrence ; a++) {
			for(int b = 0; b<=2*Diffrence ; b++) {
				if(b==2*Diffrence) {
					System.out.println(diamond[a][b]);
				}
				else {
					System.out.print(diamond[a][b]);
				}
				
			}
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}


