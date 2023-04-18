package wrappers;
import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(112.5);
		a1.add(true);
		a1.add("Brijesh Mishra");
	    System.out.println(a1);             //view
	    System.out.println(a1.size());      //6
	   
	    
	    ArrayList a2=new ArrayList();
	    a2.add(50);
	    a2.add(100);
	    a2.add(150);
	    a2.add(200);
	    System.out.println(a2);               //view
	    System.out.println(a2.size());        //4
	    a2.add(a1);                           //Elements of a1 added as single object in a2
	    System.out.println(a2);               //view 
	    System.out.println(a2.size());        //5
	    a2.addAll(a1);                        //Elements of a1 added as an individual object in a2
	    System.out.println(a2);               //View
	    System.out.println(a2.size());        //11
		
		
	}

}
