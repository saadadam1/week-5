/*Create a class called Vehicle with attributes make and model. Create a subclass called Car that inherits from Vehicle and adds an attribute num_doors. Create a subclass called SportsCar that inherits from Car and adds an attribute top_speed. Create a method in SportsCar called rev_engine() that prints out "Vroom!".*/
import java.util.Scanner;
class Vehicle{
  String make,model;
}
class Car extends Vehicle{
  int num_doors;
}
class SportsCar extends Car{
  int top_speed;
  void rev_engine(){
    System.out.println("Vroom!");
  }
}

class VehicleMultiInheritance{
  public static void main(String[] args){
    SportsCar sc=new SportsCar();
    Scanner s=new Scanner(System.in);
    System.out.println("make of car");
    sc.make=s.next();
        System.out.println("Model of car");
sc.model=s.next();
        System.out.println("Num of doors in car");
sc.num_doors=s.nextInt();
        System.out.println("Top speed of car");
sc.top_speed=s.nextInt();
       

    sc.rev_engine();
  }
  
}