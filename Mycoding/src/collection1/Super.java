package collection1;

public class Super implements Comparable {
	
	int eid;
	String desig;
	double salary;

	public Super(int eid, String desig, double salary) {
		super();
		this.eid = eid;
		this.desig = desig;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return desig;
	}
	
	public int compareTo(Object obj) {
			
			if(this.eid==((Super)obj).eid) {
				return 0;
			}
			else if(this.eid==((Super)obj).eid) {
				return 1;
			}
			else {
				return -1;
			}
	}
	
	
   

	
	
	

}
