package collection1;

public class Student implements Comparable{
	int sAge;
	String sName;
	int sRoll;
	
	public Student(int i, String string, int j) {
	    sAge=i;
	    sName=string;
	    sRoll=j;
	}
	public String toString() {
		return "Student Name "+sName+" Age is "+sAge;
	}
	public int compareTo(Object obj) {
		if(this.sAge==((Student)obj).sAge) {
			return 0;
		}
		else if (this.sAge>((Student)obj).sAge) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
