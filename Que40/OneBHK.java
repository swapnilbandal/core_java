package Que40;

public class OneBHK {
	private double roomArea;
	private double hallArea;
	private double price;
	protected static int count=0;
	protected static double total=0;
	
	
	public OneBHK() {
		super();
		roomArea=0.0;
		hallArea=0.0;
		price=0;
	}
	
	public OneBHK(double a,double b,double c) {
		super();
		roomArea=a;
		hallArea=b;
		price=c;
		count++;
		total+=c;
	}
	
	
	public void show() {
		System.out.println("Area of Hall: "+hallArea+" sq.m\tArea of First Room: "+roomArea+" sq.m\tPrice: "+price+" rupees");
	}
	
	
}
