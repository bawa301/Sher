package string1;

public class StringHavingCharacter_a_ {
	public static void main(String[] args) {
		String [] s1= {"koko", "sabhi", "dk", "chinda", "deepu", "saman","pappua"};
		int count=0;
		for(int i=0;i<s1.length;i++) {
			String s=s1[i];
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='a') {
					System.out.println(s);
					count++;
					break;
				}
			}
		}
		if(count==0) {
			System.out.println("Not a sungle string which is having from character 'a' ");
		}
	}

}
