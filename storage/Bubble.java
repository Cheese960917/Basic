
public class Bubble {

	private static int[] mybubbleSort(int[] unsorted, int len) {
		// set to private and used by pubilc method
		for(int i = 0; i < len - 1; i++) {
			// the last index will be sorted when i goes to len - 1, so no need going to len
			boolean sorted = true;
			// use a variable to check if the array is already sorted
			for(int j = 0; j < len - i - 1; j++) {
				// j is from 0 to len - i - 1
				// j will be compared to j + 1 so that if not （len - i - 1), there will be an Arrayindexoutofbounds exception
				if(unsorted[j] > unsorted[j + 1]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j + 1];
					unsorted[j + 1] = temp;
					sorted = false;
				}
			}
			if(sorted) {
				return unsorted;
			}
		}
		return unsorted;
	}
	
	public static int[] mybubblesort(int[] unsorted) {
		int len = unsorted.length;
		return mybubbleSort(unsorted, len);
	}
}
