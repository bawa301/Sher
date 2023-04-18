package arrayPrograms;

public class largestNumberInArray {
	public static void main(String[] args) {
		int a1[]= {12,9,34,99,103,342,67,34,98,65,34};
		int largest = a1[0];
		for(int i=1;i<a1.length;i++) {
			if(largest<a1[i]) {
				largest=a1[i];
			}
		}
		System.out.println("Largest Number is "+largest);
	}

}
