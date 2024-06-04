package queue;

import java.util.PriorityQueue;

public class QueueDemo {
		public static void main(String[] args) {
			PriorityQueue q=new PriorityQueue();
			
			 
			q.offer(1);
			for(int i=1;i<10;i++) {
				q.offer(i+1);
			}
			System.out.println(q.peek());
			System.out.println(q.poll());
			System.out.println(q);
		}
	
}
