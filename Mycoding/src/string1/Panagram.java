package string1;

public class Panagram {
	public static void main(String[] args) {
		String s="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s=removeSpaces(s);
		boolean t=isPanagram(s);
		if(t) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not panagram");
		}
	}
	public static String removeSpaces(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {                //T==' '
				s1=s1+s.charAt(i);
			}
		}
		return s1;
	}
	public static boolean isPanagram(String s) {
		int [] a=new int[26];
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'A']++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				return false;
			}
		}
		return true;
	}

}
