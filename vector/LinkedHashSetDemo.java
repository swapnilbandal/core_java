package vector;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet s =new LinkedHashSet();
		s.add("a");
		s.add(10);
		s.add('A');
		s.add("A");
		s.add("A");
		s.add("a");
		System.out.println(s);
	}

}
