package core_java;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch,ans;
		int a,b,s1=0;
		do {
			System.out.println("a.Addition\nb.Subtraction\nc.Multiplication.\nd.Division\ne.Exit");
			System.out.println("Enter Your Choice: ");
			ch=s.next().charAt(0);
			if(ch=='e') {
				break;
			}
			else {
				System.out.println("Enter Two numbers: ");
				a=s.nextInt();
				b=s.nextInt();
			}
			switch(ch) {
			case 'a': 
				s1=a+b;
				System.out.println("Addition is: "+s1);
				break;
			case 'b':
				s1=a-b;
				System.out.println("Subtraction is: "+s1);
				break;
			case 'c':
				s1=a*b;
				System.out.println("Multiplication is: "+s1);
				break;
			case 'd':
				if(b>=0) {
					s1=a/b;
					System.out.println("Division is: "+s1);
					break;
				}
				else {
					System.out.println("Divisor cant be zero!");
				}
				
			default:
				System.out.println("Invalid Choice!");
			}
			
			System.out.println("Do You Want To Continue: ");
			ans=s.next().charAt(0);
		}
		while(ans=='Y' || ans=='y');
	}
}
