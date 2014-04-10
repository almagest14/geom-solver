class TriangleProp{double SideA = 0;
               double SideB = 0;
			   double SideC = 0;
TriangleProp(double a,double b ,double c){
SideA = a;
SideB = b;
SideC = c;
}
double getArea(){
double s = (SideA + SideB + SideC)/2
return Math.sqrt(s*(s-SideA)*(s-SideB)*(s-SideC));}
double getPerimeter(){
return (SideA + SideB + SideC);}
}
}
class Demo(){}