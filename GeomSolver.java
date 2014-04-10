import java.util.*;

public class GeomSolver{

	public static void main(String argsss[]){
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a shape: <Enter the corresponding number to select shape>");
		System.out.println("<1> Circle");
		System.out.println("<2> Triangle");
		System.out.println("<3> Square");
		System.out.println("<4> Rectangle");
		System.out.println("<5> N-Gon");
		
		int ch = sc.nextInt();
		
		switch(ch){
			case 1: circleOption(); break;
			case 2: TriangleOption();break;
			case 3:
			case 4: rectangleOption(); break;
			case 5: polygonOption(ch); break;
			default: System.out.println("Shape not found.\nExiting...");  break;
			
		}
	
	}
	
	public static void circleOption(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the \n<1>Circumference\n<2>Area");
		int ch = sc.nextInt();
		switch(ch){
			case 1: getCircumference(); break;
			case 2: getCircleArea(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	}//circleOption
	public static void TriangleOption(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Find the \n<1>Perimeter\n<2>Area");
		int ch = sc.nextInt();
		switch(ch){
			case 1: getTrianglePerimeter(); break;
			case 2: getTriangleArea(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	}//circleOption
	
	
	public static void polygonOption(int shape){
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the \n<1>Perimeter\n<2>Area");
		int ch = sc.nextInt();
		switch(ch){
			case 1: getPolygonPerimeter(shape); break;
			case 2: getPolygonArea(shape); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}		
	
	}//polygonOption
	
	public static void rectangleOption(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the \n<1>Area\n<2>Perimeter");
		int ch = sc.nextInt();
		switch(ch){
			case 1: getRectangleArea(); break;
			case 2: getRectanglePerimeter(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	}//rectangleOption
	
	public static void getCircumference(){
		System.out.println("Computing..");
	}//getCircumference
	
	public static void getCircleArea(){
		System.out.println("Computing..");
	}//getCircleArea
	
	public static void getPolygonPerimeter(int sh){
	
		switch(sh){
			case 2: 		
			        getTrianglePerimeter(); break;
			case 3: getSquarePerimeter(); break; 
			case 4: getRectanglePerimeter(); break;
			case 5: getNGonPerimeter(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	
	}//getPolygonPerimeter
	
	public static void getPolygonArea(int sh){
	
		switch(sh){
			case 2: 		
		            getTriangleArea(); break;
			case 3: getSquareArea(); break; 
			case 4: getRectangleArea(); break;
			case 5: getNGonArea(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	
	
	}//getPolygonArea
	
	public static void getTrianglePerimeter(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length of First Side :");
        double a = input.nextDouble();
        System.out.print("Enter Length of Second Side :");
        double b = input.nextDouble();
        System.out.print("Enter Length of Third Side :");
        double c = input.nextDouble();
		System.out.println("Perimeter of the triangle is " + (a+b+c));
	}//getTrianglePerimeter
	
	public static void getTriangleArea(){

	Scanner input = new Scanner(System.in);
		System.out.print("Enter Length of Base Side :");
        double a = input.nextDouble();
        System.out.print("Enter Length of Height :");
        double b = input.nextDouble();
        System.out.println("Length of Hypotenuse :" + Math.sqrt(a*a + b*b));
       
		
		double area = (Math.sqrt(a*a + b*b/2));
		System.out.println("\nArea of the Triangle : " + area );
	}//getTriangleArea
	
	public static void getSquarePerimeter(){

		System.out.println("Computing..");

		
		Scanner input = new Scanner(System.in);
 
		System.out.print("Enter your square's side length: ");
 double length = input.nextDouble();
  System.out.println("Your square's area is " + length*4);

	}//getSquarePerimeter
	
	public static void getSquareArea(){
		System.out.println("Computing..");
		Scanner input = new Scanner(System.in);
 
		System.out.print("Enter your square's side length: ");
 double length = input.nextDouble();
  System.out.println("Your square's area is " + length*length);
	}//getSquareArea
	
	public static void getRectanglePerimeter(){
	double recWidth,recLength,recArea,recPerimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		recLength = sc.nextDouble();
		System.out.println("Enter width: ");
		recWidth = sc.nextDouble();
		System.out.println("Computing..");
		recPerimeter = (2*(recLength+recWidth));
		System.out.println("The Perimeter is: ");
		System.out.print(recPerimeter);
		
	}//getRectanglePerimeter
	
	public static void getRectangleArea(){
	double recWidth,recLength,recArea,recPerimeter;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		recLength = sc.nextDouble();
		System.out.println("Enter width: ");
		recWidth = sc.nextDouble();
		System.out.println("Computing..");
		recArea = (recLength * recWidth);
		System.out.println("The Area is: ");
		System.out.println(recArea);
	}//getRectangleArea
	
	public static void getNGonPerimeter(){
		System.out.println("Computing..");
	}//getRectanglePerimeter
	
	public static void getNGonArea(){
		System.out.println("Computing..");
	}//getRectangleArea
	
	
	
	
	
	
	
	

}