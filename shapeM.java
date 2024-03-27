abstract class shape{
	public abstract int calculateArea();
	public void displayinfo(){
		System.out.println("This is a shape");
	}
}
class rectangle extends shape{
	int length;
	int width;
	public rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	public int calculateArea(){
		return length*width;
	}
}
class circle extends shape{
	int radius;
	public circle(int radius){	
		this.radius=radius;
	}
	public int calculateArea(){
		return (int) (Math.PI * radius * radius);
	}
}
public class shapeM{
	public static void main(String[]args){
		shape rectangle=new rectangle(5,3);
		shape circle =new circle(4);
		System.out.println("Area of rectangle is"+rectangle.calculateArea());
		rectangle.displayinfo();
		System.out.println("Area of circle is"+circle.calculateArea());
		circle.displayinfo();
	}
}
