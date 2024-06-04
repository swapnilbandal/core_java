package Q42;

public class CollegeStudent extends Student{
	private int semester;

	public CollegeStudent() {
		super();
		semester=0;
	}

	public CollegeStudent(int rollNo, double percentage,int semester) {
		super(rollNo,percentage);
		this.semester = semester;
	}
	
	public void show() {
		super.show();
		System.out.println(" Semester: "+semester);
	}
	
}
