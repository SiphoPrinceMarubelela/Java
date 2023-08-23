
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVLTree tree = new AVLTree();

		/* Constructing tree given in the above figure */
		tree.root = tree.insert(tree.root, 16);
		tree.root = tree.insert(tree.root, 8);
		tree.root = tree.insert(tree.root, 33);
		tree.root = tree.insert(tree.root, 6);
		tree.root = tree.insert(tree.root, 9);
		tree.root = tree.insert(tree.root, 27);
		tree.root = tree.insert(tree.root, 35);
		tree.root = tree.insert(tree.root, 1);
		tree.root = tree.insert(tree.root, 7);
		tree.root = tree.insert(tree.root, 45);
		tree.root = tree.insert(tree.root, 23);
		tree.root = tree.insert(tree.root, 23);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 29);
		tree.root = tree.insert(tree.root, 8);
		

		/* The constructed AVL Tree would be
		9
		/ \
		1 10
		/ \ \
		0 5 11
		/ / \
		-1 2 6
		*/
		System.out.println("Preorder traversal of "+
							"constructed tree is : ");
		tree.preOrder(tree.root);

		tree.root = tree.deleteNode(tree.root, 1);
		tree.root = tree.deleteNode(tree.root, 33);
		tree.root = tree.deleteNode(tree.root, 9);
		tree.root = tree.deleteNode(tree.root, 27);

		/* The AVL Tree after deletion of 10
		1
		/ \
		0 9
		/	 / \
		-1 5 11
		/ \
		2 6
		*/
		System.out.println("");
		System.out.println("Preorder traversal after "+
						"deletion nodes :");
		tree.preOrder(tree.root);
		
	}

}
