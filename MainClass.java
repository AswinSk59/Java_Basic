class MyClass{
	int a;
	int b;
	MyClass(){
		a=10;
		b=20;
	}
	void display(){
		System.out.println("Value of a & b is "+a+"and "+b);
	}
}
public class MainClass{
	public static void main(String[]args){
		MyClass obj=new MyClass();
		obj.display();
	}
}
