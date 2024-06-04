package Q42;

public class Student {
	private int rollNo;
	private double percentage;
	
	
	public Student() { 
		rollNo=0;
		percentage=0.0;
	}


	public Student(int rollNo, double percentage) {
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	
	public void show() {
		System.out.print("Roll Number: "+rollNo+" Percentage: "+percentage);
	}
	
	
}
