
package linkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(534);
		ll.insert(42);
		ll.insert(134);
		ll.insert(111);
		ll.insert(123);
		ll.insertAt(0, 45);
//		ll.insertAt(15, 76);    				// NullPoint Exception. Reason: Total lenght of the list is less than index passed at insertAt() method.
		ll.insertAtFirst(34);
		ll.deleteAt(3);
		
		ll.showAll();
		System.out.println("Lenght of the list is: " + ll.getLenght());
	}
}
