import java.util.*;

public class Subsequence {
	
	/* Return the longest increasing subsequence in an array */
	public static int[] longestIncreasing(int[] array) {
		int min = Integer.MIN_VALUE;
		int[] temp = new int[array.length];
		int index = 0;
		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			if (a > min) { //add to array
				temp[index++] = a;
				min = a;
			}
			else {
				//reset min
				min = Integer.MIN_VALUE;
				list.add(temp);
				//reset temp array;
				temp = new int[array.length];
				index = 0;
			}
		}
		return findLongest(list);
	}

	public static int[] findLongest(ArrayList<int[]> list) {
		return null;
	}

	public static void printArray(int[] a) {
		System.out.println("--------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("--------");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] test1 = {1,2,3,4,5,6,-5,-6}; /* 1,2,3,4,5,6 */
		int[] test2 = {-6,-9,-10,1,2,3,4,5,6}; /* 1,2,3,4,5,6 */
		int[] test3 = {5,1,6,2,7,3,8,6,10}; /* return 1 element */
		int[] test4 = {1,2,3}; /* 1,2,3 */
		int[] test5 = {1,2,3,-100,5,6,7,8,9}; /* 5,6,7,8,9 */

		
		printArray(longestIncreasing(test1));
		printArray(longestIncreasing(test2));
		printArray(longestIncreasing(test3));
		printArray(longestIncreasing(test4));
		printArray(longestIncreasing(test5));
	}
}