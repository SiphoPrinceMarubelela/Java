import tree.traversal.binarytree.BinaryTree

;
import tree.traversal.node.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		
		tree.root                   = new Node(12);
		tree.root.left              = new Node(72);
		tree.root.right             = new Node(18);
		tree.root.left.left         = new Node(11);
		tree.root.left.right        = new Node(26);
		tree.root.right.left        = new Node(14);
		tree.root.right.right       = new Node(45);
		tree.root.left.left.left    = new Node(19);
		tree.root.left.left.right   = new Node(22);
		tree.root.left.right.left   = new Node(100);
		tree.root.left.right.right  = new Node(111);
		tree.root.right.left.left   = new Node(84);
		tree.root.right.left.right  = new Node(90);
		tree.root.right.right.left  = new Node(55);
		tree.root.right.right.right = new Node(10);
		
		System.out.println("Inorder traversal");
		tree.inorder(tree.root);

		System.out.println("\nPreorder traversal ");
		tree.preorder(tree.root);

		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);

	}

}

