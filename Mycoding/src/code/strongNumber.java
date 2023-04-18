package code;

public class strongNumber {
//write a program wheather a number is strong or not?
	public static int testA (int ld) {
	int n=1;
	for(int i=1;i<=ld;i++) {
          n=n*i;
	}
	return n;
	
}

	public static void main(String[] args) {
		int originalNum=146;
		int num=originalNum; 
		int ld;
		int sum=0;
		while(num>0) {
		    ld=num%10;
		    sum=sum+testA(ld);
		    num=num/10;
		}
		if(sum==originalNum) {
		    System.out.println(originalNum+" is strong number");
		}
		else {
			System.out.println(originalNum+" is not strong number");
		}

	}

}
