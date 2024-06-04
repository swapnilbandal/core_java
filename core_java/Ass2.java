package core_java;
import java.util.Scanner;

public class Ass2 {
	public float percentage(int a,int b,int c,int d,int e) {
		int sum=a+b+c+d+e;
		float percentage= (float)sum/5;
		return percentage;
	}
	
	public static void main(String[] args ) {
		Ass2 p = new Ass2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks of five subjects: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		float per=p.percentage(a, b, c, d, e);
		System.out.println("Percentage is: "+per+"%");
		
	}
}
