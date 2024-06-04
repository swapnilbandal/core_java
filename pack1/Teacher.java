package pack1;

public class Teacher extends Person{
	private String subject;
	private int exp;
	
	public Teacher() {
		super();
		subject="Math";
		exp=25;
	}
	public Teacher(String firstName, String lastName, int age,String subject,int exp) {
		super(firstName,lastName,age);{
				this.subject=subject;
				this.exp=exp;
		}
	}
	
	public void getData() {
		super.getData();{
			System.out.println("Enter Subject: ");
			subject=s.next();
			System.out.println("Enter Years of experiance: ");
			exp=s.nextInt();
		}
	}
	
	public void display() {
		super.display();{
			System.out.println("Subject Name: "+subject+" Years of Experiance: "+exp);
		}
	}
}
