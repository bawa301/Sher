package string1;

public class Join_Method {
	//Join is a static method present in String Class, which concatinates the given elements with the 
	//delimitor and returns concatinated String.
	
	public static void main(String[] args) {
		String s1="Utkarsh";
		String s2="Pandey";
		
		System.out.println(String.join(";",s1,s2));
		String s3=String.join("/",s1);
		System.out.println(s3);
		
		s3=String.join("/", s1,s2);
		System.out.println(s3);
	}
	

}
