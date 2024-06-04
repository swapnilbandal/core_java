package abstract_demo;

public class Geo {
	public static void main(String[] args) {
		Shape s = new Circle(6);
		Shape s1=new Rectangle(4,5);
		System.out.println("Area: "+s1.calculateArea());
	}
}
