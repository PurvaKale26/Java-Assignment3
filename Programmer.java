class Inheritance{
int salary=10000;
public void display(){
System.out.println("Parent class");
}
}
public class Programmer extends Inheritance{
int bonus=5000;
public void show(){
System.out.println("Child class");
}

public static void main(String args[]){
Programmer p=new Programmer();
int total=p.salary+p.bonus;
System.out.println(total);
p.display();
p.show();
}
}
