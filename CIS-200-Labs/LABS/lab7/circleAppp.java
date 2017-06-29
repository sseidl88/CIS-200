//package lab7;
import java.util.*;

public class circleAppp {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		//creating the first circle
		circle c1 = new circle();
		c1.display(c1);
		
		System.out.println("");
		//asks user for the radius of circle 2
		System.out.println("Enter in the radius of Circle 2:");
		double radius = Double.parseDouble(s.nextLine());
		//asks the user for the color of circle 2
		System.out.println("Enter in the color of Circle 2:");
		String color = s.nextLine();
		
		//creating the second circle
		circle c2 = new circle(radius,color);
		c2.display(c2);
	}
	
	
}
