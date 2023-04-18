package wrappers;
import java.util.ArrayList;
public class C {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(112.5);
		a1.add(true);
		a1.add("Hello");
		a1.add(10);
		a1.add("Hello");
		
		System.out.println(a1);
		System.out.println(a1.size());
		
		a1.remove(true);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.remove("Hello");
		System.out.println(a1);
	}

}
