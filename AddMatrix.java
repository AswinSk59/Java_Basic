import java.util.Scanner;
public class AddMatrix{
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter number of row in matrix");
		int row=read.nextInt();
		System.out.println("Enter number of cols in matrix");
		int cols=read.nextInt();
		int mat1[][]= new int[row][cols];
		int mat2[][]= new int[row][cols];
		int res[][]=new int[row][cols];
		System.out.println("Enter values of matrix1");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				mat1[i][j]=read.nextInt();
			}
		}
		System.out.println("Enter values of matrix2");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				mat2[i][j]=read.nextInt();
			}
		}
		
		System.out.println("Sum of matrices is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				res[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();			
		}
	}
}		
