package Que41;

import java.util.Scanner;

import core_java.Arr;

public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("How many Faculty you want to store?: ");
		int no=s.nextInt();
		Faculty[] arr= new Faculty[no];
		for(int i=0;i<no;i++) {
			System.out.print("Choose 1 for Part Time Faculty and 2 for Full Time Faculty: ");
			int n=s.nextInt();
			System.out.print("Enter Faculty Id: ");
			int id=s.nextInt();
			if(n==1) {
				System.out.print("Enter Number of Hours: ");
				int hour=s.nextInt();
				System.out.print("Enter Fees per Hour: ");
				int rate=s.nextInt();
				arr[i]=new PartTimefaculty(id,hour,rate);
			}
			if(n==2) {
				System.out.print("Enter Basic Pay: ");
				int basic=s.nextInt();
				System.out.println("Enter Allowance: ");
				int allowance=s.nextInt();
				arr[i]=new FullTimeFaculty(id,basic,allowance);
			}
			
			
		}
		for(int i=0;i<no;i++) {
			arr[i].display();
		}
		
	}
}
