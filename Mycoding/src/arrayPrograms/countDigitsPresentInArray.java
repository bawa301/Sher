package arrayPrograms;

public class countDigitsPresentInArray {

	public static void main(String[] args) {
		int a1[]= {12,134,1234};
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
			System.out.println("Number of digits present in "+a+" is "+countDigits(a));
		}

	}
	public static int countDigits(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}

}
