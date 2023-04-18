package arrayPrograms;

public class findEven {
	public static void main(String[] args) {
		int []a1= {11,24,34,53,79,22,45,66,43,55,66};
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
			if(a%2==0) {
				countEven++;
			}
			else {
			countOdd++;
			}
		}
		System.out.println("number of even digits are "+countEven);
		System.out.println("number of even digits are "+countOdd);
	}

}
