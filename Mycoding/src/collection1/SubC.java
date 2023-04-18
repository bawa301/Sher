package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubC {
	
	public static void main(String[] args) {
		Super s = new Super(1,"QA",1000);
		Super s1 = new Super(21, "Devops",2000);
		Super s2 = new Super(30, "Developer",3000);
		Super s3 = new Super(4, "Manual",4000);
		Super s4 = new Super(5, "TestEr",5000);
		Super s5 = new Super(10, "BA",6000);
		Super s6 = new Super(7, "Scrum Master",7000);
		
		ArrayList<Super> al = new ArrayList<>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		
		System.out.println("Before Sorting "+al);
		Collections.sort(al);
		System.out.println("After Sorting based on eid "+al);
		Collections.sort(al,new MyComparator());
		System.out.println(al);
	}

}
