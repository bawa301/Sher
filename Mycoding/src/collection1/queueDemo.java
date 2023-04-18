package collection1;

import java.util.PriorityQueue;

public class queueDemo {
public static void main(String[] args) {
	
	PriorityQueue a1=new PriorityQueue();
	a1.offer(10);
	a1.offer(20);
	a1.offer(30);

	System.out.println(a1);
	System.out.println(a1.poll());
	System.out.println(a1);
	System.out.println(a1.peek());
	System.out.println(a1);
}
}
