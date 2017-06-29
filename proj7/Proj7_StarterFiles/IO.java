package proj7; 
/**
 * IO handles all input and output for the
 * four-square encryption algorithm
 *
 * <Add remaining required documentation here>
 */

import java.util.*;

public class IO {
	private Scanner s;

	/**
	 * IO sets up a new Scanner to System.in
	 */
	public IO() {
		s = new Scanner(System.in);
		
		String firstKey = firstKey();
		String secondKey = secondKey();
		
		Cipher cipher = new Cipher(firstKey, secondKey);
		
		boolean encrypt;
		char eOrD = encryptOrDecrypt();
		if((eOrD =='E') || (eOrD == 'e')){
			encrypt = true;
			printResults(cipher.encrypt(message(encrypt)), encrypt);
		} else {
			encrypt = false;
			printResults(cipher.encrypt(message(encrypt)), encrypt);
		}
	}

	/**
	 * firstKey returns the first key from the user
	 *
	 * @return The first key from the user
	 */
	public String firstKey() {
		//COMPLETE THIS TO GET THE FIRST KEY
			System.out.println("Enter the first key: ");
			String firstKey = s.nextLine();
		//UPDATE THIS LINE WHEN DONE
		return firstKey;
	} // end firstKey


	/**
	 * secondKey returns the second key from the user
	 *
	 * @return The second key from the user
	 */
	public String secondKey() {
		//COMPLETE THIS TO GET THE SECOND KEY
			System.out.println("Enter the second key: ");
			String secondKey = s.nextLine();
		//UPDATE THIS LINE WHEN DONE
		return secondKey;
	} // end secondKey

	/**
	 * gets and returns whether the user wants to encrypt or decrypt
	 *
	 * @return 'e' for encryption, and 'd' for decryption
	 */
	public char encryptOrDecrypt() {
		//COMPLETE THIS TO GET THE ENCRYPT OR DECRYPT OPTION
			System.out.println("Enter (e)ncrypt or (d)ecrypt: ");
			char eOrD = (s.nextLine()).charAt(0);
		//UPDATE THIS LINE WHEN DONE
		return eOrD;

	} // end encryptOrDecrypt

	/**
	 * message returns the message from the user
	 *
	 * @param encrypt True if encrypting, false if decrypting
	 *
	 * @return The message from the user
	 */
	public String message(boolean encrypt) {
		//COMPLETE THIS TO GET THE MESSAGE
		String message;	
		//Cipher cipher = new Cipher();
			if(encrypt){
				//cipher.ecrypt(message);
				System.out.println("Enter the message to encrypt: ");
				 message = s.nextLine();
			}else{
				System.out.println("Enter the message to decrypt: ");
				 message = s.nextLine();
				//cipher.decrypt(message);
			}
		//UPDATE THIS LINE WHEN DONE
		return message;
	} // end message

	/**
	 * printResults prints the encrypted and decrypted messages
	 *
	 * @param msg The resulting message
	 * @param encrypt True if encrypting, false if decrypting
	 */
	public void printResults(String msg, boolean encrypt) {
		//COMPLETE THIS TO PRINT THE RESULTS
		if (encrypt){
			System.out.println("Encrypted message: " + msg);
		}else{
			System.out.println("Decrypted message: " + msg);
		}
	
	} // end printResults

	/*
	 * printError prints an error message
	 *
	 * @param err The error message to print
	 */
	public void printError(String err) {
		//COMPLETE THIS TO PRINT THE ERROR MESSAGE
		System.out.println(err);
	} // end printError

} // end class