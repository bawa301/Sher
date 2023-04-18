package collection1;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList b1= new ArrayList();
		
		b1.add(10);
		b1.add("hii");
		b1.add(true);
		b1.add(50);
		b1.add('c');
		
		System.out.println(b1); //View
		int a=(Integer)(b1.get(0));
		System.out.println(a); //when we try to access an element from non generic Arraylist,
		//element from array list will be given as object class type object.
		//therefore we have to to downcast.
		char c= (Character)(b1.get(4));
		System.out.println(c);
		
		for (Object obj1:b1) {
			System.out.println(obj1);
		}
		
		
		ArrayList<Integer> b2=new ArrayList<>();
		b2.add(10);
		b2.add(20);
		b2.add(30);
		int b=b2.get(1);
		System.out.println(b); //When we try to access an element from  generic array list
		//elements will be given as specified class type object
		for (Object obj2:b2) {
			System.out.println(obj2);
		}
	}

}
