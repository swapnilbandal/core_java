package Que41;

public class FullTimeFaculty extends Faculty{
	private int basic;
	private int allowance;
	
	public FullTimeFaculty() {
		super();
		basic=0;
		allowance=0;
	}
	
	public FullTimeFaculty(int a,int b,int c) {
		super(a);{
			basic=b;
			allowance=c;
			salary=b+c;
		}
	}
	
	public void display() {
		super.display();
		System.out.print("\tSalary of Faculty: "+salary);
	}
}
