package abstract_demo;

public class Circle extends Shape{
	private float radius;
	
	public Circle() {
		radius=0;
	}
	public Circle(float r) {
		radius=r;
	}
	
	@Override
	public float calculateArea() {
		return (float) (3.14*radius*radius);
	}
	

}
