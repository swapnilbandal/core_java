package core_java;
import java.util.Scanner;

public class MaxOf3 {
	public float maximum(float a,float b,float c) {
		float m=a>b? (a>c? a:c):(b>c?b:c);
		return m;
	}
	public static void main(String[] args) {
		MaxOf3 m=new MaxOf3();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		float a=s.nextFloat();
		System.out.print("Enter Second Number: ");
		float b=s.nextFloat();
		System.out.print("Enter Third Number: ");
		float c=s.nextFloat();
		float max=m.maximum(a, b, c);
		System.out.println("Maximun number is: "+max);
	}
}
