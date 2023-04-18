package collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoMap {
	public static void main(String[] args) {
	
	 HashMap <Integer,String>a1=new HashMap <> ();
	 a1.put(1,"Rahul");
	 a1.put(2, "Kumud");
	 
	 Set s3 = a1.entrySet();
	 System.out.println(s3);
	 
	 for (Map.Entry<Integer,String> i:a1.entrySet()) {
		 System.out.println(i);
	 }
	 
	 for (Map.Entry<Integer,String> i:a1.entrySet()) {
		 System.out.println("Keys "+i.getKey());
		 System.out.println("Values "+i.getValue());
	 }
	 
	
	}
	

}
