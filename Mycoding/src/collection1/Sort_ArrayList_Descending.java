package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sort_ArrayList_Descending {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(60);
		l1.add(70);
		l1.add(80);
		
		ArrayList <Integer> a1 = new ArrayList<>(l1);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		Collections.sort(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		
		a1.add(1, 50);
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println(a1);
		
	}

}
