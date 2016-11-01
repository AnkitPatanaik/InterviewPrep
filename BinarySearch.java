public class BinarySearch {

	/* Takes a sorted array and returns true if the value k is found */
	public static boolean binarySearch(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		int median = array[(low+high)/2];
		System.out.println("MEDIAN " + median);

		while (low != high) {
			if (k > median) {
				low = high - ((low + high)/2) - 1;
				//System.out.println("Reset low: " + low);
				//return false;
			}
			else if (k < median) {
				high = low + ((low + high)/2) + 1;
				//System.out.println("Reset high: " + high);
				//return false;
			}
			else {
				System.out.println("You found " + k);
				return true;
			}
			median = array[(low+high)/2];
			//System.out.println(median);
			//return false;
		}
		System.out.println("Your life sucks, you're either unlucky af or your algorithm sucks");
		return false;
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,7,8,9,10};
		int[] array2 = {2,16,177,1299,2612,3562,50000, 55000, 64622};
		int[] small = {1, 4, 6};

		//System.out.println(array1.length + " " + array2.length);
		binarySearch(small, 4);
		binarySearch(small, 5);
		binarySearch(array1, 7);
	}
}