package Q42;

public class SchoolStudent extends Student{
	private int className;

	public SchoolStudent() {
		super();
	}

	public SchoolStudent(int rollNo, double percentage,int className) {
		super(rollNo,percentage);
		this.className = className;
	}
	
	public void show() {
		super.show();
		System.out.println(" ClassName: "+className);
	}
}
