package que53;

import java.util.Scanner;

public class Voter {
	private int voterId;
	private String name;
	private int age;
	
	public Voter() {
		this.voterId = 0;
		this.name = "Unknown";
		this.age = 0;
	}
	public Voter(int voterId, String name, int age) throws IoException {
		this.voterId = voterId;
		this.name = name;
		this.age=age;
	
		
	}
	
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Voter Id: ");
		int a=s.nextInt();
		System.out.print("Enter Name: ");
		String name=s.next();
		System.out.print("Enter Age: ");
		int age=s.nextInt();
		try {
			if(age<18 || age>124) {
				throw new Exception();
			}
			else {
				Voter v=new Voter(a,name,age);
				System.out.println(v);
			}
			
		}catch(Exception e) {
			System.out.println("Invalid Age for Voting!");
		}
	}
}
