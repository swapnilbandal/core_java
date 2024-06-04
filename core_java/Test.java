package core_java;
import java.util.Scanner;

public class Test {
	private String name;
	private int rollNumber,m1,m2,m3;
	
	public Test() {
		name="Swapnil";
		rollNumber=45;
		m1=m2=m3=0;
		}
	public Test(int rn,String s,int m1,int m2,int m3) {
		rollNumber=rn;
		name=s;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public int getRn() {
		return rollNumber;
	}
	
	public String toString() {
		return "Student roll Number is: "+rollNumber+"\nName of the student is: "+name+"\nMarks of Subject1: "+m1+"\nMarks of Subject 2: "+m2+"\nMarks of Subject 3: "+m3;
	}
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int size=s.nextInt();
		Test a[]=new Test[size];
		System.out.println("Enter "+size+" Elements:");
		for(int i=0;i<size;i++) {
			System.out.println("Enter roll number ofStudent: ");
			int rn=s.nextInt();
			System.out.println("Enter Name of Student: ");
			String name=s.next();
			System.out.println("Enter Marks: ");
			int m1=s.nextInt();
			System.out.println("Enter Marks: ");
			int m2=s.nextInt();
			System.out.println("Enter Marks: ");
			int m3=s.nextInt();
			
			a[i]=new Test(rn,name,m1,m2,m3);
			
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i].getRn());
		}
		
	}
}
