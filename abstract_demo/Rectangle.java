package abstract_demo;

public class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
		length=0;
		breadth=0;
	}
	public Rectangle(float l,float b) {
		super();
		length=l;
		breadth=b;
	}
	@Override
	public float calculateArea() {
		return length*breadth;
	}
	
}
