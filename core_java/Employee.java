package core_java;

public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	protected static int number=100;
	
	public Employee(){
		empId=101;
		empName="swapnil";
		empSal=25000.54f;
	}
	public Employee(int a,String s,float f) {
		empId=a;
		empName=s;
		empSal=f;
	}
	public Employee(int a,String s) {
		this();
		empId=a;
		empName=s;
	}
	public void display() {
		System.out.println("Employee Id: "+empId+"\tEmployee Salary:"+empSal);
	}
	
	public String toString() {
		return "Employee Id: "+empId+"\tEmployee Name: "+empName+"\tEmployee Salary: "+empSal;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(101,"swapnil bandal", 4.0f);
		Employee e1 = new Employee(102,"pranav");
		System.out.println(e);
		System.out.println(e1);
	}
}
