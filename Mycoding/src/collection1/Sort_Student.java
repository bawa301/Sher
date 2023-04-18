package collection1;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Student {
	public static void main(String[] args) {
		Student s1 = new Student(22, "Kumud", 11);
		Student s2 = new Student(25, "rahul", 22);
		Student s3 = new Student(21, "Dumuk", 8);
		
		ArrayList <Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("Before Sorting :");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After Sorting :");
		System.out.println(al);
	}

}
