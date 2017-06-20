/*
* <Proj3>
* <Samuel Seidl / Thursday 4pm / Atef Khan>
*
* <This program calculates the slope and y intercept of two user entered points and graphs them>
*/
import java.util.*;
public class Proj3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		String input;
		int x1;
		int y1;
		int x2;
		int y2;
		char answer;
		double slope;//change to double and fix you idiot
		double yIntercept;
		int run = 0;
		int reRun = 0;
	

	//do{
		do {
		
		
			do {
				if (reRun < 1){
					System.out.print("Enter x1: ");
					input = s.nextLine();
					x1 = Integer.parseInt(input);
					
					System.out.print("Enter y1: ");
					input = s.nextLine ();
					y1 = Integer.parseInt(input);
					
					System.out.print("Enter x2: ");
					input = s.nextLine ();
					x2 = Integer.parseInt(input);
					
					System.out.print("Enter y2: ");
					input = s.nextLine ();
					y2 =  Integer.parseInt(input);
					
				}else {
					System.out.print("Re-enter x1: ");
					input = s.nextLine();
					x1 = Integer.parseInt(input);
					
					System.out.print("Re-enter y1: ");
					input = s.nextLine ();
					y1 = Integer.parseInt(input);
					
					System.out.print("Re-enter x2: ");
					input = s.nextLine ();
					x2 = Integer.parseInt(input);
					
					System.out.print("Re-enter y2: ");
					input = s.nextLine ();
					y2 =  Integer.parseInt(input);







				}
		
		
	if ((x1 == x2) && (y1 == y2)){
		System.out.println("Point values must be different");
		reRun++;
	}else if (x1 == x2){
		System.out.println("Line between points must have a slope (i.e. x1 and x2 must differ)");
		reRun++;
	}else if (y1 == y2){
		System.out.println("Line between points must have a slope (i.e. x1 and x2 must differ)");
		reRun++;
	}else if ((x1 > 9) || (x1 < 0)){
		System.out.println("All points must be between (0,0) & (9,9)");
		reRun++;
	}else if ((x2 > 9) || (x2 < 0)){
		System.out.println("All points must be between (0,0) & (9,9)");
		reRun++;
	}else if ((y1 > 9) || (y1 < 0)){
		System.out.println("All points must be between (0,0) & (9,9)");
		reRun++;
	}else if ((y2 > 9) || (y2 < 0)){
		System.out.println("All points must be between (0,0) & (9,9)");
		reRun++;
	}else {
		run = 1;
	}



} while(run ==0);
		
		
			
		
		
		
		
		
		
		
		
		slope = (y2 - y1)/(x2-x1);//makes slope
		
		yIntercept = y1 - (slope * x1);//finds y intercept
		System.out.println("y=" + slope +"x +" +yIntercept);
		
		
		
		
		
		
		
		
		
	
		
		
		
			int numRow;
			int numColumns = 0;		

		
		
		
			for (int row = 10; row >= 0; row--) 
			{	
				for ( int columns = 0; columns <= 10; columns++ ) {
					if ( columns == 0) {
						numRow = row - 1;
						if ( numRow >= 0) {
						System.out.print(numRow);
						}
						else {
							System.out.print(" ");
						} 
					} 
					else if ( columns == 1 ) {
						if ( ( y1 == ( row - 1 ) ) && ( x1 == ( columns - 1 ) ) ) {
							System.out.print("*");
						}
						else if ( ( y2 == ( row -1) ) && ( x2 == ( columns - 1) ) ) {
							System.out.print("*");
							
						}
						else if ( row >= 1) {
							System.out.print("|");
						}
						else {
							System.out.print(numColumns);
							numColumns++;
						} 
					} 
					else if ( (columns > 1) && (columns < 10) ) {
						if ( row == 0) {
						System.out.print(numColumns);
						numColumns++;
						}
						else if ( (( (y1 + 1) == row) && ( (x1 + 1) == columns) ) ) {
								System.out.print("*");
						}
						else if (( (y2 + 1) == row) && ( (x2 + 1) == columns)) {
								System.out.print("*");
							
						}
						else if ( row == 1) {
								System.out.print("_");
						}
						else {
							System.out.print("  ");
						} 	
					} 
					else if ( columns == 10 ) {
						if ( row == 0) {
						System.out.println(numColumns);
						numColumns++;
						}
						else if ( (( (y1 + 1) == row) && ( (x1 + 1) == columns) ) ) {
							System.out.println(" *");
						}
						else if (( (y2 + 1) == row) && ( (x2 + 1) == columns)) {
								System.out.println(" *");
							
						}
						else if ( row == 1) {
								System.out.println("_");
						}
						else {
								System.out.println("  ");
						}
		
						
		
					}
				}
			}
		reRun++;
		
		
		System.out.println("Do you want to enter scores for another section? Y)es N)o?");
		answer =  (s.nextLine()).charAt(0);//asking the user to stop the project
		
		} while ((answer == 'Y') || (answer == 'y'));;
		
		
		
		
		
	}//end of main 
}//end of class