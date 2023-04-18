package collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapInter {
	
	public static void main(String[] args) {
	    HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "Hii");
		h.put(2, "Bye");
		h.put(3, null);
		h.put(null, null);
		
		Set s = h.keySet();
		for(Object i:s) {
			System.out.println(i);
		}
		
		Collection s1 = h.values();
		for(Object a:s1) {
			System.out.println(a);
		}
		
		for(Map.Entry<Integer, String> i:h.entrySet()) {
			System.out.println("Keys "+i.getKey()+" Values "+i.getValue());
		}
		
	}

}
