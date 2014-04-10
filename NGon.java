import java.lang.Math;
import java.util.*;
import java.text.*;

class NGon{

	
	public static void getP(int n, double m){
		// This functions computes the perimeter of a N-Gon.
		// n - # of sides ; m = measurement 4 each side
		
		System.out.println("Perimeter = "+(n*m));	
	}
	
	public static void getA(int n, double m){
	

		double a = m/(2 * (Math.tan(Math.toRadians(180/n)))); //apothem
		double area = (n * m * a) / 2.0; 
		NumberFormat formatter = new DecimalFormat("#0.00");  
		System.out.println("Area "+formatter.format(area));
	
		
		
	
	}
	



}