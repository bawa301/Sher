package wrappers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Abc {

	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<>();
		hs.put("kumudi", "Jyoti");
		hs.put("Rahul", "Deva");
		hs.put("lii", "J");
		
		Set<String> a = hs.keySet();
		for(String s1:a) {
		System.out.println(s1);
		}
	}
	

}
