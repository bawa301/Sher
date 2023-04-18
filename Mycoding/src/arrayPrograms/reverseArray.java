package arrayPrograms;

public class reverseArray {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6};
		int length=a1.length;
		reverseArray(a1,length);

	}

	public static void reverseArray(int[] a1, int length) {
		if(length>0) {
			System.out.print(a1[length-1]);
			length--;
			reverseArray(a1,length);
		}
	}

}
