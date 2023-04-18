package collection1;

import java.util.ArrayList;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<>();
		al.add("Hii");
		al.add("Bye");
		al.add("Helllo");
		
		String []a = new String[al.size()];
		for(int i=0;i<a.length;i++) {
			a[i]=al.get(i);
			System.out.println(a[i]);
		}
		
	}

}
