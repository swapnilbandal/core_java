package core_java;

import java.util.Scanner;

public class Ass1 {
	public double area(float r) {
		return 3.14*r*r;
	}
	public double circumference(float r) {
		return 2*3.14*r;
	}
	
	public static void main(String[] args) {
		Ass1 a=new Ass1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r=s.nextFloat();
		double b= a.area(r);
		System.out.println("Area of circle is: "+b);
		double c=a.circumference(r);
		System.out.println("Circumference of circle is: "+c);
	}
}
