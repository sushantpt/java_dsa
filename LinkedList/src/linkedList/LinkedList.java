package linkedList;

public class LinkedList {
	Node head;

	public void insert(int data) {				// method to insert data
		Node node = new Node(); 				// create new node 
		node.data = data;						// (Node = ) node's data is data from parameters
		node.next = null;						// node's next (pointer) is null

		if (head == null) {						// what if head is null? meaning, what if our list is empty?
			head = node;						// then we conisder this node as head. Meaning we pass data in insert(), it creates new node. That node is now head.
		}
		else {									// what if our list is not empty?
												// then we should traverse through our list to find pointer that is pointing null. (next is null)
			Node h = head;						// to traverse through, we need head to start from. So node h is head
			while (h.next != null) {			// so we iterate through list until we find null pointer
				h = h.next;						// iterating..
			}									// out of loop
			h.next = node;						// after finding null, h.next(traversing to find null) is set as new node.
		}
	}
	
	public void insertAt(int index, int data) {		// method to insert at certain index
		
		LinkedList ll = new LinkedList();			// if lenght of list is less than index value, warn.
		if (index > ll.getLenght()) {
			System.out.println("Index Not found! Insert at first or last.");
		}									
		
		
		Node node = new Node();						// create new node
		node.data = data;							// (Node = )node's data is data from parameters
		node.next= null;							// node's next (pointer) is null
		
		/*
		 * We can use insertAtFirst() method and pass data when index is 0. [more input = more time]
		 * if (index == 0) {
		 *	insertAtFirst(data);
		 *	}
		 *	else{
		 *	// code here
		 *	}
		 *
		 */
		
		Node h = head;								// new temp var to store head. This is done to traverse
		for (int i = -1; i < index - 1; i++) {		// [Starting from -1 because we may have to insert data at 0th index]traverse from 0th index till (index that user wants to insert data - 1)
			h = h.next;								// iterating..
		}
		node.next = h.next;							// h.next is current pointer pointing. We want node.next (new node) to point towards or simply we want new pointer points towards current pointer
		h.next = node;								// since h.next was current pointer(pointing towards), we change h.next pointing towards new node we just create to [insertAt(int index, int data);]
		
	}
	
	public int getLenght() {						// method/getter to get lenght of the list
		Node h = head;
		int count = 0;
		while (h != null) {
			count++;
			h = h.next;
		}
		return count;
	}

	public void insertAtFirst(int data) {	// method to insert at first
		Node node = new Node();				// create new node
		node.data = data;					// (Node = )node's data is data from parameters
		node.next = null;					// node's next (pointer) is null
		
		node.next = head;					// value of current head will become node.next or pointer
		
		head = node;						// new node [insertAtFirst()] will be head.
	}
	
	public void deleteAt(int index) {		// method to delete element at certain index
		if(index == 0) {					// if we want del 0th index or head, simply change head to head.next 
			head = head.next;
		}
		else {
			Node h = head;
			Node toDelete = null;			// toDelete is the node we want to delete
			for (int i = 0; i < index - 1; i++) {
				h = h.next;					// traversing..
			}
			toDelete = h.next;				// toDelete's next (pointer) = h.next
			h.next = toDelete.next;			// finaly, h.next points towards toDelete.next (we only change pointer)
			toDelete = null;				// node we want to delete is now deleted
		}
	}
	

	public void showAll() {					// method to show all element in our list
		Node h = head;						// traverse through list. Set head h from the node
		while(h.next != null) {				// iterate through list
			System.out.println(h.data);		// while iterating print data. Prints till node that has null pointer. But won't print last element.
			h = h.next;						// iterating..
		}
		System.out.println(h.data); 		// this prints last element which was not printed inside while loop
	}
}

