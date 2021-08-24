package sortingAlgo;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FindInversion {
	
	// method to count inversion of passed array and length of array len
	public int count(int[] arr, int len) {
		int inversionCount = 0;
		for(int i = 0; i < len - 1; i++) {
			for(int j = i + 1; j < len; j++) {
				if(arr[i] > arr[j]) {
					inversionCount++;
				}
			}
		}
//		System.out.println("Total number of inversion: " + inversionCount);
		return inversionCount;
	}
	
	//main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total number of arrays: ");
		int tot = scanner.nextInt();
		int[] arr = new int[tot];
		// generate random numbers in arr[]
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(1000);
		}
		System.out.println("Arrays:" + Arrays.toString(arr));
		
		FindInversion fi = new FindInversion();
		fi.count(arr, tot);
		System.out.println("Total number of inversion: " + fi.count(arr, tot));
	}
}

