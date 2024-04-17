import java.io.IOException;
import java.util.Scanner;
class myexception extends Exception{
	public myexception(String str)
	{
		System.out.println(str);
	}
}
public class SignException{
	public static void main(String args[]){
		double sum=0;
		System.out.println("Enter number of input numbers: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		Integer mynumbers[]=new Integer[n];
		while(n>0){
			try{
				System.out.println("Enter numbers: ");
				int num=sc.nextInt();
				if(num<0)
				throw new myexception("Number is negative");
				else{
					mynumbers[k]=num;
					sum=sum+num;
					k++;
				}
				n--;
			}
			catch(myexception m){
				System.out.println(m);
			}
		}
		System.out.println("Average mark is " +sum/k);
	}
}
