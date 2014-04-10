import java.util.Scanner;



public class squareDemo{
    

	public static void main(String[] args){
        
        
	Scanner input = new Scanner(System.in);
        
       
         
try{  
	System.out.print("Enter your square's side length: ");
            
	double length = input.nextDouble();
            
if(length == 0){
                
	throw new ZeroException();
            
	}
            
	square sq = new square(length);
            
	sq.solvePerimeter(sq.getSideLength());
            
	sq.solveArea(sq.getSideLength());
            
        sq.printOutput();
        
}catch(Exception e){
            
	System.out.println("Invalid input");
        
}
    
}

}