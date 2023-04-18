package wrappers;

public class Driver1 {
	public static void main(String[] args) {
		
		Employee a1=new Employee("Brijesh Bhaiya",420,10000.00,"Automation Engineer");
		Employee a2=new Employee("Anand",420,10000.00,"Automation Engineer");
		Employee a3=new Employee("Kumud Choubey",420,10000.00,"Front End Engineer");
		
	    Employee[]e=new Employee[3];
	    e[0]=a1;
	    e[1]=a2;
	    e[2]=a3;
	    
	    for (int i=0;i<e.length;i++)
	    {
	      System.out.println("Name "+e[i].name);
	      System.out.println("Eid "+e[i].eid);
	      System.out.println("Salary "+e[i].salary);
	      System.out.println("Position "+e[i].post);
	      System.out.println("----------------------------------------------------------");
	    }
	}

}
