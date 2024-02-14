import java.util.*;
public class twoD{
	public static void main(String[]args){
		int i,j;
		int[][]a=new int[2][3];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Values:");
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				a[i][j]=input.nextInt();
			}
		}
		System.out.println("OUTPUT");
		for(i=0;i<2;i++){
		System.out.println();
			for(j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
