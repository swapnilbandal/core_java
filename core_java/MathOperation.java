package core_java;
import java.util.Scanner;

public class MathOperation {
	private int x;
	private int y;
	private int r;
	
	public void init() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		this.x=s.nextInt();
		System.out.print("Enter First Number: ");
		this.y=s.nextInt();
	}
	
	public int add() {
		System.out.println("Addition");
		init();
		r=x+y;
		return r;
	}
	
	public double mul() {
		System.out.println("Multiplication");
		init();
		r=x*y;
		return r;
	}
	
	public double mul(int a,int b) {
		init();
		r=a*b;
		return r;
	}
	
	public double mul(float a,float b,float c) {
		init();
		float r=a*b*c;
		return r;
	}
	
	public double mul(double a,int b) {
		init();
		double r=a*b;
		return r;
	}
	
	public double pow() {
		init();
		r=1;
		for(int i=1;i<=y;i++) {
			 r=r*x;
		}
		return x;
	}
	
	public void display() {
		System.out.println("Result: "+r);
	}
	public static void main(String[] args) {
		MathOperation m=new MathOperation();
		m.add();
		m.display();
		m.mul();
		m.display();
		m.pow();
		m.display();
	}
}
