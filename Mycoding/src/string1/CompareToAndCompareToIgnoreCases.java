package string1;

public class CompareToAndCompareToIgnoreCases {
	public static void main(String[] args) {
		String a="xyz";
		String b="XYZ";
		
		System.out.println(a.compareTo(b));   //+ve 
		System.out.println(a.compareToIgnoreCase(b)); //0
	
	}

}
