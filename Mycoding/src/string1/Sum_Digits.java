package string1;

public class Sum_Digits {

	public static void main(String[] args) {
	   int sum=0;
	   String s="1What23Should45i67type89i0123";
	   char[]ch=s.toCharArray();
	   System.out.print("Digits are ");
	   for(int i=0;i<ch.length;i++) {
		   //isDigit(), a static method of character class, This method determines whether 
		   //the specified char value is a digit.
		   if(Character.isDigit(ch[i])) {
			   System.out.print(ch[i]);
		   
			   //parseInt() a static method, this method is used to get 
			   //the primitive data type of a certain String. 
		   int a=Integer.parseInt(String.valueOf(ch[i]));
		   sum=sum+a;
		   }
	   }
	   System.out.println();
	   System.out.println("Sum of digits are "+sum);
	}

}
