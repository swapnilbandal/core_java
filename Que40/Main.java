package Que40;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		OneBHK a=new OneBHK(20.36,40.25,45);
//		TwoBHK b = new TwoBHK(500.25,800.68,585858,400.58);
//		a.show();
//		b.show();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number of Flats: ");
		int n= s.nextInt();
		 
		TwoBHK arr[]=new TwoBHK[n];
		for(int i=0;i<n;i++) {
			  System.out.println("Enter Size of flat "+(i+1)+" Hall:");
			  double h1=s.nextDouble();
			  System.out.println("Enter Size of flat "+(i+1)+" Room 1:");
			  double r1=s.nextDouble();
			  System.out.println("Enter Size of flat "+(i+1)+" Room 2:");
			  double r2=s.nextDouble();
			  System.out.println("Enter Size of flat "+(i+1)+" Price:");
			  double p=s.nextDouble();
			  arr[i]= new TwoBHK(h1,r1,p,r2);
		}
		
		for(int i=0;i<n;i++) {
		arr[i].show();
		arr[i].count();
		}
		
	}
}
