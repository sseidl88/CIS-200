
package lab4;
import java.util.*;
import java.text.*;

public class lab4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		final int numQuestions = 12;
		
		String  name;
		int classNum =0;
		int classHigh = 0;
		double classAverage = 0;
		int classLow = 10;
		
		DecimalFormat df = new DecimalFormat("#0.0");
		
		
		//char input;
		
		//char [] correctAnswers = new char [12];
		char []	correctAnswers = {'B','D','A','A','C','A','B','A','C','D','B','A'};
		
		char [] userAnswers = new char [12];
		
		//gets class number
		System.out.print("How many students are in the class?");
		classNum = Integer.parseInt(s.nextLine());
		
		
		for(int j = 0; j < classNum; j++){//start of class loop
			int numGotRight = 0;//starts the amount right at 0 each time
			
			
				//asks for students name
				System.out.println("");
				System.out.println("Enter student's name: ");
				name = s.nextLine();
				
				for (int i=0; i < userAnswers.length; i++){ //start student loop
					System.out.print("Enter your answer for Question"+(i+1)+":");
					char input = s.nextLine().toUpperCase().charAt(0);
					userAnswers[i] = input;
					//userAnswers[i] = s.nextLine.charAt(0);
					
					if  (userAnswers[i] == correctAnswers[i]){
						numGotRight++;
					
					}
					
					
				}
				double percentage = 	((numGotRight/12.0) * 100);
				
				System.out.println(name);
				System.out.println("You got " + numGotRight+ " out of " + numQuestions);
				System.out.print("The percentage of questions you got right was: " +df.format(percentage) + "%");
		

				if (numGotRight > classHigh){
					classHigh = numGotRight;
				} else if (numGotRight < classLow){
					classLow = numGotRight;
				}
				
				classAverage+=percentage;
		}//end of class for loop
				System.out.println("");
				System.out.println("");
				System.out.println("The high score is " + classHigh + " and the low score is " + classLow);
				System.out.println("Average is " + df.format(classAverage/classNum) + "%");
	
	}//end of main
	
	
	
}//end of class