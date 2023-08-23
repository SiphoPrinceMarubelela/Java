/*

 - In the recursive method for reversing a doubly linked linked list method
   is called passing the first node then the method is recursively called by
   passing the next node (node.next).


 - In the recursive method for reversing doubly linked list reference is reversed in the following lines.
	current.next.next = current;
	current.prev = current.next;
*/

package recursive.reversal.DLL;

import recursive.reversal.DLL.node.Node;

public class RecursiveReversalDLL {

	//instance variables
	public Node head;
	public Node tail;
	
	//checking if a list is empty
	public boolean isEmpty() {
		return head == null;	//true if list is empty
	}
	
	//insert first method
	public void insertFirst(int data) {
		Node newNode = new Node(data);//create a new node
		if(isEmpty()) {
			tail = newNode;
		}
		else {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//method for forward traversal
	public void displayForward() {
		System.out.println("Forward display:");
		Node currentNode = head;
		
		while(currentNode != null) {
			currentNode.displayData();
			currentNode = currentNode.next;
		}
		System.out.println("");
	}
	
	//method to traverse and display all nodes
	public void displayBackward() {
		System.out.println("Backward display:");
		Node currentNode = tail;
		
		while(currentNode != null) {
			currentNode.displayData();
			currentNode = currentNode.prev;
		}
		System.out.println("");
	}
	
	//recursive method to reverse the list
	public Node reverseList(Node currentNode) {
		if(currentNode == null) {
			return currentNode;
		}
		if(currentNode.next == null) {
			currentNode.prev = null;
			return currentNode;
		}
		Node node = reverseList(currentNode.next);
		currentNode.next.next = currentNode;
		currentNode.prev = currentNode.next;
		currentNode.next = null;
		return node;
	}
	
}
