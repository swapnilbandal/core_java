package vector;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add("Swapnil");
		h.add(10.2);
		h.add(null);
		h.add(null);
		h.add('A');
		System.out.println(h.add(10.20f));
		System.out.println(h);
		
		
	}
}
