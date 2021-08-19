package sortingAlgo;

public class MergeSort {
	private int[] unSorted;
	
	// method to merge
	public void mergeSort(int lowerIndex, int higherIndex) {
		if(lowerIndex < higherIndex) { // if there are more than two elements..
			int midPoint = (lowerIndex + higherIndex) / 2;
			mergeSort(lowerIndex, midPoint); // left side arr
			mergeSort(midPoint + 1, higherIndex);  // right side
			mergeArr(lowerIndex, midPoint, higherIndex);
		}	
	}
	
	// method to divide arr and populate them
	public void mergeArr(int lowerIndex, int midPoint, int higherIndex) {
		int[] leftArr = new int[midPoint];
		int[] rightArr = new int[midPoint+1];
		
		for(int i = 0; i < midPoint; i++) {	// populate leftArr
			unSorted[i++] = leftArr[i++];
		}
		
		for(int i = midPoint + 1; i < higherIndex; i++) {
			unSorted[i++] = rightArr[i++];
		}
	}
	
	//me
	public int[] mergeSorting(int[] array) {
		int lowerIndex = 0;
		int higherIndex = array.length - 1;
		int midPoint = (lowerIndex + higherIndex) / 2;
		mergeSort(lowerIndex, higherIndex);
		mergeArr(lowerIndex, midPoint, higherIndex);
		
		return sortedArr;
	}
	
	public static void main(String[] args) {
		int[] unSorted = {12, 2322, 34, 123, 123, 1231};
		MergeSort ms = new MergeSort();
		ms.mergeSorting(unSorted);
	}
}
