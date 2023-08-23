package recursive.reversal.DLL.node;

public class Node {
	
	//instance variables
	int data;	//data
	public Node next;  //next node in the list
	public Node prev;  //previous node in the list
	
	//constructor
	public Node(int i) {
		this.data = i;
	}
	
	//displaying the node's data
	public void displayData() {
		System.out.println(data + " ");
	}
	
}
