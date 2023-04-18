package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Example {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<>(new MyComparator());
		p.offer(10);
		p.offer(30);		
		p.offer(40);		
		p.offer(20);	
		
		while(!(p.isEmpty())) {
			System.out.println(p.poll());
		}
		
	}


}
