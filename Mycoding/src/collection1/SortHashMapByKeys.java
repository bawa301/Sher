package collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortHashMapByKeys {
	public static void main(String[] args) {
		HashMap <String, String> hm = new HashMap<String, String>();
		hm.put("Hii", "Byee");
		hm.put("H", "B");
		hm.put("Rahul", "Mishra");
		
		Set a = hm.keySet();
		for(Object a1:a) {
			System.out.println(a1);
		}
		Collection b = hm.values();
		for(Object a2:b) {
			System.out.println(a2);
		}
		
		for(Map.Entry<String, String> a3: hm.entrySet()) {
			System.out.println(a3);
		}
	}

}
