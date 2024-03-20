import java.util.*;
class myClass{
int a;
double a1;
void area(int x,int y){
a=x*y;
System.out.println("Area of rectangle:"+a);
}
void area(int x){
a=x*x;
System.out.println("Area of square:"+a);
}
void area(double x){
a1=3.14*x*x;
System.out.println("Area of circle:"+a1);
}
}
public class area{
public static void main(String args[]){
int s,l,b;
double r;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the length of rectangle:");
l=sc.nextInt();
System.out.println("Enter the breadth of rectangle:");
b=sc.nextInt();
myClass myObj=new myClass();
myObj.area(l,b);
System.out.println("Enter the radius of circle:");
r=sc.nextDouble();
myObj.area(r);
System.out.println("Enter the length of square:");
s=sc.nextInt();
myObj.area(s);
}
}
