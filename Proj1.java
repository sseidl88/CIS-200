/*
* <Proj1>
* <Samuel Seidl / Thursday 4pm / Atef Khan>
*
* <Program that calcuates the grade in a class and how many pizzas to order and how many leftover slices there will be>
*/

import java.util.*;

public class Proj1 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		
		String input;
		double project1 ;//Project score #1
		double project2;//Project score #2
		double project3;//Project score #3
		double midterm ;//midterm exam score
		double finalExam; //final exam score
		final int POINTSPOSSIBLE = 290;

		System.out.print("Enter in Project score #1 (0-30): ");
		input = s.nextLine();
		project1 = Double.parseDouble(input);
		
		
		System.out.print("Enter in Project score #2 (0-30): ");
		input = s.nextLine();
		project2 = Double.parseDouble(input);
		
		System.out.print("Enter in Project score #3 (0-30): ");
		input = s.nextLine();
		project3 = Double.parseDouble(input);
		System.out.println("");
		
		System.out.print("Enter the midterm exam score (0-100): " );
		input = s.nextLine ();
		midterm = Double.parseDouble(input);
		
		System.out.print("Enter the final exam score:(0-100): ");
		input = s.nextLine ();
		finalExam = Double.parseDouble(input);
		
		String total = String.format("Overall grade percentage: %.2f", ((project1 + project2 + project3 + midterm + finalExam)/POINTSPOSSIBLE) * 100 ) ;
		System.out.printf(total);
		System.out.println ("%");
		System.out.println("");
		

			
		final int LARGEPIZZA = 20;
		final int PERPERSON = 2;
		int peopleAmmount;
		int leftover;
		
		
		
		System.out.print("What is the number of people expected at the pizza party? " );
		input = s.nextLine ();
		peopleAmmount = Integer.parseInt(input);
		System.out.println("");
		
		int sliceAmount = (peopleAmmount * PERPERSON);
		
		if ( sliceAmount == 40) {
			
		String pizzaTotal= String.format ("For " + peopleAmmount + " people, that would be 2 pizza(s) with each having  " + PERPERSON + "  slices each. There would be 0 slice(s) leftover");
		System.out.printf("pizzaTotal");
		}
		
		if (sliceAmount < 20) {
				
			leftover = (20 - sliceAmount);
			String pizzaTotal = String.format ("For " + peopleAmmount + " people, that would be 1 pizza(s) with each having  " + PERPERSON+ "  slices each. There would be " + leftover + " slice(s) leftover");
			System.out.printf(pizzaTotal);
				
		} else {
			leftover = (40 - sliceAmount); // need to declare variable
			String pizzaTotal = String.format ("For " + peopleAmmount + " people, that would be 2 pizza(s) with each having " + PERPERSON + " slices each. There would be " + leftover + " slice(s) leftover");
			System.out.printf(pizzaTotal);
					
		} //end of else
			 //end of second if statement 
		

		
	
	} //end of main
} //end 