/** MODEL
 * This class holds all words in the English-Spanish dictionary.
 *
 */

import java.util.*;
import java.io.*;

public class Converter {
	private Entry[] dictionary;

	/**
	 * Converter loads the English-Spanish dictionary
	 *
	 * @param filename The filename of the dictionary
	 */
	public Converter(String filename) throws IOException {
		try{
		Scanner inFile = new Scanner(new File("engl2span.txt"));
		dictionary = new Entry[Integer.parseInt(inFile.nextLine())];
		for (int i = 0; i < dictionary.length; i++) {
			String line = inFile.nextLine();
			
	//YOU DO THIS
	//break line into the English section and the Spanish section
	//the two pieces are separated by a "\t" character -- use split or StringTokenizer
	String[] tokens = line.split("\t");
	//create a new Entry object with the English and Spanish parts,
	Entry e = new Entry(tokens[0], tokens[1]);
	//and store it at spot i in the dictionary array
			dictionary[i] = e;
			
		}
		inFile.close();
		}catch (FileNotFoundException e){
			System.out.println("file not found");
			System.exit(-1);
		}
	} // end Constructor

	/**
	 * translate returns the Spanish translation
	 * of english
	 *
	 * @param english The english word to translate
	 * @return The spanish translation, or a message that it couldn't be found
	 */
	public String translate(String english) {

	//YOU DO THIS
	for (int i=0; i< dictionary.length;i++){
		if (english.equals(dictionary[i].getEnglish())){
			return dictionary[i].getSpanish();
		}
		
	}
	return "Word not in dictionary";
	//loop through the dictionary array and see if the word passed in (english)
	//is found in the dictionary...if found, return the spanish translation
	//if NOT found, return message "Word not in dictionary"

	
	} // end translate
} // end Converter