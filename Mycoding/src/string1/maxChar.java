package string1;

public class maxChar {
	public static void main(String[] args) {
		String s1="aaKKs";
		int a1 []=new int [127];
		for(int i=0;i<s1.length();i++) {
			a1[s1.charAt(i)]=a1[s1.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<s1.length();i++) {
			if(max<a1[s1.charAt(i)]) {
				max=a1[s1.charAt(i)];
				ch=s1.charAt(i);
			}
		}
		System.out.println("Max char is "+ch+" ,"+max+" times");
	}

}
