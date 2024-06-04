package Q50;

import java.util.Scanner;

public class Vowel {
	private int count;
	private int isVowel(String name) {
		for(int i=0;i<name.length();i++) {
			if((name.charAt(i)=='a')||(name.charAt(i)=='A')||(name.charAt(i)=='e')||(name.charAt(i)=='E')||(name.charAt(i)=='i')||(name.charAt(i)=='I')||(name.charAt(i)=='o')||(name.charAt(i)=='O')||(name.charAt(i)=='u')||(name.charAt(i)=='U')) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name=s.nextLine();
		System.out.println(name);
		Vowel v= new Vowel();
		int count=v.isVowel(name);
		System.out.println(count);
	}

	
}
