import java.util.Scanner;
class Example12
{
  double l,b;
  void perimeter()
  {
    double peri=2*(l+b);
    System.out.println("Perimeter:"+peri);
  }
  void area()
  {
    double ar=l*b;
    System.out.println("Area:"+ar);
  }
}
class Example1{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    Example12 r=new Example12();
    r.l=sc.nextDouble();
    r.b=sc.nextDouble();
    r.perimeter();
    r.area();
}
}