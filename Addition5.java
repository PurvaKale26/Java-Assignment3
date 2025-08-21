public class Addition5{
public void add(){
int a=10;
int b=20;
int c=a+b;
System.out.println("Addition is:"+c);
}

public int add(int a,int b){
int c=a+b;
return c;
}

public float add(float a,float b){
float c=a+b;
return c;
}

public double add(double a,double b){
double c=a+b;
return c;
}
public static void main(String args[]){
Addition5 d=new Addition5();
d.add();
System.out.println("Addition:"+d.add(35,78));
System.out.println("Addition:"+d.add(35.9f,78.4f));
System.out.println("Addition:"+d.add(113.1,98.25));
}
}


