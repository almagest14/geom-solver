import java.util.*;

public class Circle{

	public static void main(String args[]){
			
	}
	
	public static void getCircumference(){
		double diameter, perimiter;
		double pi = 3.1416;
		Scanner in = new Scanner (System.in);
		System.out.println("Computing for Circle's Area\n\n");
		System.out.print("Enter diameter: ");
		diameter = in.nextDouble();
		area = pi*diameter;
		System.out.println("The circle's area is: " + area);
	}//getCircumference
	
	public static void getCircleArea(){
		double diameter, area;
		double pi = 3.1416;
		Scanner in = new Scanner (System.in);
		System.out.println("Computing for Circle's Area\n\n");
		System.out.print("Enter diameter: ");
		diameter = in.nextDouble();
		area = pi*(Math.pow((diameter/2), 2));
		System.out.println("Computing..");
		System.out.println("The circle's area is: " + area);
	}//getCircleArea
	
	
	
	
	

}