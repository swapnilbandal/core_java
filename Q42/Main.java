package Q42;

import java.util.Scanner;
public class Main {
	private int num;
	private Student arr[];
	private String ch;
	public Scanner s= new Scanner(System.in);
	
	public void add() {
		System.out.print("Enter Number of Student to Add: ");
		num=s.nextInt();
		arr = new Student[num];
	
	for(int i=0;i<num;i++) {
		System.out.print("College(1) or School(2): ");
		int n=s.nextInt();
		if(n==1) {
			System.out.println("Enter Roll Number of "+(i+1)+" Student");
			int r=s.nextInt();
			System.out.println("Enter Percentage of "+(i+1)+" Student");
			int p=s.nextInt();
			System.out.println("Enter Semester of "+(i+1)+" Student");
			int sem=s.nextInt();
			arr[i]=new CollegeStudent(r,p,sem);
		}
		else if(n==2) {
			System.out.println("Enter Roll Number of "+(i+1)+" Student");
			int r=s.nextInt();
			System.out.println("Enter Percentage of "+(i+1)+" Student");
			int p=s.nextInt();
			System.out.println("Enter Class Name of "+(i+1)+" Student");
			int c=s.nextInt();
			arr[i]=new SchoolStudent(r,p,c);
		}
	}
	}
	public void display() {
		for(int i=0;i<num;i++) {
			System.out.println();
			arr[i].show();
			
		}
		
	
	}
	public void search(int rollNo) {
		for(int i=0;i<num;i++) {
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		String ch;
		do {
			Main a=new Main();
			Scanner s= new Scanner(System.in);
			System.out.println("What You Want to do?");
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Search Student");
			ch=s.next();
			switch(ch){
				case "1":a.display();
						break;
				case "2":a.add();
						break;
				 
			}
		}
		while(ch!="3");
		
	}
}
