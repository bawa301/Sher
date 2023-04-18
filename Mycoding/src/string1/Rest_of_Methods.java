package string1;

public class Rest_of_Methods {
	
	public static void main(String[] args) {
		String a="satya prakash vaishya";
		String b="MUKATI";
		
		//Uppercase------Returns String
		System.out.println(a.toUpperCase());
	
		//Lowercase------Returns String
		System.out.println(b.toLowerCase());
		
		//startsWith------Returns Boolean
		System.out.println(a.startsWith("s"));   //true
		System.out.println(a.startsWith("S"));   //false	
		System.out.println(a.startsWith("sat")); //true	
		
		//endsWith------Returns boolean
		System.out.println(b.endsWith("KATI"));  //TRUE
		System.out.println(b.endsWith("MATI"));  //FALSE
		System.out.println(b.endsWith("I"));     //TRUE
		
		//contains------Returns Boolean
		System.out.println(a.contains("kash "));
		System.out.println(a.contains("a"));
		
		//indexOf-------Returns Int
		System.out.println(a.indexOf("p"));  //6
		System.out.println(a.indexOf("pr")); //6
		
		//lastIndexOf
		System.out.println(b.lastIndexOf("I")); //5
		System.out.println(b.lastIndexOf('I')); //5
		System.out.println(b.lastIndexOf("TI")); //4
		
	}

}
