/**
 * This project allows the user to enter as many courses as they desire and ask them specific information about those classes which are stored, 
 * it also prompts the user to delete one course and then add another one
 *
 
 * @author (Samuel Seidl)
 * @version (proj8)
*/ 
import java.util.*;

public class CourseApp {
	public static void main(String[] args){
		
		ArrayList <Course> classes = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		String answer = null;
		
		boolean clean = false;
		//boolean flag = true;
	do{
		
		//boolean works;
		do{
			clean = false;
			double price =0.0;
			try{
				System.out.print("Please enter the Course number:");
					String number = s.nextLine();
						if (number.equals("")){
							throw( new Exception("Course number was not given"));
						}
				System.out.print("Please enter the name of the course:");
					String courseName = s.nextLine();
					if (courseName.equals("")){
						throw( new Exception("Course Name was not given"));
					}
				System.out.print("Please enter the Instructor's name:");
					String teacherName = s.nextLine();
					if (teacherName.equals("")){
						throw( new Exception("Teacher Name was not given"));
					}
				System.out.print("please enter the instructor's email address:");
					String userName = s.nextLine();
					if (userName.equals("")){
						throw( new Exception("User name was not given"));
					}
				System.out.print("Please enter the title of the textbook:");
					String bookName = s.nextLine();
					if (bookName.equals("")){
						throw( new Exception("Book name was not given"));
					}
				System.out.print("Please enter the author of the textbook:");
					String authorName = s.nextLine();
					if (authorName.equals("")){
						throw( new Exception("Author name was not given"));
					}
					
					boolean isDouble = false;
			do{	
				isDouble = false;
				
				try{	
				
				
						
						System.out.print("Please enter the price of the textbook");
							 price = Double.parseDouble(s.nextLine());
				}catch( NumberFormatException e) {
					System.out.println("Please enter a double for the price");
					isDouble = true;
				//		double price = -1;
					}
			}while(isDouble);
				//pass in the values of author name, book name, and price to TextBook class
				TextBook text = new TextBook(bookName, authorName,price);
				
				//split teacherName into first and last name and then pass them, along with userName to the instructor class
					String[] tokens = teacherName.split(" ");
					String firstName = tokens[0];
					String lastName = tokens[1];
				Instructor instr = new Instructor(lastName, firstName, userName);
				
				//pass in the two objects created in instuctor and textbook along with the course name and number
				Course course = new Course( number,  courseName,  instr, text);
				classes.add(course);
			}
			catch(Exception e){
				 clean = true;
			}
		}while(clean);
			System.out.print("Do you want to enter another class? (y/n): ");
			answer = s.nextLine();
			
			System.out.print("\n");
		
		}while (answer.equalsIgnoreCase("y"));
		
		for(int i = 0; i < classes.size(); i++){
			
		
				System.out.println( classes.get(i).toString() );
				System.out.println("");
		//displays the to string method from course to display the number and name from the course
		
		//displays the toString method from the instructor class the returns the lastname, first and email address of the professor
		
		//displays the toString method from the textbook class that returns the title author and price of the textbook
		
		
		}
		boolean found;
	do{
		found = true;
		
		System.out.print("\nEnter a course number to be removed: ");
		String replicant = s.nextLine();
		
		for(int j = 0; j < classes.size(); j++){
			if (replicant.equalsIgnoreCase(classes.get(j).getNumber())){
				classes.remove(j);
				System.out.println("\nThe class has been removed");
				System.out.println("");
				found = false;
			}else if(j ==classes.size()){
				System.out.print("\nThat class could not be found, please try again");
				found = true;
			}
			
		}
	}while(found);
		//prints out the array list that now doesn't have the deleted course
						for(int i = 0; i < classes.size(); i++){
							
							
							System.out.println( classes.get(i).toString() );
							System.out.println("");
						}
	
	//once again prompts the user for one more course
		System.out.print("\n Enter one more class");	
			System.out.print("\nPlease enter the Course number:");
				String number = s.nextLine();
			
			System.out.print("Please enter the name of the course:");
				String courseName = s.nextLine();
				
			System.out.print("Please enter the Instructor's name:");
				String teacherName = s.nextLine();
				
			System.out.print("please enter the instructor's email address:");
				String userName = s.nextLine();
				
			System.out.print("Please enter the title of the textbook:");
				String bookName = s.nextLine();
				
			System.out.print("Please enter the author of the textbook:");
				String authorName = s.nextLine();
	
					double price = 0.0;
				boolean isDoubleAgain = false;
				do{	
					isDoubleAgain = false;
					
					try{	
					
					
							
							System.out.print("Please enter the price of the textbook");
								 price = Double.parseDouble(s.nextLine());
					}catch( NumberFormatException e) {
						System.out.println("Please enter a double for the price");
						isDoubleAgain = true;
					//		double price = -1;
						}
				}while(isDoubleAgain);
				
				
				
				TextBook text = new TextBook(bookName, authorName,price);
				
				//split teacherName into first and last name and then pass them, along with userName to the instructor class
					String[] tokens = teacherName.split(" ");
					String firstName = tokens[0];
					String lastName = tokens[1];
				Instructor instr = new Instructor(lastName, firstName, userName);
				
				//pass in the two objects created in instuctor and textbook along with the course name and number
				Course course = new Course( number,  courseName,  instr, text);
				classes.add(course);
	
				//displays the arrayList again
				for(int i = 0; i < classes.size(); i++){
					
					
					System.out.println( classes.get(i).toString() );
					System.out.println("");
		
			}
	
	
	}
	
}