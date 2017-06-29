package proj7;

import java.util.ArrayList;

/**
 * Cipher handles the encryption and decryption of
 * messages according to the four-square cipher algorithm.
 *
 * <Add remaining required documentation here>
 */

public class Cipher {
	private Square plain1;
	private Square plain2;
	private Square cipher1;
	private Square cipher2;

	/**
	 * Cipher creates the four squares based on
	 * two keys for the four-square cipher algorithm.
	 *
	 * @param key1 The first key (no Q's)
	 * @param key2 The second key (no Q's)
	 */
	public Cipher(String key1, String key2) {
		//COMPLETE THIS CONSTRUCTOR
		//CREATE plain1, plain2, cipher1, and cipher2
	
		plain1 = new Square();
		plain2 = new Square();
		
		cipher1 =new Square(key1);
		cipher2 = new Square (key2);
	} // end 2 arg constructor

	/**
	 * encrypt returns the encrypted message using the
	 * four-square cipher algorithm
	 *
	 * @param message The message to encrypt
	 *
	 * @return The encrypted message
	 */
	public String encrypt(String message) {
		String encryptedMessage = "";
		
		ArrayList<String>  group = new ArrayList<String>();
		int count = 0;
		
		while (count < message.length()){
			if (message.length()-count != 1){
				group.add(message.substring(count,count + 2));
				count++;
			}else{
				group.add(message.substring(count));
				count++;
				
			}
		}
		
		for(int i = 0; i < group.size(); i++){
			char first = group.get(i).charAt(0);;
			char second = '-';
			
			if(group.get(i).length() > 1){
				second = group.get(i).charAt(1);
			}
			
			if(first == ' ')first = '_';
			if (second == ' ')second = '_';
			
			int[]firstPosition = plain1.getPos(first);
			int[]secondPosition = plain2.getPos(second);
			
			char char1 = cipher1.getChar(firstPosition[0], secondPosition[1]);
			char char2 = cipher2.getChar(secondPosition[0], firstPosition[1]);
			
			System.out.println(first + "," + firstPosition[0] + secondPosition[1] + "," + char1);
			System.out.println(second + "," + secondPosition[0] + firstPosition[1] + "," + char2);
			
			encryptedMessage += char1;
			encryptedMessage += char2;
		}
		return encryptedMessage;
	} // end encrypt

	/**
	 * decrypt returns the decrypted message using the
	 * four-square cipher algorithm
 	 *
	 * @param message The message to decrypt
	 *
	 * @return The decrypted message
	 */
	public String decrypt(String message) {
		
		
		//flip
		//plain1 = new Square();
	//	plain2 = new Square(true);
		
	//	cipher1 =new Square(key1);
	//	cipher2 = new Square (key2);
	


		String decryptedMessage = "";
		
		ArrayList<String>  group = new ArrayList<String>();
		int count = 0;
		
		while (count < message.length()){
			if (message.length()-count != 1){
				group.add(message.substring(count,count + 2));
				count++;
			}else{
				group.add(message.substring(count));
				count++;
				
			}
		}
		
		for(int i = 0; i < group.size(); i++){
			char first = group.get(i).charAt(0);;
			char second = '-';
			
			if(group.get(i).length() > 1){
				second = group.get(i).charAt(1);
			}
			
			
			
			int[] firstPosition = cipher1.getPos(first);
			int[] secondPosition = cipher2.getPos(second);
			
			char char1 = plain1.getChar(firstPosition[0], secondPosition[1]);
			char char2 = plain2.getChar(secondPosition[0], firstPosition[1]);
			
			System.out.println(first + "," + firstPosition[0] + secondPosition[1] + "," + char1);
			System.out.println(second + "," + secondPosition[0] + firstPosition[1] + "," + char2);
			
			decryptedMessage += char1;
			decryptedMessage += char2;
		}
		return decryptedMessage;
		
		
	} // end decrypt
} // end class