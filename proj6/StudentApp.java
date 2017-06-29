//package proj6;
/**
 * <Full Filename>
 * <Samuel Seidl / Lab Section Thursdays 4 / Atef Khan>
 *
 * <This class asks the user for values, these values are passed to the student class in order to create the object based upon th user inputs>
*/ 

import java.util.*;


public class StudentApp{
	public static void main(String [] args){
		
		 final double CodeLab = 225;
		 final double exams = 150;
		 final double finalExam = 100;
		int count = 0;
		//boolean continue = true;
		char answer;
		
			Student [] studentArray = new Student [50];
			
			Scanner s = new Scanner(System.in);
		
			System.out.println("Enter total points possible for LABS: ");
			final double labPossible = Double.parseDouble(s.nextLine());
			System.out.println("Enter total points possible for PROJECTS: ");
			final double projectPossible = Double.parseDouble(s.nextLine());
			System.out.println("");
		
			final double totalPointsPossible = ( CodeLab + exams + finalExam + labPossible + projectPossible);
			
			int i = 0;
		do {
			
			/*
			int i = 0;
			StudentArray[i] = studentInformation();
			i++;
			*/
				//for (int i = 0; i < studentArray.length; i++){
			studentArray[i] = StudentInfo();
			studentArray[i].passIn(totalPointsPossible, CodeLab, exams, finalExam, labPossible, projectPossible);
			i++;
			
			
			count++;
			
			System.out.println(count + " Student(s) entered so far.");
			System.out.println("Up to 50 students can be entered.");
			System.out.println("Would you like to enter another student? ('Y' or 'N'); ");
			
				answer =  (s.nextLine()).charAt(0);
			/*	if ((answer == 'Y') || (answer == 'y')){
					continue = true;
				}else{
					continue = false;
				}
			*/
			}while(((answer == 'Y') || (answer == 'y')));
		
			for (int j = 0; j < count; j++){
				System.out.println( studentArray[j].toString());
				System.out.println("\n\t\t Press enter to display next Student...");
				String enterIsPressed = s.nextLine();
			}
			System.out.println("All students displayed...");
	}
	
	
	public static Student StudentInfo(){
		Scanner s = new Scanner(System.in);
			
		
		
		
			System.out.println("Enter the student's name (firstname lastname): ");
				String name = s.nextLine();
			System.out.println("Enter the student's WID: ");
				String wid = s.nextLine();
			System.out.println("");
			
			System.out.println("Enter student's total for all LABS: ");
				double lab = Double.parseDouble(s.nextLine());
			System.out.println("Enter student's total for all PROJECTS: ");
				double project = Double.parseDouble(s.nextLine());
			System.out.println("Enter student's score for CODELAB: ");
				double codeLab = Double.parseDouble(s.nextLine());
			System.out.println("Enter student's total for the 3 CLASS EXAMS: ");
				double exam = Double.parseDouble(s.nextLine());
			System.out.println("Enter student's score for the FINAL EXAM: ");
				double finalTest = Double.parseDouble(s.nextLine());
			System.out.println("");
			
			Student studentInformation = new Student(  name, wid, lab, project,  codeLab,  exam,  finalTest);
			
			return studentInformation;
			
	}
	
}