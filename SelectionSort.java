package sortingAlgo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

	// method to sort arrays
	public void sort(int arr[]) {
		int totalNo = arr.length;
		for(int i = 0; i < totalNo - 1; i++) { // iterate through arr
			int minIndex = i;	// i = 0, i = 1, .., i++
			for(int j = i + 1; j < totalNo; j++) { // find smallest no in the arr after i (minIndex)
				if(arr[j] < arr[minIndex]) minIndex = j;
			}

			int temp = arr[minIndex];	// swap minIndex to temp
			arr[minIndex] = arr[i];		// swap arr[i] to arr[minIndex]
			arr[i] = temp;			// swap temp values to arr[i]++
		}
	}

	// method to print sorted array
	public void printArr(int arr[]) {
		for(int i = 0; i < 1; ++i) {	// increment the value of i by 1 and then use it in our statement.
			System.out.println(Arrays.toString(arr));	// prints unsorted arr
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total no of arrays: ");
		int totVal = scanner.nextInt();

		int unSorted[] = new int[totVal];
		// generate random array
		for(int i = 0; i < unSorted.length; i++) {
			unSorted[i] = new Random().nextInt(1000);
		}
		System.out.println("Unsorted array: " + Arrays.toString(unSorted));
		SelectionSort ss = new SelectionSort();
		ss.sort(unSorted);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("Sorted array:");
		ss.printArr(unSorted);
	}
}

