package p1.p2;

public class Date {
	private int d,m,y;
	
	Date(){
		d=10;
		m=10;
		y=2001;
	}
	Date(int a,int b,int c){
		d=a;
		m=b;
		y=c;
	}
	public String toString() {
		return "Date is: "+d+"/"+m+"/"+y;
	}
}
