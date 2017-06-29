import java.util.*;



public class Lab2 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		String input;
		
		char class1Letter;
		char class2Letter;
		char class3Letter;
		char class4Letter;
		
		int hour1;
		int hour2;
		int hour3;
		int hour4;
		
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		
		//beginning of grade 1
		System.out.print("How many hour was your first class?");
		input = s.nextLine();
		hour1 = Integer.parseInt(input);
		
		System.out.print("What grade did you get in your first class?");
		class1Letter = (s.nextLine()).charAt(0);
		
		
		if (class1Letter =='A'|| class1Letter =='a')
		{
			grade1 = 4;
		} else if (class1Letter =='B'|| class1Letter =='b')
		{
			grade1 = 3;
		} else if (class1Letter =='C'|| class1Letter =='c')
		{
			grade1 = 2;
		} else if (class1Letter =='D'|| class1Letter =='d')
		{
			grade1 = 1;
		} else if (class1Letter =='F'|| class1Letter =='f')
		{
			grade1 = 0;
		} else
		{
			grade1 = 0;
			System.out.printf(" Invalid Grade ");
			System.exit(0);
		}//end of grade1
		
		
		//beginning of grade 2
		System.out.print("How many hour was your second class?");
		input = s.nextLine();
		hour2 = Integer.parseInt(input);
		
		System.out.print("What grade did you get in your second class?");
		class2Letter = (s.nextLine()).charAt(0);
		
		
		if (class2Letter =='A'|| class2Letter =='a')
		{
			grade2 = 4;
		} else if (class2Letter =='B'|| class2Letter =='b')
		{
			grade2 = 3;
		} else if (class2Letter =='C'|| class2Letter =='c')
		{
			grade2 = 2;
		} else if (class2Letter =='D'|| class2Letter =='d')
		{
			grade2 = 1;
		}else if (class2Letter =='F'|| class2Letter =='f')
		{
			grade2 = 0;
		} else
		{
			grade2 = 0;
			System.out.printf(" Invalid Grade ");
			System.exit(0);
		} //end of grade 2
		
		
		//beginning of grade 3
		System.out.print("How many hour was your third class?");
		input = s.nextLine();
		hour3 = Integer.parseInt(input);
		
		System.out.print("What grade did you get in your third class?");
		class3Letter = (s.nextLine()).charAt(0);
		
		
		if (class3Letter =='A'|| class3Letter =='a')
		{
			grade3 = 4;
		} else if (class3Letter =='B'|| class3Letter =='b')
		{
			grade3 = 3;
		} else if (class3Letter =='C'|| class3Letter =='c')
		{
			grade3 = 2;
		} else if (class3Letter =='D'|| class3Letter =='d')
		{
			grade3 = 1;
		} else if (class3Letter =='F'|| class3Letter =='f')
		{
			grade3 = 0;
		} else
		{
			grade3 = 0;
			System.out.printf(" Invalid Grade ");
			System.exit(0);
		}//end of grade3
		
		
		//beginning of grade4
		System.out.print("How many hour was your fourth class?");
		input = s.nextLine();
		hour4 = Integer.parseInt(input);
		
		System.out.print("What grade did you get in your fourth class?");
		class4Letter = (s.nextLine()).charAt(0);
		
		
		if (class4Letter =='A'|| class4Letter =='a')
		{
			grade4 = 4;
		} else if (class4Letter =='B'|| class4Letter =='b')
		{
			grade4 = 3;
		} else if (class4Letter =='C'|| class4Letter =='c')
		{
			grade4 = 2;
		} else if (class4Letter =='D'|| class4Letter =='d')
		{
			grade4 = 1;
		}else if (class4Letter =='F'|| class4Letter =='f')
		{
			grade4 = 0;
		} else
		{
			grade4 = 0;
			System.out.printf(" Invalid Grade ");
			System.exit(0);//end of grade 4
		}
		
		double totalHours = hour1 + hour2 + hour3 + hour4;
		
		
		String gpa = String.format("your GPA = %.2f\n", ((grade1 * hour1) + (grade2 * hour2) + (grade3 * hour3) + (grade4 * hour4))/totalHours);
		System.out.printf(gpa);
		
	} //end main
	

} //end
