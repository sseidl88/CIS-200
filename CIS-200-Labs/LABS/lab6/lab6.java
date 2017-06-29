/*
 * 
 * lab6.java
 * Samuel Seidl/ Lab Section Thursday A 4:00/ Atef Kahn
 */
import java.io.*;
import java.util.*;

public class lab6{
	public static void main(String[] args) throws IOException {
		//WRITE THIS METHOD LAST

	
		String fname = new String();
	

/*	
		if (args.length == 0) {
			System.out.println("no arguments were given.");
			System.exit(0);
		} else {
			 fname = args[0];
			} 
	*/
		
		
		//Scanner s = new Scanner(System.in);
		//System.out.print("Enter the name of the input file: ");
	//	String fname = s.nextLine();

		String [] str = getNames(fname);
		//This calls the getNames method to get back an array of
		//names from the file
		String []  initialsOfNames = new String [str.length];
	//	String[] names = getNames(fname);
		for (int i = 0; i < str.length; i++){
			initialsOfNames[i] = getInitial(str[i]);	
		}
	//	String [] allNames = getNames(fname);
		
	//	String [] allInitials = getInitial();
		
		printInitials(initialsOfNames);
		//YOU DO THIS: call printInitials (passing the names
		//array) to print the initials for each name.  You should
		//have just ONE line of code to call that method
	} // end main
	
	public static String getInitial(String fullName) throws IOException{
		//WRITE THIS METHOD FIRST
		
		StringBuilder Initials = new StringBuilder();
		
			String [] fullNameParts = fullName.split(" ");
			
		
			for (int i = 0; i < fullNameParts.length; i++){
				char intial = fullNameParts[i].charAt(0);
				Initials.append(intial);
			}
	
		return Initials.toString();

	} // end getInitial

	public static void printInitials(String[] allNames) {
		//WRITE THIS METHOD SECOND

		//allNames is an array of strings, where each element is
		//someone's full name (first, middle, last separated by spaces).

		//Loop through allNames, and for each element, display the
		//initials corresponding to that name.  You should call
		//getInitial on each full name to get the initials.  Then,
		//display the return value you get back from printInitials.
		for (int j = 0; j < allNames.length; j++){
			System.out.println(allNames[j]);
		}
		
		return ;
	} // end printInitials

	public static String[] getNames(String filename) throws IOException {
		//THIS METHOD IS DONE FOR YOU

		Scanner inFile = new Scanner(new File(filename));
		int size = Integer.parseInt(inFile.nextLine());
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			arr[i] = inFile.nextLine();
		}

		inFile.close();

		return arr;
	} // end getNames


} // end class