package inheritance;

public class B extends A {
	public void m1() {
		System.out.println("In m1() of B");
	}
	public static void main(String[] args) {
		B b=new B();
		b.get();
		A c=new A();
		
		A a=new B();                                                      
		((B)a).m1();
		System.out.println(c.no);
		
	}
}
