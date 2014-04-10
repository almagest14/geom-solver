public class square {
    
private double sideLength;
    
private double perimeter;
    
private double area;
    
    

public square(double length){
        
this.sideLength = length;
    
}
    

public square(){
        
this.sideLength = 0;
    
}
   
 
public void setSideLength(double length){
        
this.sideLength = length;
    
}
    

public double getSideLength(){
        
return this.sideLength;
    
}
 
   
public void solvePerimeter(double sideLength){
        
this.perimeter = sideLength * 4;
        
    
}
    

public void solveArea(double sideLength){
        
this.area = sideLength * sideLength;
        
    
}
    

public void printOutput(){
        
System.out.println("Your square's side length is " + this.sideLength + ".\n"
               
 + "Your square's perimeter is " + this.perimeter + ".\n"
                
+ "Your square's area is " + this.area + ".");
    
}

}  

