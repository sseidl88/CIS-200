//package proj6;
/**
 * <proj6>
 * <Samuel Seidl / Lab Section Thursdays 4 / Atef Khan>
 *
 * <This class takes in the inputs that the users have given in the student app and creates an object around those inputs and calculates the grade>
*/ 

import java.text.*;
public class Student{
	 
	 DecimalFormat df = new DecimalFormat("0.0");
	 
	 
	 double projectPossible;
	 double labPossible;
	
	private String fullName;
	private String WID;
	

	
	private double totalLabScore;
	private double totalProjectScore;
	private double totalCodeLabScore;
	private double totalExamScore;
	private double totalFinalScore;
	private double overallPercent;
	
	private final double labWeight = .10;
	private final double projectWeight = .15;
	private final double codeLabWeight = .10;
	private final double examWeight = .45;
	private final double finalWeight = .20;
	
	
	/**
 * (A default no-argument constructor to initialize a Student object to given default values )
 *

 */ 

	public Student() {
		this.fullName = "no name";
		this.WID = "no WID";
		this.totalLabScore = 0.0;
		this.totalProjectScore = 0.0;
		this.totalCodeLabScore = 0.0;
		this.totalExamScore = 0.0;
		this.totalFinalScore = 0.0;
		this.overallPercent = 0.0;
	}
	
						//double labPossiblePoints, double projectPossiblePoints,
		/**
 * (A multi-argument constructor to initialize a Student object with values passed-in)
 *
 * @param (string name comes from the app)
 * @param (a double the represents the lab score)
 * @param (a double that represents the project score)
 @param ( a double that represents the users codeLab Score)
 @param (a double that represents the users exam score)
 @param (a double that represents the users final score)
 * @return (the student object)
 */ 
				
	public Student(  String name, String wid, double lab, double project, double codeLab, double exam, double finalTest){
		
		//this.labPossible = 0.0;
		//this.projectPossible = 0.0;
		
		this.fullName = name;
		this.WID = wid;
		this.totalLabScore = lab;
		this.totalProjectScore = project;
		this.totalCodeLabScore = codeLab;
		this.totalExamScore = exam;
		this.totalFinalScore = finalTest;
	}


	/**
 * (nothing is read in, it gets the lab score)
 *
 * 
 * 
 * @return (the lab score)
 */ 

	public double getLabPoints(){
		return labPossible;
	}
	/**
 * (nothing is read in gets the possible project points)
 *
 * 
 * @return (the possible amount of project points)
 */ 

	public double getProjectPoints(){
		return projectPossible;
	}
	
	/**
 * (nothing is read in it gets the students name)
 *
 
 * @return (the full name of the student)
 */ 

	public String getName(){
		return fullName;
	}
	/**
 * (nothing is read in and it gets the students wid )
 *

 * @return (the wid of the student)
 */ 

	public String getWID(){
		return WID;
	}
	/**
 * (nothing is read in and it gets the students lab score )
 *
 
 * @return (the total lab score of the student)
 */ 

	public double getLabs(){
		return totalLabScore;
	}
	/**
 * (nothing is read in and it gets the students project score)
 *

 * @return (the total project score of the student)
 */ 

	public double getProject(){
		return totalProjectScore;
	}
	/**
 * (nothing is read in and it gets the students code lab score)
 *

 * @return (the total code lab score of the student)
 */ 

	public double getCodeLab(){
		return totalCodeLabScore;
	}
	/**
 * (nothing is read in and it gets the students exam  score)
 *

 * @return (the total exam score of the student)
 */ 

	public double getClassExams(){
		return totalExamScore;
	}
	/**
 * (nothing is read in and it gets the students final score)
 *

 * @return (the total final score of the student)
 */ 

	public double getFinalExam(){
		return totalFinalScore;
	}
	/*
	private void weightedPercent(){
		//Within points possible, the adjusted points for each category = total points possible x Weight %. 
		//Within each student, the adjusted points for each category = (points earned / points possible) x AdjustePoints 
		//final grade percentage, divide the total adjusted points the student earned (710.4) by the total points possible (1075)
	
	
		//lab adjusted 
			 double labAdjusted= labPossible * labWeight;
		//project adjusted
		double projectAdjusted = projectPossible * projectWeight;
		//codeLab adjusted
		double codeLabAdjusted = CodeLab * codeLabWeight;
		//exam adjusted 
		double examAdjusted = exam * examWeight;
		//final exam 
		double finalAdjusted = finalExam * finalWeight;
	
	
	}
	*/
	/**
 * (calculates the adjusted scores fr the categories based upon the weight of each)
 *
 * @param (the total amount of points possible )
 * @param (the students code lab score )
 * @param (the total amount of points that the student got from the exams)
 * @param (the amount of points the student got on their final exam )
 * @param (the number of possible points there are for the lab)
 * @param (the number of possible points there are for the projects)
 * (list all parameters, one per line)
 * @return (the students grade in percent is being returned)
 */ 

