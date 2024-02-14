import java.util.Scanner;
public class demo{
	public static void main(String[]args){
		int a,b;
		Scanner input=new Scanner (System.in);
		System.out.print("Enter a number:");
		a=input.nextInt();
		System.out.print("Enter a number:");
		b=input.nextInt();
		System.out.println("Sum is"+(a+b));
	}
}
