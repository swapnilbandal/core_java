package Que41;

public class Faculty {
	private int facultyId;
	protected int salary;
	
	public Faculty() {
		facultyId=0;
		salary=0;
	}
	
	public Faculty(int a) {
		super();
		facultyId=a;
	}
	
	public Faculty(int a,int b) {
		facultyId=a;
		salary=0;
	}
	public void display() {
		System.out.println();
		System.out.print("Faculty ID: "+facultyId);
	}
}
