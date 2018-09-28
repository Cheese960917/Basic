
public class MySelection {
	private static int[] mySelectionsort(int[] unsorted, int len) {
		for(int i = 0; i < len; i++) {
			int min = i;
			for(int j = i + 1; j < len; j++) {
				if(unsorted[j] < unsorted[i]) {
					min = j;
				}
			}
			int temp = unsorted[i];
			unsorted[i] = unsorted[min];
			unsorted[min] = temp;
		}
		return unsorted;
	}
	
	public static int[] mySelectionsort(int[] unsorted) {
		int len = unsorted.length;
		return mySelectionsort(unsorted, len);
	}
}
