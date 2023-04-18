package string1;

public class Print_Digits {
	public static void main(String[] args) {
		String s="1What2 3Should4 5i6 7type8 9i0 11dont12 13know14";
		
		int digits=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				digits++;
			}
		}
		System.out.println("Number of digits "+digits);
	}

}
