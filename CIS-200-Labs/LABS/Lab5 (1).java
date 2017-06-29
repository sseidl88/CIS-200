import java.util.*;
import java.io.*;

public class Lab5 {
	public static void main(String[] args) throws IOException {
		
		
		int numGuess = 0;
		Scanner inFile = new Scanner(new File("Lab5_Words.txt"));
		Scanner s = new Scanner(System.in);
		String[] words = new String[Integer.parseInt(inFile.nextLine())];
		
		
		for (int i = 0; i < words.length; i++) {
			words[i] = inFile.nextLine();
		}
		inFile.close();
		
		
		
		Random rand = new Random();
		int index = rand.nextInt(words.length);
		String correctAnswer = words[index];
		//Randomly pick a word from the words array and assign to a variable called correctAnswer
		
	//this is the answer key which I sometimes need because I stink at this game
	//	System.out.println(correctAnswer);
		
		StringBuilder build = new StringBuilder(correctAnswer);
		StringBuilder scramble = new StringBuilder();
		while (build.length() != 0){
			int randomIndex = rand.nextInt(build.length());
			char randomChar = build.charAt(randomIndex);
			scramble.append(randomChar);
			build.deleteCharAt(randomIndex);
			
		}
		 
		
		/*
		int count = 0;
		boolean [] used = new boolean[correctAnswer.length()];
		StringBuilder build = new StringBuilder();
		while(count < correctAnswer.length()){
			int pos = rand.nextInt(correctAnswer.length());

			if(used[index]==false)
			{
				build.append(correctAnswer.charAt(pos));
			used[index]=true;
			count++;
			}
			
			*/
			
			
		
		
		//game
		 System.out.println("");
	 	int answer = 0;
	 	
	 
	 	do{
	 		System.out.println("Unscramble the letters " + scramble);
			String guess = s.nextLine();
			
			if (guess.equalsIgnoreCase(correctAnswer)){
				System.out.println("You win!");
				answer = 1;
			}else{
				System.out.println("Try again");
				answer = 0;
				numGuess++;
			}
			
			
		}while(answer == 0);
		System.out.println("It took you " + numGuess + " tries");
	
	}
}