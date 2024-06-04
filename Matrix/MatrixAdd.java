package Matrix;

import java.util.Scanner;

public class MatrixAdd {
	public void add(int arr[][],int arr1[][]) {
		int arr2[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter ["+i+","+j+"]th element of Matrx 1: ");
				mat1[i][j]=s.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter ["+i+","+j+"]th element of Matrx 2: ");
				mat2[i][j]=s.nextInt();
			}
			System.out.println();
		}
		MatrixAdd a=new MatrixAdd();
		a.add(mat1, mat2);
	}
}
