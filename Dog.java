class Animal{
void display(){
System.out.println("voice");
}
}
public class Dog extends Animal{
void display1(){
System.out.println("bark");
}
public static void main(String args[]){
Dog obj=new Dog();
obj.display();
obj.display1();
}
}
