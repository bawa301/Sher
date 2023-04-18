package string1;

import java.util.Scanner;

public class Lapindrome {
	public static boolean isLapindrome(String s1) {
	    int []a1=new int [26];
	    int []a2=new int [26];
	    
	    for(int i=0,j=s1.length()-1;i<j;i++,j--) {
	    	a1[s1.charAt(i)-'a']++;
	    	a2[s1.charAt(j)-'a']++;
	    }
	    for(int i=0;i<a1.length;i++) {
	    	if(a1[i]!=a2[i]) {
	    		return false;
	    	}
	    }
	    return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.next();
		s1=s1.toLowerCase();
		boolean l=isLapindrome(s1);
		if(l) {
			System.out.println("It is Lapindrome");
		}
		else {
			System.out.println("It is not Lapindrome");
		}
	}
}
