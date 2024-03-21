
package b65;

import java.util.Scanner;


public class B65 {
    
    public static class TreeNode{
        private int value;
        private TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
        }        
    }
    
    public static class BinaryTree {
        TreeNode root;

        public BinaryTree() {
        }
        
        public TreeNode insertIntoBST(TreeNode root, int value) {
            if (root == null)
                return new TreeNode(value);
            if (value < root.value)
                root.left = insertIntoBST(root.left, value);
            else
                root.right = insertIntoBST(root.right, value);
            return root;
        }
        
        public int depthTree(TreeNode root) {
            if (root == null)
                return 0;
            return Math.max(depthTree(root.left), depthTree(root.right)) + 1;
        }
        
        public boolean isAVL(TreeNode root) {
            if (root == null)
                return true;
            if  (Math.abs(depthTree(root.left) - depthTree(root.right)) <=1)
                return true;
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        BinaryTree bst = new BinaryTree();
        for (int i : arr) {
            bst.root = bst.insertIntoBST(bst.root, sc.nextInt());
        }
        if (bst.isAVL(bst.root))
            System.out.println("true");
        else
            System.out.println("false");
    }
    
}
