package code;

import java.util.ArrayList;
import java.util.Collections;

public class AA___practice {
	    public static void main(String[] args) {
	        int a[] = {12, 13, 18,11};
	        ArrayList <Integer> al = new ArrayList<>();
	        for(int i=0;i<a.length;i++){
	            al.add(a[i]);
	        }
	        Collections.sort(al);
	        Collections.reverse(al);
	        System.out.println(al.get(0)+" is Largest");
	        System.out.println(al.get(1)+" is 2nd Largest");
	    }
}
