package wrappers;
import java.util.ArrayList;
public class A {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
	    System.out.println(a1.isEmpty()); //true
	    
	    a1.add(10);
	    a1.add("Hello");
	    a1.add(true);
	    a1.add('C');
	    System.out.println(a1); //view
	    System.out.println(a1.size()); //4
	    a1.add("Bye");
	    System.out.println(a1); //view
	}
	

	
	

}
