package p1.p2;

public class Employee {
	private int empId;
	private String empName;
	private Date date_of_joining;
	
	public Employee() {
		empName="swapnil";
		empId=101;
	}
	public Employee(int a, String s,Date d) {
		empName=s;
		empId=a;
		date_of_joining=d;
	}
	
	public String toString(){
		return "Employee Name: "+empName+"\tDate of Joining: "+date_of_joining;
	}
	public static void main(String[] args) {
		Employee e = new Employee(102,"pranav",new Date(13,10,2001));
		Employee e1= new Employee(103,"Ganesh",new Date (12,04,2024));
		System.out.println(e);
		System.out.println(e1);
		
	}
	
}
	
	

