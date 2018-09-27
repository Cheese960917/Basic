
public class Bubble {

	private static int[] mybubbleSort(int[] unsorted, int len) {
		for(int i = 0; i < len - 1; i++) {
			boolean sorted = true;
			for(int j = 0; j < len - i - 1; j++) {
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
