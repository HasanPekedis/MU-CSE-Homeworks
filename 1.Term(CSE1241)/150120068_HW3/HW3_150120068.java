//Hasan Pekedis 150120068
//This Program's purpose is drawing shapes with user's input.
//First step user chooses shape from 1-6.
//Then enter coordinate inputs, and program shows graph of shape that chosen by user.
//I used while loops to use again and again. I used switch method for find shape that user wants.
//I used ControlBoolean for break the while loop with 6. choice.
//Recently,I coded 5 diffrent methods for each shape. 
import java.util.Scanner;
public class HW3_150120068 {
	public static void main(String[] args) {
		boolean ControlBoolean = true;
		while(ControlBoolean) {
			Scanner input = new Scanner(System.in);
		    System.out.println("Which shape would you like to draw?\r\n" + 
				"1. Line\r\n" + 
				"2. Triangle\r\n" + 
				"3. Rectangle\r\n" + 
				"4. Parabola\r\n" + 
				"5. Circle\r\n" + 
				"6.Exit");
		    int ShapeCode = input.nextInt();
		    
	    		    		    
		    switch(ShapeCode) {
		    case 1 :
				System.out.print("Line formula is y = ax + b\r\n" + 
						"Please enter the coefficients a and b:");
				int a1 = input.nextInt();
			    int b1 = input.nextInt();
		    	line(a1,b1);
		    	break;
		    case 2 :
		    	System.out.print("For triangle, we need the coordinates of the points for three vertices.\r\n" + 
		    			"Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
		    	double a2 = input.nextDouble();
		    	double b2 = input.nextDouble();
		    	double c2 = input.nextDouble();
		    	double d2 = input.nextDouble();
		    	double e2 = input.nextDouble();
		    	double f2 = input.nextDouble();
		    	triangle(a2,b2,c2,d2,e2,f2);
		    	break;
		    case 3 :
		    	System.out.print("For rectangle, we need the coordinates of the points for three vertices.\r\n" + 
						"Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
		    	int a3 = input.nextInt();
			    int b3 = input.nextInt();
				int c3 = input.nextInt() ;
				int d3 = input.nextInt() ;
				int e3 = input.nextInt() ;
				int f3 = input.nextInt() ;		    	
		    	rectangle(a3,b3,c3,d3,e3,f3);
		    	break;
		    case 4 :
		    	System.out.print("Parabola formula is y = ax^2 + bx + c\r\n" + 
		    			"Please enter the coefficients a, b and c:");
		    	int a4 = input.nextInt();
			    int b4 = input.nextInt();
				int c4 = input.nextInt() ;
				parabol(a4, b4,c4);
				break;
		    case 5 :
		    	System.out.print("Circle formula is (x-a)^2 + (y-b)^2 = r^2\r\n" + 
		    			"Please enter the coordinates of the center (a,b) and the radius:");
		    	int a5 = input.nextInt();
			    int b5 = input.nextInt();
				int c5 = input.nextInt();
				circle(a5,b5,c5);
				break;
		    case 6 :
		    	ControlBoolean = false;
		    	break;
				
		    	
		    	
		    	 
		    }
		}			
}
	public static void line(int a1,int b1) {				
		
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {	
					if ((a1  * x + b1) == 0) {
						System.out.print("*");}				
				    else if (x == 0) {
					    System.out.print("|");}
				    else if (x == 11) {				    
					    System.out.print("x");}				    
				    else {
				    	System.out.print("-");}				    						    
				}
				else if ((a1 * x + b1) == y){
				    System.out.print("*");
				    }
				
				else if (x == 0) {
					if (y == 10) {
						System.out.print("y");}
					else {
						System.out.print("|");}
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");			
				
	}

}
	
	public static void triangle(double a2, double b2, double c2, double d2, double e2, double f2) {
		double m1 = (d2 - b2) / (c2 - a2); // 1 and 2  4/5
		double m2 = (f2 - b2) / (e2 - a2); // 1 and 3  0
		double m3 = (d2 - f2) / (c2-e2); // 2 and 3  -4/5
		
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {	
					if ( m1*(x-a2) + b2 == 0) {
						if(x<= Math.max(a2, c2) && x>=Math.min(a2, c2)) {
							if(y<= Math.max(b2, d2) && y>=Math.min(b2, d2)) {
								System.out.print("*");}	
							else {
								System.out.print(" ");}								
					    }														
						else { 
							System.out.print(" ");}						
						}	
					else if ( m3*(x-c2) + d2 == 0) {
						if(x<= Math.max(e2, c2) && x>=Math.min(e2, c2)) {
							if(y<= Math.max(f2,d2)  && y>=Math.min(f2,d2)) {
								System.out.print("*");}
							else {
								System.out.print(" ");}
						}																														   
						else { 
							System.out.print(" ");}
					}
					else if ( m2*(x-e2) + f2 == 0) {
						if(x<= Math.max(e2, a2) && x>=Math.min(e2, a2)) {
							if(y<= Math.max(b2,f2)   && y>=Math.min(b2,f2)) {
								System.out.print("*");}
							else {
								System.out.print(" ");}
							}							
						else { 
							System.out.print(" ");}
						}
				    else if (x == 0) {
					    System.out.print("|");}
				    else if (x == 11) {				    
					    System.out.print("x");}				    
				    else {
				    	System.out.print("-");}				    						    
				}
				else if (m1*(x-a2) + b2 == y) {
					if(x<= Math.max(a2, c2) && x>=Math.min(a2, c2)) {
						if(y<= Math.max(b2, d2) && y>=Math.min(b2, d2)) {
							System.out.print("*");}
						else {
							System.out.print(" ");}}																																						
					else { 
						System.out.print(" ");}
				    }
				else if (m3*(x-c2) + d2 == y){
					if(x<= Math.max(e2, c2) && x>=Math.min(e2, c2)) {
						if(y<= Math.max(f2,d2)  && y>=Math.min(f2,d2)) {
							System.out.print("*");}
						else { 
							System.out.print(" ");}}
					else { 
						System.out.print(" ");}
				    }
				else if (m2*(x-e2) + f2 == y){
					if(x<= Math.max(e2, a2) && x>=Math.min(e2, a2)) {
						if(y<= Math.max(b2,f2)   && y>=Math.min(b2,f2)) {
							System.out.print("*");}
						else { 
							System.out.print(" ");};
						}
					
					else { 
						System.out.print(" ");};
				    }
				else if (x == 0) {
					if (y == 10) {
						System.out.print("y");}
					else {
						System.out.print("|");}
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
				
				
	}
	}
	
	public static void rectangle(int a3, int b3, int c3, int d3, int e3, int f3) {
			
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {
					if((b3>0) && (f3<0)) {
						if((x==a3)||(x==c3))
							System.out.print("*");
						else if(x==0)
							System.out.print("|");
						else if(x==11)
							System.out.print("x");
						else
							System.out.print("-");
					}
					else if(((b3>0)&&(f3>0))||(b3<0&&f3<0)){
						if(x == 0)
							System.out.print("|");
						else if (x==11)
							System.out.print("x");
						else
							System.out.print("-");												
					}
				}
				else if(x==0) {
					if ((c3>0)&&(a3<0)) {
						if ((y==b3)||(y==f3)) {
							System.out.print("*");
						}
						else if(y==10)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else if(((a3<0)&&(c3<0))||((a3>0)&&(c3>0))) {
						if(x==0)
							System.out.print("|");
						else if(x==11)
							System.out.print("x");
						else
							System.out.print("-");
					}
				}
				else if((x==a3)||(x==c3)) {
					if((y<=b3)&&(y>=f3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else if ((y==b3)||(y==f3)) {
					if((x<c3)&&(x>a3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println("");
		}
	}
	
	public static void parabol(int a4, int b4, int c4) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {	
					if ((a4 * x * x + b4 * x + c4) == 0) {
						System.out.print("*");}				
				    else if (x == 0) {
					    System.out.print("|");}
				    else if (x == 11) {				    
					    System.out.print("x");}				    
				    else {
				    	System.out.print("-");}				    						    
				}
				else if ((a4 * x * x + b4 * x + c4) == y){
				    System.out.print("*");
				    }
				
				else if (x == 0) {
					if (y == 10) {
						System.out.print("y");}
					else {
						System.out.print("|");}
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");			
				
	

				
			
		}
	}

	public static void circle(int a5, int b5, int c5) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {	
					if (((x-a5) * (x-a5) + (y-b5) * (y-b5) - c5*c5 ) == 0) {
						System.out.print("*");}				
				    else if (x == 0) {
					    System.out.print("|");}
				    else if (x == 11) {				    
					    System.out.print("x");}				    
				    else {
				    	System.out.print("-");}				    						    
				}
				else if ((x-a5) * (x-a5) + (y-b5) * (y-b5) == c5*c5){
				    System.out.print("*");
				    }
				
				else if (x == 0) {
					if (y == 10) {
						System.out.print("y");}
					else {
						System.out.print("|");}
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");			
				
	

				
			
		}
	}




}
	
	
	
	
	
	
	
	
	
	
	
