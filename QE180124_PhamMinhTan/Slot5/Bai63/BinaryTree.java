package Bai63;

import java.util.Scanner;

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public int inputElementAndFindLeaves(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            sc.nextLine();
            insert(data);
        }
        return findLeaves(root);
    }

    private int findLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        int leftLeaves = findLeaves(root.getLeft()); // 1
        int rightLeaves = findLeaves(root.getRight()); // 1
        return leftLeaves + rightLeaves;
    }

    private void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data <= root.getData()) {
            TreeNode leftChild = root.getLeft();
            TreeNode newLeftChild = insertRec(leftChild, data);
            root.setLeft(newLeftChild);
            newLeftChild.setParent(root);
        } else {
            TreeNode rightChild = root.getRight();
            TreeNode newRightChild = insertRec(rightChild, data);
            root.setRight(newRightChild);
            newRightChild.setParent(root);
        }
        return root;
    }
}
