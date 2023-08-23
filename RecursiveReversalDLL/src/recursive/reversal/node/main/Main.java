package recursive.reversal.node.main;

import recursive.reversal.DLL.RecursiveReversalDLL;
import recursive.reversal.DLL.node.Node;

public class Main {

	public static void main(String[] args) {
		RecursiveReversalDLL myList = new RecursiveReversalDLL();
		
		myList.insertFirst(5);
		myList.insertFirst(4);
		myList.insertFirst(3);
		myList.insertFirst(2);
		myList.insertFirst(1);
		
		//we must change the tail's reference before calling reverse method
		myList.tail = myList.head;
		Node myNode = myList.reverseList(myList.head);
		//we must change the head to point to the returned node
		myList.head = myNode;
		myList.displayForward();
		myList.displayBackward();
	}

}
