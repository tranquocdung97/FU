package Bai64;

import java.util.Scanner;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void inputNode(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            sc.nextLine();
            insert(data);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    private void insert (int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root,int data) {
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

    public int findTreeLevel(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = findTreeLevel(root.getLeft());
            int rightHeight = findTreeLevel(root.getRight());
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}