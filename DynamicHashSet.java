/*
 * Increase buckets size when bucket has more items.
 * 		- Runs faster [ Constant time O(1) ]
 */

package hashSet;

import java.util.LinkedList;

public class DynamicHashSet {

	private int currentSize = 0;			   // current size of hashset(Buckets) which is 0 at first
	private double loadFactor; 				  // measure/initalize how much capacity to provide inside bucket
	private LinkedList<String>[] buckets;	 // buckets arraylist

	private String[] values;				// values inside buckets' arraylist

	private int hashCode(String value) {
		return value.length();
	}

	// method to see if the value is present in list or not
	public boolean contains(String value) {
		int index = hashCode(value) % values.length;		// find the index value
		return value.equals(values[index]);			// if value is in values, returns true else false
	}

	//method to add value in bucket
	public boolean add(String value) {
		if(!contains(value)) {
			int index = hashCode(value) % buckets.length;
			LinkedList<String> bucket = buckets[index];
			bucket.addFirst(value);
			currentSize++;

			double averageLoad = currentSize / (double) buckets.length;

			if(averageLoad > loadFactor) {
				reInsertAll();
			}
			return true;
		}
		return false;
	}

	// method to reInsertAll
	public void reInsertAll() {
		LinkedList<String> oldBuckets[] = buckets;		 // create LL and name it 'oldBuckets' also assume as oldBuckets
		buckets = new LinkedList[buckets.length]; 		// now, new buckets is created (clone)

		for(int i = 0; i < buckets.length; i++)
			buckets[i] = new LinkedList<String>();		// initialize value in newly created buckets

		for (LinkedList<String> bucket : oldBuckets) {
			for(String element : bucket) {
				int index = hashCode(element) % buckets.length;
				LinkedList<String> newBucket = buckets[index];
				newBucket.addFirst(element);
			}
		}
	}
}
