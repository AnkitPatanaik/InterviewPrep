import java.util.*;

public class Subsequence {
	
	public static int[] longestIncreasing(int[] array) {
		int min = Integer.MIN_VALUE;
		int[] temp = new int[array.length];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			if (a > min) {
				temp[index++] = a;
				min = a;
			}
		}
		return temp;
	}

	public static void printArray(int[] a) {
		System.out.println("--------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}

	public static void main(String[] args) {
		int[] test1 = {1,2,3,4,5,6,-5,-6}; /* 1,2,3,4,5,6 */
		int[] test2 = {-6,-9,-10,1,2,3,4,5,6}; /* 1,2,3,4,5,6 */
		int[] test3 = {5,1,6,2,7,3,8,6,10}; /* return 1 element */
		int[] test4 = {1,2,3}; /* 1,2,3 */
		int[] test5 = {1,2,3,-100,5,6,7,8,9}; /* 5,6,7,8,9 */

		// printArray(longestIncreasing(test4));
		// printArray(longestIncreasing(test1));
		// printArray(longestIncreasing(test2));
		// printArray(longestIncreasing(test3));
		printArray(longestIncreasing(test5));
	}
}