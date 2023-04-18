package string1;

public class ConvertLowerCaseToUpperCase_ViceVersa {
	public static void main(String[] args) {
		String s="koKDa";
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
		    if(ch[i]>='A' && ch[i]<='Z') {
			     ch[i]=(char) (ch[i]+32);
		    }
		    else {
		    	ch[i]=(char) (ch[i]-32);
		    }
		}
		s=String .valueOf(ch);
		System.out.println(s);
	}

}
