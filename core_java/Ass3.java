package core_java;
import java.util.Scanner;

public class Ass3 {
	public float simple(float a,float b,float c) {
		float si=(a*b*c)/100;
		return si;
	}
	
	public static void main(String[] args) {
		Ass3 a=new Ass3();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Principal amount: ");
		float x=s.nextFloat();
		System.out.print("Enter Interest Rate: ");
		float y=s.nextFloat();
		System.out.print("Enter Time Duration(In Years): ");
		float z=s.nextFloat();
		float si=a.simple(x, y, z);
		System.out.println("Simple interst is: "+si);
		float total=x+si;
		System.out.println("Total Amount With Simple Interst is: "+total);
		
	}
}
