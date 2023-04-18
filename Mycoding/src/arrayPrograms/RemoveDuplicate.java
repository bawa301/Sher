package arrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int a[] = {1,2,3,3,4,5};
		HashSet hs = new HashSet();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		ArrayList al = new ArrayList(hs);
		for(int i=0;i<al.size();i++) {
		a[i]=(int) al.get(i);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
