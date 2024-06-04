package vector;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		System.out.println(s);
		s.push(10.25);
		System.out.println(s);
		s.push("swapnil");
		System.out.println(s);
		s.push(null);
		s.push(null);
		s.push("swapnil");
		s.push(10.25);
		System.out.println(s.peek());
//		s.pop();
		s.push("new");
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search(10));
	}
}
