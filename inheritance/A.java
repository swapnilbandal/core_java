package inheritance;

public class A {
	protected int no=10;
	private String str="Rahul";
	
	public void get() {
		System.out.println(str);
	}
	public static void main(String[] args) {
		A a=new A();
		a.get();
		 
	}
}
