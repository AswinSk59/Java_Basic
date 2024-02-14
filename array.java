import java.util.*;
class array{
	public static void main(String[]args){
		int[]a=new int[10];
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter elements in array:");
		for(int i=0;i<a.length;i++){
			a[i]=inp.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
}
}
