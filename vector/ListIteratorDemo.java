package vector;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("1");
		l.add("Swapnil");
		l.add("Pranav");
		ListIterator<String> itr=l.listIterator();
	 
		while(itr.hasNext()) {
			 
			System.out.println(itr.next());
		}
		 
		while(itr.hasPrevious()) {
			 
			System.out.println(itr.previous());
		}
	}
}
