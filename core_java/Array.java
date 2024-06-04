package core_java;
import java.util.Scanner;

public class Array {
	public static void main(String [] args) {
//		int arr[] ={1,2,3,4,5};
//		int []ar= new int[] {5,6,7,8,9};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of an array: ");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}
	}
}
