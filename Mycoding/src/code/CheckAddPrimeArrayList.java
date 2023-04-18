package code;

import java.util.ArrayList;

public class CheckAddPrimeArrayList {
	public static void main(String[] args) {
		int n=2 ;
		ArrayList <Integer> al = new ArrayList();
		int ar=0;
		while(n<=50) {
			ar=checkPrime(n);
			if(ar!=0) {
				al.add(ar);
			}
			n++;
		}
		System.out.println(al);
		
	}
	public static int checkPrime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			return n;
		}
		else {
			return 0;
		}
	}

}
