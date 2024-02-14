import java.util.Scanner;
public class sort_arr{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size=scan.nextInt();
		int[]array=new int[size];
		System.out.println("Elements of array");
		for(int i=0;i<size;i++){
			array[i]=scan.nextInt();
		}
		System.out.println("Elements of array are:");
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
		System.out.println("Sorted array:");
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted Elements of array are:");
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}
}
