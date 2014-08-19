package trees;

//Find the least common ancestor of a binary tree
public class LCAOfBinaryTree {
	public static void main(String[] args) {
		// Construct a binary tree
		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(4);

		root.left.left = new Node(6);
		root.left.right = new Node(5);

		root.right.left = new Node(9);
		root.right.right = new Node(11);

		root.right.right.left = new Node(7);
		root.right.right.right = new Node(3);

		System.out
				.println("The LCA of 3 and 5 is:"
						+ findLCA(root, root.right.right.right,
								root.left.right).value);
		System.out.println("The LCA of 3 and null is:"
				+ findLCA(root, root.right.right.right, null).value);
		System.out.println("The LCA of 11 and null is:"
				+ findLCA(root, root.right.right, null).value);
	}

	private static Node findLCA(Node root, Node a, Node b) {
		if (root == null) {
			return null;
		}
		if (root == a || root == b) {
			return root; //thats the LCA
		}
		Node left = findLCA(root.left, a, b);
		Node right = findLCA(root.right, a, b);
	 
	    if (left != null && right != null) {
	    	return root;  // nodes are on separate branches
	    }
	 
	    // either one node is on one branch
	    // or none was found
	    return left != null ? left : right;

	}
}