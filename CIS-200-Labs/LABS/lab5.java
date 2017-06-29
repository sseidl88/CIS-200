import java.util.*;
import java.io.*;
public class lab5 {
	public static void main(String[] args )throws IOException{
		String [] words = new String [5049];
		int i = 0;
		
		Scanner s = new Scanner(new File("Lab5_Words.txt"));
			 while (s.hasNext()) { 
			 String line = s.nextLine();  
			 words[i] =  line;
			 i++;
			 }  
			 s.close();
					
		
	/*	
		Scanner inFile = new Scanner( new File("Lab5_Words.txt"));
		
		
		while (inFile.hasNext()){
				String line = inFile.nextLine();
				System.out.println(line);
		}
		
		/*	
	for ( int i = 0; i < 5049; i++ ) {
			words[i] = readIn.nextLine();
		}
		
		for ( int i = 0; i < 5049; i++ ) {
			System.out.println(words[i]);
		}
	
*/	
	
	} //end main 


} //end