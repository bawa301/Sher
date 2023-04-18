package string1;

public class Concatination_String {
	public static void main(String[] args) {
		String a="Sumit";
		String b="Rajchoot";
		System.out.println(a+b);         //SumitRajchoot
		
		System.out.println(10+20+a);     //30Sumit
		
		System.out.println(a+10+20);     //Sumit1020
		
		System.out.println(a+10/3);      //Sumit3
		
		System.out.println(a+10*3);      //Sumit30
		
		//System.out.println(a+10-5);    //CTE
		
		System.out.println(a.concat(b));  //SumitRajchoot
	}

}
