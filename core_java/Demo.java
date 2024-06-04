package core_java;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int m=s.nextInt();
		if(m>=75)
			System.out.println("Distinction");
		else if(75>m && m<65)
			System.out.println("First Class");
		else
			System.out.println("Fail");
 
		
	}
}
