public class BinarySearch {

	/* Takes a sorted array and returns true if the value k is found */
	public static boolean binarySearch(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int median = low + (high - low)/2;
			if (k > array[median]) {
				low = median + 1;
				//System.out.println("Reset low: " + low);
			}
			else if (k < array[median]) {
				high = median - 1;
				//System.out.println("Reset high: " + high);
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
		
		binarySearch(small, 4);
		binarySearch(small, 5);
		binarySearch(array1, 7);
	}
}