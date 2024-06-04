package abstract_demo;

import inheritance.BOI;
import inheritance.Bank;

public class Test {
	public static void main(String[] args) {
		Bank b=new BOI();
		System.out.println("BOI="+b.getROI());
	}
}
