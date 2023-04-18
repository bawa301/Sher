package string1;

public class StartsFromLowerCase_A {
	public static void main(String[] args) {
		String [] s1= {"koko", "sabhi", "dk", "chinda", "deepu", "saman"};
		int count=0;
		for(int i=0;i<s1.length;i++) {
			String s=s1[i];
			if(s.charAt(0)=='a') {
				System.out.println(s);
				count++;
			}
		}
		if(count==0) {
			System.out.println("Not a sungle string which starts from character 'a' ");
		}
	}

}
