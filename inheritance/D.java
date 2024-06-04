package inheritance;

public class D extends C{
	public D() {
		super(10);
		System.out.println("Default D");
	}
	public D(int a) {
		//super(10);
		System.out.println("Parameterized D");
	}
	public static void main(String[] arg) {
		D d=new D();
	}
}
