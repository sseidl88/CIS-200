/** CONTROLLER
 * This program is an English-Spanish translator.
 *
 * @author <Your Name>
 * @version Lab 9
 */
import java.util.*;
import java.io.*;

public class Lab9 {
	/**
	 * main handles the control flow for the program
	 *
	 * @param args Should hold the dictionary filename
	 */
	public static void main(String[] args) throws IOException {
		//YOU DO THIS
		
		// get the name of the input file as a command-line argument (should be in args[0])
			String name = args[0];
		// create an IO object
		IO_GUI io = new IO_GUI();
		// create a Converter object and pass to the constructor the name of the input file
		Converter converter = new Converter(name);
		// while the user doesn't just press Enter
			boolean enter = false;
			while(true){
			// get an English word from the user (call the getWord method in IO)
			// get the Spanish translation for the word (call the translate method in Converter)
			// print the translation (call the printTranslation method in IO)
				String english = io.getWord();
				String spanish = converter.translate(english);
				io.printTranslation(english, spanish);
			}
	}
}