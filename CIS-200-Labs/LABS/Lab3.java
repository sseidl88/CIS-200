/********************************************************************
* Lab3.java
* <Samuel Seidl / thursday 4:00 pm>
*
* This program Calculates the high low and average score for different classes as well as the highest score of all the classes and the overall average
*******************************************************************/
import java.util.*;

public class Lab3{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String input;
		
		
		char answer;
		int overallHigh = 0;
		double overallAverage = 0;
		int numberOfClasses = 0;
	
	do
	{
		int totalScores = 0;
		int highScore = 0;
		int lowScore = 100;
		int numScores = 0;
		int newScore;
		double average = 0;
		
		char section;
		
		
		
		System.out.println("Enter your section letter (e.g. A, B, C…): ");
		section = (s.nextLine()).charAt(0);
		
		do
		{
			System.out.println("Enter your exam score (0-100), enter a negative number to stop: ");
			input = s.nextLine();
			newScore = Integer.parseInt(input);
			
		
			if (newScore >= 0) //doesn't add the negative number 
			{
			totalScores = totalScores + newScore;
			numScores ++;
			//nested if statements?
				if (newScore > highScore)//high score
				{
					
					highScore = newScore;
				}
				if (newScore < lowScore)
				{
					
					lowScore = newScore;
				}
			
			
			}
			/*if ((newScore > highScore) && (newScore >= 0))//high score
			{
				newScore = highScore;
			}
			if ((newScore < lowScore) && (newScore >= 0))
			{
				newScore = lowScore;
			}*/
			
		} while ( newScore >= 0);
		System.out.println("Class section: " + section);
		System.out.println("The number of scores entered: " + numScores);
		average = totalScores/numScores;
		System.out.println("The class average for that section was: " + average);
		System.out.println("The class high was: " + highScore);
		System.out.println("The class low was: " + lowScore);
		numberOfClasses ++; //adds one to the number of classes taken
		System.out.print("Do you want to enter scores for another section? Y)es N)o?");
		answer =  (s.nextLine()).charAt(0);
		
		
		overallAverage = (overallAverage + average); // takes all of the averages and divides by the number of averages
		if (overallHigh < highScore){
			overallHigh = highScore;
		}
		
		
	}while ((answer == 'Y') || (answer == 'y'));
		
	overallAverage = overallAverage/ numberOfClasses;
		
		System.out.printf("The overall average: %.2f\n", + overallAverage);
		System.out.println("The overall high score was: " + overallHigh);
		
		
		
	}//end main
}//end class
