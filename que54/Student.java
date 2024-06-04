package que54;

public class Student implements StudentFee{
	private String name;
	private int fee;
	
	
	public Student() {
		 name="Unknown";
		 fee=00;
	}


	public Student(String name, int fee) {
		super();
		this.name = name;
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
		
	}
	
}
