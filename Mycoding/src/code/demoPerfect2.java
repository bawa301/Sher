package code;

public class demoPerfect2 {
	
	//method should accept the range and return the perfect number?
	
	public static void testA(int a1,int a2) {
		int sum=0;
		
		for(int i=a1;i<=a2;i++)
		{
			for(int j=1;j<i;j++)
			{
			if(i%j==0)
			{
			 sum=sum+j;
			}
			}
			if (sum==i) {
				System.out.println(i+" perfect number");
			}
			sum=0;
		}
		
	}

	public static void main(String[] args) {
	    int num1=1;
	    int num2=10;
	    testA(num1,num2);
	}

}
