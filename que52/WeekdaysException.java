package que52;

import java.io.IOException;
import java.util.Scanner;

public class WeekdaysException {
	public static void main(String[] args) throws IOException {
		String arr[]= {"Sunday","Monday","Tuesday","Wedensday","Thursday","Friday","Saturday"};
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter Number: ");
			int n=s.nextInt();
			System.out.println("Day Name: "+arr[n]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Enter value between 0 to 6");
		}
		 
;	}
}
