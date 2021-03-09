
public class MyInsertion {
	
	private static int[] myInsertionsort(int[] unsorted, int len) {
		for(int i = 1; i < len; i++) {
			for(int j = i; j > 0; j--) {
				if(unsorted[j] < unsorted[j - 1]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j - 1];
					unsorted[j - 1] = temp;
				}
			}
		}
		return unsorted;
	}
	public static int[] myInsertionsort(int[] unsorted) {
		int len = unsorted.length;
		return myInsertionsort(unsorted, len);
	}
}
