package mergeSort;

/*
 * Merging two sorted array
 */
public class MergingTwoArray {

	static int[] firstArray = {1, 34, 54, 66, 68, 78, 79, 89, 90};				
	static int[] secondArray = {2, 34, 45, 56, 66, 67, 77, 78, 79, 89, 90};
	static int n1 = firstArray.length;
	static int n2 = secondArray.length;
	static int[] sortedArray = new int[n1 + n2];

	public static void merging(int[] firstArray, int[] secondArray, int n1, int n2, int[] sortedArray) {
		int i = 0, j = 0, k = 0;
		while(i <=n1 && j<=n2) {
			if(firstArray[i] < secondArray[j]) {
				sortedArray[k++] = firstArray[j++];
			}
			else if(firstArray[i] > secondArray[j]) {
				secondArray[j] = sortedArray[k];
			}
		}

		for (; i <= n1; i++) {			// remaining elements in the array
			firstArray[i] = sortedArray[k++];
		}
		for (; j <= n2; j++) {
			secondArray[j] = sortedArray[k++];
		}
	}

	public static void main(String[] args) {

		merging(firstArray, secondArray, n1, n2, sortedArray);
		for (int i = 0; i < (n1 + n2); i++) {
			System.out.println("Sorted Array[s]: ");
			System.out.println(sortedArray[i] + " ");
		}
	}
}
