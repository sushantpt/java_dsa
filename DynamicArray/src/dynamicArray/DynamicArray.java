package dynamicArray;

import java.util.Arrays;

public class DynamicArray {
	private int array [];
	private int size;  //  total size/length of array to hold values.
	private int capacity; // total capacity (index) of array.
	
	public DynamicArray() {
		this.array = new int[2];  // array length of 2.
		this.size = 0;
		this.capacity = 2;
	}
	
	// method to add element at last. OR ((length.array)-1).
	public void addElement(int value) {
		if(size ==capacity) { // increase capacity twice of actual size.
			confirmCapacity(2);  //call and pass 2 which calls confirmCapacity() method
		}
		array[size] = value;
		size++;
	}
	
	// method add an element at certain index.
	public void addElement(int index, int value) {
		if (size == capacity) { // increase capacity twice of actual size.
			confirmCapacity(2);
		}
		// put all new elements to the right from given index.
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		//add the element at the specified index
		array[index] = value;
		size++;

	}
	
	// get element at an index
	public int getElement(int index) {
		return array[index];
	}
	
	//remove element at particular index
	public void remove(int index) {
		if (index >= size || index < 0) {
			System.out.println("No element at this index!");
		}
		else {
			for (int i= index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			array[size - 1] = 0;
			size--;
		}
	}
	
	// method to increase the capacity
	public void confirmCapacity(int minCapacity) {
		int temp[] = new int [capacity * minCapacity];
		for (int i = 0; i < capacity; i++) {
			temp[i] = array[i];
		}
		this.array = temp;
		this.capacity = capacity * minCapacity;
	}
	
	//trim unused space.
	public void trimUnused() {
		System.out.println("Deleting unused array..");
		int temp[] = new int[size];
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		this.array = temp;
		this.capacity = array.length;  // new capacity which is used.
	}
	// get current size of array
	public int getSize() {
		return size;
	}
	// get current capacity of array
	public int getCapacity() {
		return capacity;
	}
	
	// method to print elements of array
	public void printElements() {
		System.out.println("Elements in array : " + Arrays.toString(array));
	}
	
}	
