package collection1;

import java.util.HashSet;

public class IterateHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hii");
		hs.add("Byee");
		hs.add("Hii");
		System.out.println(hs.size());
		for(Object a:hs) {
			System.out.println(a);
		}
	}

}
