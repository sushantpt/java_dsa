package sortingAlgo;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void mergeArr(int[] leftArr, int[] rightArr, int[] arr, int leftSize, int rightSize) {
		int i = 0; // size of arr
		int l = 0; // size of leftArr
		int r = 0; // size of rightArr

		while(l < leftSize && r < rightSize){  // execute till leftSize and rightSize gets 0
			if(leftArr[l] < rightArr[r]) {
				arr[i++] = leftArr[l++]; // arr[i] 's values is now leftArr[i] 's value 
			}
			else {
				arr[i++] = rightArr[r++]; // arr[i] 's values is now rightArr[i] 's value
			}
		}
		while(l < leftSize) { // execute till leftSize gets 1
			arr[i++] = leftArr[l++];
		}
		while(r < rightSize) { // execute till rightSize gets 1
			arr[i++] = rightArr[r++];
		}
	}

	public static void sort(int[] arr, int len) {
		if(len <= 1) return;	// size of arr 1
		int midPoint = len / 2;
		int[] leftArr = new int[midPoint];	// left side arr. Starting from 0th index till midPoint
		int[] rightArr = new int[len - midPoint]; // right side arr. Starting from midPoint + 1 till n'th

		int r = 0; // arr size
		for(int i = 0; i < len; ++i) {  // preIncrement imediately returns val
			if(i < midPoint) {	// populate left side arr
				leftArr[i] = arr[i];
			}
			else{		// populate right side arr
				rightArr[r] = arr[i];
				r++;	// continue right side arr's element
			}
		}
		sort(leftArr, midPoint); // recursively divide till len becomes 1
		sort(rightArr, len - midPoint /*(midPoint + 1)*/); // recursively divide till len becomes 1
		mergeArr(leftArr, rightArr, arr, midPoint, len - midPoint);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total size of arrays:");
		int totVal = scanner.nextInt();
		int[] unSorted = new int[totVal];
		// generate random arrays
		for(int i = 0; i < unSorted.length; i++) {
			unSorted[i] = new Random().nextInt(1000);
		}
		System.out.println("UnSorted array:" + Arrays.toString(unSorted));
		sort(unSorted, unSorted.length);
		System.out.println("-----------------------------------------------------------");
		// second step after unSorted is passed through sort()
		System.out.print("Sorted Array:" + Arrays.toString(unSorted)); // sorted array
	}
}
