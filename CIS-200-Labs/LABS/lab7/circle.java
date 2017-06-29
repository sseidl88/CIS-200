//package lab7;

import java.text.DecimalFormat;

public class circle{
	private String color;
	private double radius;
	private final double PI = 3.14159;
	
	DecimalFormat df = new DecimalFormat("#0.000");
	
	public circle(){
		this.radius = 1.0;
		this.color = "white";
	}
	
	public circle(double rad, String col){
		this.radius = rad;
		this.color = col;
	}

	public String getColor(){
		return color;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setColor(String str){
		
	}

	public void setRadius(double doub){
		
	}
	
	public double findArea(){
		return (PI * (radius*radius));
		
	}
	
	public double findCircumference(){
		return  (2.0 * PI * radius);
		
	}
	
	public double findSurfaceArea(){
		return ((4.0) * PI * (radius*radius));
		
	}
	
	public double findVolume(){
		return ((4.0/3.0) * PI * (radius*radius*radius));
		
	}
	
	public void display( circle  c){
		System.out.println("Color: " + color);
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + df.format(c.findArea()));
		System.out.println("Circumference: " + df.format(c.findCircumference()));
		System.out.println("Surface Area: " + df.format(c.findSurfaceArea()));
		System.out.println("Volume: " + df.format(c.findVolume()));
	
	}
}//end of class