import java.util.*;

public class Circle{

	public static double circumf=0;
	public static double area = 0;
	public static double diameter = 0;
	
	public static void main(String[] args){
		//getCircleArea();	
	}
	
	public static void getCircumference(){
		
		double pi = 3.1416;
		Scanner in = new Scanner (System.in);
		System.out.println("Computing for Circle's Circumference\n\n");
		System.out.print("Enter diameter: ");
		try {
		diameter = in.nextDouble();
		circumf	= pi*diameter;
		System.out.println("The circle's area is: " + circumf);
		}
		
		catch (InputMismatchException ime) {
		System.out.println("Invalid input.");
		in.next();
		}
		
	}//getCircumference
	
	public static void getCircleArea(){
		
		double pi = 3.1416;
		Scanner in = new Scanner (System.in);
		System.out.println("Computing for Circle's Area\n\n");
		System.out.print("Enter diameter: ");
		try {
		diameter = in.nextDouble();
		area = pi*(Math.pow((diameter/2), 2));
		System.out.println("The circle's area is: " + area);
		}
		catch(InputMismatchException ime) {
		System.out.println("Invalid input. Try Again.");
		in.next();
		}
		
		
	}//getCircleArea
	
	
	
	
	

}
