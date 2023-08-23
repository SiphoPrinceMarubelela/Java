package tree.traversal.node;

public class Node {

	//attributes
	int item;
	public Node left;
	public Node right;

	//constructor
	public Node(int key) {
		item = key;
		left = null;
		right = null;
	}
	
	//accessor methods
	public int getItem() {
		return item;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
}
