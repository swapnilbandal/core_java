package core_java;

public class SwapDates {
	private int d,m,y;
	public SwapDates() {
		d=12;
		m=10;
		y=2024;
	}
	public SwapDates(int d,int m,int y) {
		this.d=d;
		this.m=m;
		this.y=y;
	}
	
//	public void display() {
//		System.out.println(d+m+y);
//	}
	
	public String toString() {
		return "Date is : "+d+"/"+m+"/"+y;
	}
	
	public static void swapDates(SwapDates d1,SwapDates d2) {
		SwapDates temp;
		temp=d1;
		d1=d2;
		d2=temp;
		
	}
	
	public static void main(String[] args) {
		SwapDates s1 =new SwapDates(2,5,2024);
		SwapDates s2 = new SwapDates(13,10,2001);
	 
		System.out.println(s1);
		System.out.println(s2);
		
		SwapDates.swapDates(s1,s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
