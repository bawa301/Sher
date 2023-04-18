package string1;

public class Count_Uppercase_Lowercase_Consonant_Vowels_Digits_Space {

	public static void main(String[] args) {
		String s="1SuMiT 4sO bEes 42o";
		int uc=0;
		int lc=0;
		int cons=0;
		int vow=0;
		int digits=0;
		int space=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char a=ch[i];
			if(a>='A' && a<='Z') {
				uc++;
				if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
					vow++;
				}
				else {
					cons++;
				}
			}
			else if(a>='a' && a<='z') {
				lc++;
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
					vow++;
				}
				else {
					cons++;
				}
			}
			else if(a==' ') {
				space++;
			}
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				digits++;
			}
		}
	

		System.out.println("Uppercase "+ uc);
		System.out.println("Lowercase "+ lc);
		System.out.println("Consonants "+ cons);
		System.out.println("Vowels "+ vow);
		System.out.println("Spaces "+ space);
		System.out.println("Digits "+ digits);

	}

}
