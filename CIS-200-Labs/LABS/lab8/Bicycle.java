/*
Defines the Bicycle class containing the following data propeties:
 1) color of the bike
 2) current gear the bike is in

Includes 4 constructors, a setColor and setGear methods, and toString method
Part 2 modification adds an equals method
*/

import java.util.Scanner;

public class Bicycle
{//instance variables
  private int gear;
  private String color;

// Constructor #1: set default gear to 1 and the color to primer gray
  public Bicycle ()
  {
	  this.gear = 1;
	  this.color = "primer gray";
  } // end 'default' no-argument constructor

// Constructor #2: sets the gear to a passed-in value
// and color to same default color as constructor #1
  public Bicycle (int newGear)
    {
		this.gear = newGear;
		this.color = "primer gray";
	} // end one-argument constructor (sets the gear)

// Constructor #3: sets the color to the passed-in value
// and the gear to the same default gear as constructor #1
  public Bicycle (String newColor)
  {
	this.gear = 1;
	this.color = newColor;
  } // end one-argument constructor (sets the color)

// Constructor #4: sets the gear to the passed-in value
// and sets the color as the passed-in value
  public Bicycle (int newGear, String newColor)
  {
	  this.gear = newGear;
	  this.color = newColor;
  } // end two-argument constructor (sets gear and color)

  //Sets the private data property 'gear' with the value passed in
  public void setGear(int newGear)
  {
	  this.gear = newGear;
  } //end of method setGear

    //Sets the private data property 'color' with the value passed in
  public void setColor(String newColor)
  {
	  this.color = newColor;
  } //end of method setGear

  
  
 /*
  //This method displays the value of the String variable 'color'
  public void displayColor()
  { 
	System.out.println ("The color of the bike is " + color);
  } //end method displayColor

  //This method displays the value of the int variable 'gear'
  public void displayGear()
  { 
	System.out.println ("The bike is in gear #" + gear);
  } //end method displayGear
*/
  
  
// Comment out the two methods above...
// Create a toString method that returns a String that can
// be used to display the data properties of a bicycle in the
// same format you are commenting out
	public String toString(){
		return ("\nThe color of the bike is " + this.color +
				"\nThe bike is in gear #" + this.gear);
	}

// Create an equals method that returns true if the bikes are
// in the same gear and are the same color, otherwise returns false...
	public boolean equals(Bicycle b){
		if (this.color != b.color){
			return false;
		}else if(this.gear != b.gear ){
			return false;
		}else{
			return true;
		}
	}

} //end class Bicycle