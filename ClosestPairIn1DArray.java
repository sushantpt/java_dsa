/*
 * Problem: Find closest pair of points in 1D arr.
 * Assumptions: All the points in arr are distinct and +ve.
 * Notation: Brute-Force or "Naive" algorithm
 * Time complexity: Big-theta of f(n^2)
 */
package bottle;

import java.util.Arrays;

public class ClosestPairIn1DArray {
	
	private static int[] arr = new int[] {12, 32, 12, 23, 54, 34, 6, 34, 2, 5};
	
	public void FindClosestPair(int[] arr) {
		Arrays.sort(arr);
		
		// prints arrs
		for (int i : arr){
			System.out.print(i + ",");
		}
		System.out.println(" etc!");
		
		// find closest pair
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] - arr[i] == 1) {
					System.out.println(arr[i] + " and " + arr[j] + " are the closest.");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ClosestPairIn1DArray fcp = new ClosestPairIn1DArray();
		fcp.FindClosestPair(arr);
	}

}