	private double weightedPercent(double totalPointsPossible, double CodeLab, double exams,double  finalExam,double  labPossible, double projectPossible){
		//double totalPointsPossible = labPossible + projectPossible + CodeLab + exams + finalExam;
		double labAdjusted= totalPointsPossible * labWeight;
		double projectAdjusted = totalPointsPossible * projectWeight;
		double codeLabAdjusted = totalPointsPossible * codeLabWeight;	
		double examAdjusted = totalPointsPossible * examWeight;
		double finalAdjusted = totalPointsPossible * finalWeight;
		
		double lab = (this.getLabs()/labPossible) * labAdjusted;
		double project = (this.getProject()/projectPossible) * projectAdjusted;
		double codeLab = (this.getCodeLab()/ CodeLab) * codeLabAdjusted;
		double examTotal = (this.getClassExams()/exams) * examAdjusted;
		double finalExamScore = (this.getFinalExam()/finalExam) * finalAdjusted;
		
		this.overallPercent = 100 * ((lab + project + codeLab + examTotal + finalExamScore)/totalPointsPossible);
		return overallPercent;
	}
	
	
		/**
 * (reads in the information given in the app and passes it to the private method weightedPercent)
 *
  * @param (the total amount of points possible )
 * @param (the students code lab score )
 * @param (the total amount of points that the student got from the exams)
 * @param (the amount of points the student got on their final exam )
 * @param (the number of possible points there are for the lab)
 * @param (the number of possible points there are for the projects)
 * @return (nothing because it is void)
 */ 
	public void passIn(double totalPointsPossible, double CodeLab, double exams,double  finalExam,double  labPossible, double projectPossible){
		weightedPercent(totalPointsPossible, CodeLab, exams, finalExam, labPossible, projectPossible);
		
		//return overallPercent;
	
	}
	/*
	public Student(String fullName2, String wid2, double labs, double projects, double codeLab2, double exams2,
			double finalExam2) {
		// TODO Auto-generated constructor stub
	}
	*/
	/**
 * (displays the students name lastname, firstname)
 *
 * @param (the students full name )
 * @param (describe second parameter)
 * (list all parameters, one per line)
 * @return (the students name but in the correct format)
 */ 

	public String orderName(String fullName){
		String [] name = fullName.split(" ");
		return (name[1] + "," + name[0]);
	}
	/**
 * (calculating the letter grade of the student)
 *
 * @param (the users grade in percent is passed into this method)
 * @param (describe second parameter)
 * (list all parameters, one per line)
 * @return (describe what is being returned)
 */ 

	public char letterGrade(double overallPercent){
		
		if(overallPercent >= 89.5){
			return 'A';
		}else if ((overallPercent >= 79.5) && (overallPercent < 89.5)){
			return 'B';
		}else if ((overallPercent >= 68.5)&&(overallPercent < 79.5)){
			return 'C';
		}else if ((overallPercent >= 58.5)&&(overallPercent < 68.5)){
			return 'D';
		}else{
			return 'F';
		}
	}
/**
 * (displays the information that is passed into for each student object)
 *

 * @return (a string that displays the required information )
 */ 

	public  String toString() {
		return ("\nStudent name: " + orderName( fullName ) +
				"\nWID: " + WID +
				"\nOverall %: " + df.format( overallPercent ) + "%" +
				"\nFinal Grade: " +  letterGrade( overallPercent )); 
			//+	"\n\t\t Press enter to display next Student...");
	}
		/*
		if(overallPercent >= 89.5){
			return ("Final Grade: A");
		}else if ((overallPercent >= 79.5) && (overallPercent < 89.5)){
			return ("Final Grade: B");
		}else if ((overallPercent >= 68.5)&&(overallPercent < 79.5)){
			return ("Final Grade: C");
		}else if ((overallPercent >= 58.5)&&(overallPercent < 68.5)){
			return ("Final Grade: D");
		}else{
			return ("Final Grade: F");
		}
		*/
	
}
