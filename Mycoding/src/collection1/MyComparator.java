package collection1;

import java.util.Comparator;

public class MyComparator implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		int i=(Integer)obj1;
		int j=(Integer)obj2;
		if(i==j) {
			return 0;
		}
		else if(i>j) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
