import java.util.*;

public class Circle{

	public static double perimeter=0;
	public static double area = 0;
	public static double diameter = 0;
	
	public static void main(String[] args){
			
	}
	
	public static void getCircumference(){
		
		double pi = 3.1416;
		Scanner in = new Scanner (System.in);
		System.out.println("Computing for Circle's Area\n\n");
		System.out.print("Enter diameter: ");
		try {
		diameter = in.nextDouble();
		}
		
		catch (InputMismatchException ime) {
		System.out.println("Invalid input. Try Again.");
		in.next();
		}
		perimeter	= pi*diameter;
		System.out.println("The circle's area is: " + perimeter);
	}//getCircumference
	
	public static void getCircleArea(){
		
		double pi = 3.1416;
		Scanner in = new Scanner (System.in);
		System.out.println("Computing for Circle's Area\n\n");
		System.out.print("Enter diameter: ");
		try {
		diameter = in.nextDouble();
		}
		catch(InputMismatchException ime) {
		System.out.println("Invalid input. Try Again.");
		in.next();
		}
		
		area = pi*(Math.pow((diameter/2), 2));
		System.out.println("Computing..");
		System.out.println("The circle's area is: " + area);
	}//getCircleArea
	
	
	
	
	

}
