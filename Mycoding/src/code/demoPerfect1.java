package code;

public class demoPerfect1 {
	//program to find a perfect number and logic part in another method and printing
	//part should be in main method.
	
	public static boolean testA(int num) {
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num=6;
		boolean result=testA(num);
		if(result) {
			System.out.println("It is perfect number");
		}
		else {
			System.out.println("It is not perfect number");
		}
		
	}

}
