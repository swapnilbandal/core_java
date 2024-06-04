package Que40;

public class TwoBHK extends OneBHK{
	private double room2Area;
	
	public TwoBHK() {
		super();{
			room2Area=0.0;
		}
	}
	public TwoBHK(double a,double b,double c,double d) {
		super(a,b,c);{
			room2Area=d;
		}
	}
	
	public void show() {
		super.show();{
		System.out.println("Area of Second Room is: "+room2Area+" sq.m");
	}}
	
	public void count() {
		System.out.println("Number of flats: "+count+" Total Price is: "+total);
	}
}
