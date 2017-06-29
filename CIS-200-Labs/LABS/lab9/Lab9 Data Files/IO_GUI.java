/** VIEW
 * This class handles all input and output for the
 * English-Spanish translator.
 *
 */

import java.util.*;
import javax.swing.JOptionPane;

public class IO_GUI {
	private Scanner s;
	
	public IO_GUI() {
		s = new Scanner(System.in);
	} // end constructor

	/**
	 * getWord prompts the user for an English word
	 *
	 * @return The English word entered by the user
	 */
	public String getWord() {
	//YOU DO THIS
	//Prompt user for English word and return that word
		//JOptionPane.showInputDialog("please enter the english word");
		//String english = s.nextLine();
		return JOptionPane.showInputDialog("please enter the english word");

	} // end getWord

	/**
	 * printTranslation prints an English word and its Spanish translation
	 *
	 * @param english The English word
	 * @param spanish The Spanish word
	 */
	public void printTranslation(String english, String spanish) {
	//YOU DO THIS
	//Display english word and its spanish equivalent 
		JOptionPane. showMessageDialog (null, english + "\n" + spanish);
	//	JOptionPane. showMessageDialog (null, spanish);
	} // end printTranslation
	
} // end class IO