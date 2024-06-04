package core_java;

public class Static_Key extends Employee{
	private static int count;
	private int rn;
	private String name;
	 
	
	Static_Key(){
		this.rn=100;
		this.name="swapnil";
	}
	Static_Key(int rn,String name){
		this.rn=rn;
		this.name=name;
		count++;
	}
	public String toString() {
		return "Student roll number: "+rn+"\tStudent Name: "+name+"\tEmployee Number: "+Employee.number;
	}
	
	static int getCount(){
		return count;
	}
	
	static {
		System.out.println("Static Block Called...");
		count=60;
	}
	
	public static void main(String[] args) {
		Static_Key sk= new Static_Key(12,"Mayur");
		System.out.println(sk);
		System.out.println(Static_Key.getCount());
		
	}
}
