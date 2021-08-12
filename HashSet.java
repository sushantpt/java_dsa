package hashSet;

import java.util.LinkedList;

public class HashSet { 		// using seperate chaining

	private LinkedList<String>[] buckets; 	// array LL of hash set

	@SuppressWarnings("all")	// lose unneccessay warnings

	public HashSet(int size) {		// size of bucket's'
		buckets = new LinkedList[size];
		for (int i = 0; i < size; i++) {		// iterate through bucket
			buckets[i] = new LinkedList<String>();	// create LL in all bucket
		}
	}

	public int hashCode(String value) {		// generate hashCode
		return value.length();
	}

	// method to check if an element is present in hashSet (contains)
	public boolean contains(String value) {
		int index = hashCode(value) % buckets.length; 	 // generate index num
		LinkedList<String> bucket = buckets[index];		// bucket is value in buckets
		return bucket.contains(value);		// return true if bucket has value or bucket in buckets == value
	}

	// method to add an element in hashSet
	public boolean add(String value) {		 // sets doesn't allow to have multiple same instances. So the value must be unique.
		if(!contains(value)) {				// check if value is there or not. If there is not, then it will add at there (adds at first)
			int index = hashCode(value) % buckets.length;
			LinkedList<String> bucket = buckets[index];
			bucket.addFirst(value);
			return true;
		}
		return false;
	}
}

/*
 * Simple way implementation of HashSets
 * 
public class HashSet {

	private String[] values;				// array of values (in hash set)

	public HashSet(int size) {
		values = new String[size];
	}

	private int hashCode (String value) {	// hash code of the value to store in hash set
		return value.length();
	}

	// method to add an element in hash set
	public boolean add(String value) {
		int index = hashCode(value) % values.length;	// to create hashCode
		if(values[index] == null) {			    		// if values (hash set array) array is null or not taken by any other string,
			values[index] = value;		    		 	// then in values[index] add new value
			return true;
		}
		return false;							// if in values that particular array is present, return false
	}

	// method to check if the element is present (contains method)
	public boolean contains(String value) {
		int index = hashCode(value) % values.length;
		return value.equals(values[index]); 		// value.equals is what we input and values[index] is the value in array or hashSet
	}
}
 */

