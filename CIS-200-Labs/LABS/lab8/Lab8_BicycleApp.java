/* BicycleApp.java - application class for the Bicycle class

Creates an array of 4 bike objects, displays data properties of all using the toString method,
changes the gear and color on bike[0] then displays 
the new data properties of all using the toString method

Part 2 - Create another bicycle object that is NOT part of the array
and use the equals method to determine if it is equal to any of the 
other bikes in the array 
*/
import java.util.*;

public class BicycleApp
{
  public static void main(String[] args)
  {	
		Scanner s = new Scanner(System.in);
// declare an array of 4 Bicycle objects
	Bicycle [] bikes = new Bicycle[4];
	// Instantiate the 4 bike objects (Done for you)
	bikes[0] = new Bicycle();
	bikes[1] = new Bicycle(6);
	bikes[2] = new Bicycle ("purple");
	bikes[3] = new Bicycle (10, "red");

    // display initial state of all bicycles in the array using the toString method
	System.out.println(bikes[0].toString); 
	System.out.println(bikes[1].toString); 
	System.out.println(bikes[2].toString); 
	System.out.println(bikes[3].toString); 
	
	
	
	// Read in a new color and gear for Bike[0] and
	// use the set methods to change the 'state' of bike
do{
	System.out.println("What gear do you want the bike to be in?");
	int newGear = Integer.parseInt(s.nextLine());
	
	if (newGear > 10) || (newGear < 1){
		invalidAnswer = true;
	}else{
		invalidAnswer = false;
	}
	
}while (invalidAnswer);
	System.out.println("What color do you want the bike to be?");
	String newColor = s.nextLine();
	
	
	// call setGear method on bike[0]
	bike[0].setGear(newGear);
	// call setColor method on bike[0]
	bike[0].setColor(newColor);
// display the current state of bike[0] only using the toString method

// Part 2 - Create another bicycle object (newBike) that is NOT part of the array
// Color is blue and the gear is 3
bicycle newBike = new bicycle(3, "blue");
// Use a loop and equals method to determine if newBike is equal to any 
// of the other bikes in the array 
// If so, display "newBike object matches a current bike in the array"
// oherwise display "newBike object does NOT match a current bike in the array"
	for(int i = 0; i < bikes.length; i++){
		if (newBike.equals(bikes[i]){
			System.out.print("newBike object matches a current bike in the array");
		}else{
			System.out.println("newBike object does NOT match a current bike in the array");
		}
	}

  } //end of method main
} //end of class BicycleApp