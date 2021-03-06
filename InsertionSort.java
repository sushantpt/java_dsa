import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int [] dataSet = {/*j*/99, /*i*/123, 41, 1, 44, 234, 77, 7, 98, 54, 33, 1, 0, 23, 345, 34, 1, 00}; // unsorted array
		System.out.println("Unsorted Array:" + Arrays.toString(dataSet));
		for (int i = 1; i < dataSet.length; i++) {		// i = 1. Reason: 0th index value is always sorted (basically not compared to anyone)
			int tempData = dataSet[i];
			int j = i - 1; 					// now compare 0th index and 1st index. ++
			while (j >= 0 && tempData <= dataSet[j]) {
				dataSet[j + 1] = dataSet[j];
				j = j - 1;
			}
			dataSet[j + 1] = tempData;
		}
		System.out.println("Sorted Array:" + Arrays.toString(dataSet));
	}

}
