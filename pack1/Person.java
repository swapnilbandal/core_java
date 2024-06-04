package pack1;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	Scanner s=new Scanner(System.in);
	public Person() {
		firstName="Swapnil";
		lastName="Bandal";
		age=22;
	}
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void getData() {
		System.out.println("Enter First Name: ");
		firstName=s.next();
		System.out.println("Enter Last Name: ");
		lastName=s.next();
		System.out.println("Enter Age: ");
		age=s.nextInt();
	}
	
	public void display() {
		System.out.println("First Name: "+firstName+" Last Name:"+lastName+" Age: "+age);
	}
}
