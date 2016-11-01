public class BinarySearch {

	/* Takes a sorted array and returns true if the value k is found */
	/* O(logn) time */
	public static boolean binarySearch(int[] array, int k) {
		/* initialize low and high indices */
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int median = low + (high - low)/2; //calculate the midpoint index

			if (k > array[median]) {
				low = median + 1;
			}
			else if (k < array[median]) {
				high = median - 1;
			}
			else {
				System.out.println("You found " + k);
				return true;
			}
		}
		System.out.println("Your life sucks, you're either unlucky af or your algorithm sucks");
		return false;
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,7,8,9,10};
		int[] array2 = {2,16,177,1299,2612,3562,50000, 55000, 64622};
		int[] small = {1, 4, 6};
		int[] big = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,45,47,48,58,69,70,100,123,124,125,126,7372,31413,50000,372372,4723241};

		binarySearch(small, 4);  /* True */
		binarySearch(small, 5); /* False */
		binarySearch(array1, 7);  /* True */
		binarySearch(array1, 15); /* False */
		binarySearch(array2, 15); /* False */
		binarySearch(array2, 12512); /* False */
		binarySearch(array2, 200); /* False */
		binarySearch(array2, 3562);  /* True */
		binarySearch(big, 101); /* False */
		binarySearch(big, 101000); /* False */
		binarySearch(big, 1000); /* False */
		binarySearch(big, 7372);  /* True */
		binarySearch(big, 1);  /* True */
	}
}