package tree;

public class BinarySearchTree {
	protected class Node{
		int value;  // node's value
		Node leftChild = null;	// similar to LinkedList's next node (left side's)
		Node rightChild = null;	// similar to LinkedList's next node (right side's)
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	protected Node root = null;	// head
	
	// method to search in binary search tree
	public boolean binaryTreeSearch(Node n, int val) {	// n is root and val is value to search
		if(n == null) return false;	// if root is null, meaning no tree structure
		if(n.value == val) {	// if root is val, return true
			return true;
		}
		else if(n.value > val) {
			return binaryTreeSearch(n.leftChild, val);  // if val is smaller than root, search in left
		}
		else {
			return binaryTreeSearch(n.rightChild, val);	// if val is larger than root, search in right side
		}
	}
	
	// method to add in elements in binary search tree
	public boolean addVal(Node n, int val) {	// n is node and val is value to add
		if(n.value == val) {
			return false;	// BST is set. It doesn't allow duplicates
		}
		else if(n.value > val) {	//val is greater than n. Meaning check in left side
			if(n.leftChild == null) {	// check if left child is empty. If true, create new node there
				n.leftChild = new Node(val);
				return true;
			}
			else {		// if leftChild is not null, recursively search for empty space
				return(addVal(n.leftChild, val));
			}
		}
		else { 	//val is greater than n. Meaning check in left side
			if(n.rightChild == null) {	// check if left child is empty. If true, create new node there
				n.rightChild = new Node(val);
				return true;
			}
			else {// if leftChild is not null, recursively search for empty space
				return addVal(n.rightChild, val);
			}
		}
	}
	
	// main method
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
	}
}












