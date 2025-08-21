public class Polymorphism{
public void area(){
int b=10;
int h=20;
int  t=b*h;
System.out.println("area of Rectangle is:"+t);
}
public double area(int b,int h){
double t=0.5*b*h;
return t;
}
public double area(int r){
double t=3.14*r*r;
return t;
}
public static void main(String args[]){
 Polymorphism p=new Polymorphism();
 p.area();
 System.out.println("Area of triangle is:"+p.area(10,20));
System.out.println("Area of circle is:"+p.area(10));
}
}


