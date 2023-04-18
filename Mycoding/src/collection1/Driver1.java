package collection1;

import java.util.ArrayList;

public class Driver1 {
	public static void main(String[] args) {
		Employee e1= new Employee("Manoj",1,1000.00);
		Employee e2= new Employee("Sumit",2,2000.00);
		Employee e3= new Employee("Ujjwal",3,3000.00);
		
		ArrayList <Employee> a= new ArrayList <>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		for (Employee obj:a) {
			System.out.println("Name "+ obj.name);
			System.out.println("Name "+ obj.eid);
			System.out.println("Name "+ obj.salary);
			System.out.println("--------------------------------");
			}
		
		
		
	}

}
