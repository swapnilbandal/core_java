package core_java;

public class Arr {
	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		arr[0][0]=12;
		arr[0][1]=10;
		int ar[][]=new int[][] {{1,2,3},{4,5,6,7},{8,9}};
		int a[][]= {{9,8},{7,6,5},{4,3,2,1}};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		for(int i[]:ar) {
			for(int j:i) {
				System.out.println(j);
			}
		}
		
	}
}
