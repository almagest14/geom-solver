import java.util.*;
import java.text.DecimalFormat;
class TriangleProp{double SideA = 0;
               double SideB = 0;
			   double SideC = 0;
TriangleProp(double a,double b ,double c){
SideA = a;
SideB = b;
SideC = c;
}
double getArea(){
double s = (SideA + SideB + SideC)/2; // using Heron's Formula
return Math.sqrt(s*(s-SideA)*(s-SideB)*(s-SideC));}
double getPerimeter(){
return (SideA + SideB + SideC);}

}
class TriangleDemo extends Exception {DecimalFormat numberFormat = new DecimalFormat("#.00");
Scanner input = new Scanner(System.in);
 void GetEverything(){
try{double a = 0;
double b = 0;
double c =0;
System.out.print("Enter Length of First Side :");
a = input.nextDouble();
System.out.print("Enter Length of Second Side :");
 b = input.nextDouble();
System.out.print("Enter Length of Third Side :");
 c = input.nextDouble();
TriangleProp sample = new TriangleProp(a,b,c);
System.out.println("Area of the Triangle : " + numberFormat.format(sample.getArea()));
System.out.println("Perimeter of the Triangle : " + sample.getPerimeter());}
catch(Exception e){
 System.out.println("\nInput Error Please try again");
 //GetEverything();
 }
}}
public class Shape{
public static void main(String [] args){
TriangleDemo Demo = new TriangleDemo();
Demo.GetEverything();
}}