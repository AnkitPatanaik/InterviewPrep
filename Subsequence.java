import java.util.*;

public class Subsequence {
	
	/* Return the longest increasing subsarray in an array */
	public static int[] longestIncreasing(int[] array) {
		int min = Integer.MIN_VALUE;
		int[] temp = new int[array.length];
		int index = 0;
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			if (a > min) { 
				//add to array
				temp[index++] = a;
				min = a;
			}
			else {
				//reset min
				min = Integer.MIN_VALUE;

				//trim zeros
				int[] part = partArray(temp, index); //how do i get rid of this lawl
				list.add(part);

				//reset temp array;
				temp = new int[array.length];
				index = 0;
			}
		}
		//edge case if longest increasing subsequence includes last element
		list.add(partArray(temp, index)); 
		
		return findLongest(list);
	}

	//return maximum subarray in an array
	public static int[] maxSubarray(int[] array) {
		return null;
	}

	//return maximum subarray in an array less than k
	public static int[] maxSubarray(int[] array, int k) {
		return null;
	}

	public static int[] partArray(int[] array, int size) {
    	int[] part = new int[size];
    	System.arraycopy(array, 0, part, 0, size);
    	return part;
	}

	public static int[] findLongest(ArrayList<int[]> list) {
		int maxIndex = 0;
		int maxLength = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int[] array = list.get(i);
			if (array.length > maxLength) {
				maxLength = array.length;
				maxIndex = i;
			}
		}

		return list.get(maxIndex);
	}

	public static void printArray(int[] a) {
		System.out.println("--------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] test1 = {1,2,3,4,5,6,-5,-6}; /* 1,2,3,4,5,6 */
		int[] test2 = {-6,-5,-1,-10,2,3,4,5,6}; /* 1,2,3,4,5,6 */
		int[] test3 = {5,1,6,2,7,3,8,6,10}; /* return 1 element */
		int[] test4 = {1,2,3}; /* 1,2,3 */
		int[] test5 = {1,2,3,-100,5,6,7,8,1}; /* 5,6,7,8 */
		
		printArray(longestIncreasing(test1));
		printArray(longestIncreasing(test2));
		printArray(longestIncreasing(test3));
		printArray(longestIncreasing(test4));
		printArray(longestIncreasing(test5));
	}
}