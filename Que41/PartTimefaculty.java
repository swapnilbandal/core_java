package Que41;

public class PartTimefaculty extends Faculty {
	private int hour;
	private int rate;
	
	public PartTimefaculty(){
		super();
		hour=0;
		rate=0;
	}
	
	public PartTimefaculty(int a,int b,int c) {
		super(a);{
			hour=b;
			rate=c;
			salary=b*c;
		}
	}
	public void display() {
		super.display();
		System.out.print("\tSalary of Faculty: "+salary);
	}
}
