import java.util.Scanner;

public class test {
	public static class Node {

		public int value;
		public Node left, right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}

	}

	public static class BinaryTree {
		public Node root;

		public BinaryTree() {
			this.root = null;
		}

		public BinaryTree(Node roof) {
			this.root = roof;
		}

		private Node add(int value, Node node) {
			if (node == null) {
				node = new Node(value);
			} else {
				if (node.value > value)
					node.left = add(value, node.left);
				else
					node.right = add(value, node.right);
			}
			return node;
		}

		public void add(int value) {
			this.root = add(value, root);
		}

		private void inOrder(Node root) {
			if (root == null)
				return;
			inOrder(root.left);
			System.out.print(root.value + " ");
			inOrder(root.right);

		}

		public void inOrder() {
			inOrder(root);
		}

		private int countLeaf(Node root) {
			if (root == null)
				return 0;
			if (root.left == null && root.right == null)
				return 1;
			return countLeaf(root.left) + countLeaf(root.right);
		}

		public int countLeaf() {
			return countLeaf(root);
		}

		private int height(Node root) {
			if (root == null)
				return 0;
			int left = height(root.left);
			int right = height(root.right);
			return Math.max(left, right) + 1;
		}

		public int height() {
			return height(root) - 1;
		}

		public int depth(Node iRoot) {
			if (iRoot == null)
				return 0;
			int depthLeft = depth(iRoot.left);
			int depthRight = depth(iRoot.right);
			if (Math.abs(depthLeft - depthRight) > 1)
				return -10;
			else
				return Math.max(depthLeft, depthRight) + 1;
		}

		private boolean isBalanced(Node root) {
			if (root == null)
				return true;
			if (depth(root.left) < 0 || depth(root.right) < 0 || Math.abs(depth(root.left) - depth(root.right)) > 1)
				return false;
			else
				return true;
		}

		public boolean isBalanced() {
			return isBalanced(root);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BinaryTree tree = new BinaryTree();
		for (int i = 0; i < n; i++)
			tree.add(scanner.nextInt());
		System.out.println(tree.isBalanced());
		scanner.close();
	}
}
