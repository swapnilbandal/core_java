package core_java;

public class Date {
	private int d,m,y;
	
	public Date() {
		d=12;
		m=03;
		y=25;
	}
	
	public Date(int a,int b,int c) {
		d=a;
		m=b;
		y=c;
	}
	
	public String toString() {
		return "Date is: "+d+"/"+m+"/"+y;
	}
	
	public static void swap(Date[] d) {
		Date temp;
		temp = d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	public static void main(String[] args) {
		Date[]d=new Date[2];
		Date d1=new Date(2,5,2000);
		Date d2= new Date(10,2,2013);
		d[0]=d1;
		d[1]=d2;
		
		System.out.println("d1= "+d[0]);
		System.out.println("d2= "+d[1]);
		Date.swap(d);
		System.out.println("After Swapping...");
		System.out.println("d1= "+d[0]);
		System.out.println("d2= "+d[1]);
		
	}
	
}
