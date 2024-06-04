package pack1;

public class HOD extends Teacher{
	private String department;
	
	public HOD() {
		super();
		department="Computer";
	}
	public HOD(String firstName, String lastName, int age,String subject,int exp,String department) {
		super(firstName, lastName, age, subject, exp);{
			this.department=department;
		}
	}
	
	public void getData() {
		super.getData();{
			System.out.println("Enter Department Name:");
			department=s.next();
		}
	}
	public void display() {
		super.display();{
			System.out.println("Department Name:"+department);
		}
	}
}
