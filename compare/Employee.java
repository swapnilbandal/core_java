package compare;

public class Employee implements Comparable{
	private int empId;
	String empName;
	
	public Employee() {
		this.empId = 101;
		this.empName = "Pranav";
	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public int compareTo(Object o) {
		int eid1=this.empId;
		
		Employee e = (Employee) o;
		int eid2=e.empId;
		if(eid1>eid2) {
			return +1;
		}
		else if(eid1<eid2) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	
}
