package tree.traversal.binarytree;

import tree.traversal.node.Node;

public class BinaryTree {

	  // Root of Binary Tree
	  public Node root;

	  //constructor
	  public BinaryTree() {
		  root = null;
	  }

	  //post-order traversal
	  public void postorder(Node node) {
		  if (node == null)
			  return;

		  // Traverse left
		  postorder(node.getLeft());
		  // Traverse right
		  postorder(node.getRight());
		  // Traverse root
		  System.out.print(node.getItem() + "->");
	  }

	  //in-order traversal
	  public void inorder(Node node) {
		  if (node == null)
			  return;

		  // Traverse left
		  inorder(node.getLeft());
		  // Traverse root
		  System.out.print(node.getItem() + "->");
		  // Traverse right
		  inorder(node.getRight());
	  }

	  //pre-order travesal
	  public void preorder(Node node) {
		  if (node == null)
			  return;

		  // Traverse root
		  System.out.print(node.getItem() + "->");
		  // Traverse left
		  preorder(node.getLeft());
		  // Traverse right
		  preorder(node.getRight());
	  }
	
}
