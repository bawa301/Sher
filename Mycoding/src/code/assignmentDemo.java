package code;

public class assignmentDemo {
/* Example:-
   two numbers such as 123 and 456
   3+6=9
   2+5=7
   1+4=5
   sum=9+7+5=21
*/
	
	public static void main(String[] args) {
		int a1=123;
		int a2=356;
		int ld1;
		int ld2;
		int sum=0;
		
		while(a1>0)
		{
		  ld1=a1%10;
		  ld2=a2%10;
		  sum=sum+(ld1+ld2);
		  a1=a1/10;
		  a2=a2/10;
		}
		System.out.println(sum);
		
	}

}
