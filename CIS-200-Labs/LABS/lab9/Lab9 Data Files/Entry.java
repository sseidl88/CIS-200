/** MODEL
 * This class represents a single entry in an English-Spanish
 * dictionary.  It contains an English word and its Spanish translation.
 *
 */

public class Entry {
	// declare two private strings to hold english and spanish word
	private String english;
	private String spanish;
	/**
	 * Entry sets up a single English-Spanish entry
	 *
	 * @param english An English word
	 * @param spanish The Spanish translation
	 */
	public Entry(String e, String s) {
	// complete this constructor
		this.english = e;
		this.spanish = s;
	} // end constructor

	/**
	 * returns this entry's English word
	 *
	 * @return This entry's English word
	 */
	public String getEnglish() {
	// complete this get method
		return english;
	} // end getEnglish

	/**
	 * returns this entry's Spanish word
	 *
	 * @return This entry's Spanish word
	 */
	public String getSpanish() {
	// complete this get method
		return spanish;
	} // end getSpanish
	
} // end Entry class