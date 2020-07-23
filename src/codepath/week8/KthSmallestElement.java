package codepath.week8;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
	
		int [] array = { 1, 4, 2, 5,21, 53,23, 43, 10, 17, 7, 8, 10, 12};

		Scanner newSc = new Scanner(System.in);
		System.out.println("Enter an index between 0 and " + (array.length-1));
		int kthVal = newSc.nextInt();
		
		int num = findKthVal(array, kthVal);
		System.out.println(num);
	}

	private static int findKthVal(int[] array, int kthVal) {
		// TODO Auto-generated method stub
		
		Arrays.sort(array);
		
		return array[kthVal];
	}

}
