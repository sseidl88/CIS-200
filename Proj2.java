/**
 * Proj2.java
 * <Samuel Seidl / Thursday 4pm / Atef Khan>
 *
 * <This program calulates total earnings based upon the users education level and age of retirement and shows how much more/less money they will make compared with different education levels>
*/ 


import java.util.*;

public class Proj2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
	
		String input;
		int currentYear;
		int degreeNumber;
		int currentAge;
		int retireAge;
		
		double payPerDegree;
		int agePerDegree;
		int yearPerDegree;
		double totalPayPerDegree;
		
		final int NODEGREEAMMOUNT = (493 * 52);
		final int HIGHSCHOOLAMMOUNT = (678 * 52);
		final int BACHAMMOUNT = (1137 * 52);
		final int MASTERSAMMOUNT = (1341 * 52);
		final int DOCAMMOUNT = (1623 * 52);
	
	
		System.out.println("\t1 = No Degree");
		System.out.println("\t2 = High School Degree");
		System.out.println("\t3 = Bachelor's Degree");
		System.out.println("\t4 = Masters Degree");
		System.out.println("\t5 = Doctorate Degree\n");
		
		System.out.print("Enter the number that corresponds to your degree: ");
		input = s.nextLine();
		degreeNumber = Integer.parseInt(input);
		
			//start education
		if (degreeNumber == 1)//no
		{ payPerDegree = NODEGREEAMMOUNT;
		} else if (degreeNumber == 2)//hs
		{
			payPerDegree = HIGHSCHOOLAMMOUNT;
		}else if (degreeNumber == 3)//bach
		{
			payPerDegree = BACHAMMOUNT;
		}else if (degreeNumber == 4)//masters
		{
			payPerDegree = MASTERSAMMOUNT;
		}else if (degreeNumber == 5)//doc
		{
			payPerDegree = DOCAMMOUNT;
		}else {
			System.out.printf("You entered an invalid menu choice. Please re-run the program and enter in a valid choice.");
			System.exit(0);
			payPerDegree = 0;
		}
		
		System.out.println("");
		
		System.out.print("Enter the current year: ");
		input = s.nextLine();
		currentYear = Integer.parseInt(input);
	
		System.out.print("Enter your current age: ");
		input = s.nextLine();
		currentAge = Integer.parseInt(input);
		
		System.out.print("Enter planned  age of retirement: ");
		input = s.nextLine();
		retireAge = Integer.parseInt(input);
		
		
	
		
		
		
		System.out.println("");
		
		//Based on current statistics...
		if (degreeNumber == 1)
		{ System.out.println("Based on current statistics and your lack of a degree:");
		} else if (degreeNumber == 2)
		{
			System.out.println("Based on current statistics and your High School degree:");
		}else if (degreeNumber == 3)
		{
			System.out.println("Based on current statistics and your Bachelor's degree:");
		}else if (degreeNumber == 4)
		{
			System.out.println("Based on current statistics and your Master's degree:");
		}else if (degreeNumber == 5)
		{
			System.out.println("Based on current statistics and your Doctorate degree:");
		}else {
			System.out.printf("You entered an invalid menu choice. Please re-run the program and enter in a valid choice.");
			System.exit(0);
			payPerDegree = 0;
		}
		
		
		
	 System.out.println("Your annual salary will be $" + payPerDegree);
		
	 System.out.println(" Retiring at the age " + retireAge + " in " + (currentYear + (retireAge - currentAge)) + " you will make a total of $" + ((retireAge - currentAge) * payPerDegree));
	
	//more than 
	
				if (degreeNumber == 1)
		{ 
				System.out.println("With a High School degree, you can earn $" + (((retireAge-currentAge)* HIGHSCHOOLAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT))  + " more than if you just had no degree.");
				System.out.println("With a Bachelor's degree, you can earn $" + (((retireAge-currentAge)* BACHAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT)) + " more than if you just had no degree.");
				System.out.println("With a Masters degree, you can earn $" + (((retireAge-currentAge)* MASTERSAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT)) + " more than if you just had no degree.");
				System.out.println("With a Doctorate degree, you can earn $" + (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT)) + " more than if you just had no degree.");
		} else if (degreeNumber == 2)
		{
			
			//less than hs
			System.out.println("That is $" +  (((retireAge-currentAge)* HIGHSCHOOLAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT))+ " more than if you only had no degree.");
			//more than hs
			System.out.println("With a Bachelor's degree, you can earn $" + (((retireAge-currentAge)* BACHAMMOUNT) - ((retireAge-currentAge)* HIGHSCHOOLAMMOUNT)) + " more than if you just had a High School degree.");
			System.out.println("With a Masters degree, you can earn $" + (((retireAge-currentAge)* MASTERSAMMOUNT) - ((retireAge-currentAge)* HIGHSCHOOLAMMOUNT)) + " more than if you just had a High School degree.");
			System.out.println("With a Doctorate degree, you can earn $" + (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* HIGHSCHOOLAMMOUNT)) + " more than if you just had a High School degree.");
		}else if (degreeNumber == 3)
		{
			
			//less than bach 
			System.out.println("That is $" +  (((retireAge-currentAge)* BACHAMMOUNT) - ((retireAge-currentAge)* HIGHSCHOOLAMMOUNT))+ " more than if you only had a High School degree.");
			System.out.println("That is $" +  (((retireAge-currentAge)* BACHAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT))+ " more than if you only had no degree.");
			
			//more than bach
			System.out.println("With a Masters degree, you can earn $" + (((retireAge-currentAge)* MASTERSAMMOUNT) - ((retireAge-currentAge)* BACHAMMOUNT)) + " more than if you just had a Bachelor's degree.");
			System.out.println("With a Doctorate degree, you can earn $" + (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* BACHAMMOUNT)) + " more than if you just had a Bachelor's degree.");
		}else if (degreeNumber == 4)
		{
			
			//less than masters 
			System.out.println("That is $" +  (((retireAge-currentAge)* MASTERSAMMOUNT) - ((retireAge-currentAge)* BACHAMMOUNT))+ " more than if you only had a Bachelor's degree.");
			System.out.println("That is $" +  (((retireAge-currentAge)* MASTERSAMMOUNT) - ((retireAge-currentAge)* HIGHSCHOOLAMMOUNT))+ " more than if you only had a High School degree.");
			System.out.println("That is $" +  (((retireAge-currentAge)* MASTERSAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT))+ " more than if you only had no degree.");
			
			
			
			//more than masters
			System.out.println("With a Doctorate degree, you can earn $" + (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* MASTERSAMMOUNT)) + " more than if you just had a Masters degree.");
		}else if (degreeNumber == 5)
		{
			
			//less than doc 
			System.out.println("That is $" +  (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* MASTERSAMMOUNT))+ " more than if you only had a Masters degree.");
			System.out.println("That is $" +  (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* BACHAMMOUNT))+ " more than if you only had a Bachelor's degree.");
			System.out.println("That is $" +  (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* HIGHSCHOOLAMMOUNT))+ " more than if you only had a High School degree.");
			System.out.println("That is $" +  (((retireAge-currentAge)* DOCAMMOUNT) - ((retireAge-currentAge)* NODEGREEAMMOUNT))+ " more than if you only had no degree.");
			
			
			
		}else {
			System.out.printf("You entered an invalid menu choice. Please re-run the program and enter in a valid choice.");
			System.exit(0);
			payPerDegree = 0;
		}
	
	

	
	
	} //end main
} //end