import java.util.Arrays;
import java.util.Scanner;
public class ArraySort{
	public static void main(String args[]){
		int n;
		Scanner read= new Scanner(System.in);
		System.out.print("Enter size of Array");
		n=read.nextInt();
		System.out.print("Enter values");
		String[]arr=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=read.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+",");
		}
	}
}
