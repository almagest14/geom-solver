public class ZeroException extends Exception{

    
public ZeroException(){
       
super("Cannot do zero calculations");
    
}
    
    
public ZeroException(String message){
        
super(message);
    
}


}