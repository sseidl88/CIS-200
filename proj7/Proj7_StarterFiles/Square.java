package proj7; 
/**
 * Square represents one of the squares in the four-square
 * cipher algorithm.
 *
 * <Add remaining required documentation here>
 */

public class Square {
	private char[][] matrix;

	/**
	 * Square constructs a matrix with the letters A-Z, skipping Q.
	 */
	public Square() {
		matrix = new char[5][5];
		
		
		
		int count = 0;
		char a = 'a';
		for(int i=0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				if ('A' + count =='Q')count++;
					matrix[i][j] = (char)('A'+ count);
					count++;
			}
			
		}
	
		
	} // end no-arg constructor

	/**
	 * Square first puts the characters from key into
	 * the matrix, and then fills the matrix with the remaining
	 * letters (skipping Q).
	 *
	 * @param key One of the encryption keys
	 */
	public Square(String key) {
		matrix = new char[5][5];

		//COMPLETE THIS CONSTRUCTOR
		//FILL matrix WITH key, THEN REMAINING A-Z, SKIPPING Q
			key = key.toUpperCase();
			key = key.replaceAll("\\s+","");
			key = removeDups(key);
			
			int countLetter1 = 0;
			int count1 = 0;
			
			for(int i = 0; i < matrix.length; i++){
				for (int j = 0; j < matrix[i].length; j++){
						String letter = Character.toString((char)('A' + count1));
						if (countLetter1 < key.length()){
							matrix[i][j] = (char)('A' + count1);
							countLetter1++;
						}else if (!strContains(key, letter.charAt(0)) && !letter.equals("Q")){
							matrix[i][j] = (char)('A' + count1);
							count1++;
						}else{
							count1++;
							j--;
						}
						}
				}
		
		
		
		
		
		
	} // end one-arg constructor

	/**
	 * getChar returns the character at a given
	 * row and column in the matrix.
	 *
	 * @param row The row to look in
	 * @param col The column to look in
	 *
	 * @return The character at (row, col)
	 */
	public char getChar(int row, int col) {
		//COMPLETE THIS METHOD
		//RETURN THE CHARACTER IN MATRIX AT POSITION row,col
			/*	char position = 0;
				for(int i = 0; i < matrix.length; i++){
					for(int j = 0; j < matrix[i].length; j++){
						if ((i == row) && (j==col)){
							position = [i][j];
						}
					}
				}
				*/
		//UPDATE THIS LINE WHEN DONE
		return matrix[row][col];
	} // end getChar

	/**
	 * getPos returns the [row,col] position
	 * of the given character.
	 *
	 * @param c The character to look for
	 *
	 * @return A 1D array holding the row and col of c stored in [0] and [1]
	 */
	public int[] getPos(char c) {
		//COMPLETE THIS METHOD
		//RETURN this array holding the row and col of c stored in [0] and [1], respectively
		int[] position = new int[2];
		
		// Search through matrix for 'c' and, when found
		// store row in pos[0] and col in pos[1]
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if (matrix[i][j] == c ){
					//int[][] character = new int[i][j]; 
					position[0] = i;
					position[1] = j;
					
					return position;
				}
			}
		}

		// If NOT found...
		//Leave this code in so that it will compile
		//Assuming char is found so don't need to
		//add code to handle if the char isn't found

		// character not found
				position[0] = -1;
				position[1] = -1;
				
		return position;	 
	} // end getPos

	/**
	 * strContains returns whether the given string
	 * contains the given character
	 *
	 * @param str The string to search
	 * @param c The character to search for
	 *
	 * @return true if c is in str else false
	 */
	private boolean strContains(String str, char c) {
			
		//COMPLETE THIS METHOD (Optional, but strongly suggested)
		
		//REMOVE THIS LINE WHEN DONE
		return str.contains(Character.toString(c));
		
	} // end strContains
	
	/*
	 * removeDups removes all duplicate characters
	 * from the string
	 *
	 * @param key The string to remove duplicates from
	 *
	 * @return The string with all duplicates removed
	 */
	private String removeDups(String key) {
		//COMPLETE THIS METHOD (Optional, but strongly suggested)
		String stringWO = "";	
			for(int i = 0; i < stringWO.length(); i++){
				if(!stringWO.contains(String.valueOf(stringWO.charAt(i)))){
					stringWO += String.valueOf(key.charAt(i));
				}
			}
		
		
		/*
			for(int i = 0; i < key.length(); i++){
				if (key.charAt(i) == key.charAt(i+1)){
		//			stringWO = key - charAt(i);						//******
				}
				
			}
		*/
		//REMOVE THIS LINE WHEN DONE
		return stringWO;

	} // end removeDups	

} // end class