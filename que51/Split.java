package que51;

import java.util.Scanner;
public class Split {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter : ");
		String str = s.nextLine();
		String a[] = str.split(", ");
		int sum=0;
		
		for(String b:a) {
			sum=sum+(Integer.parseInt(b));
		}
		
		 
		System.out.println(sum);
		
	}

	
}
