
package b63;

import java.util.Scanner;

public class B63 {

    public static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }       
    }
    
    public static class BinaryTree {
        TreeNode root;

        public BinaryTree() {
        }
        
        public TreeNode insertIntoBST(TreeNode rootNode, int value) {
            if (rootNode == null) {
                return new TreeNode(value);
            }
            if (value < rootNode.value)
                rootNode.left = insertIntoBST(rootNode.left, value);
            else 
                rootNode.right = insertIntoBST(rootNode.right, value);
            return rootNode;
        }
        
        public int countLeaf(TreeNode root) {
            if (root == null)
                return 0;
            if (root.left == null && root.right == null)
                return 1;
            int leftLeaves = countLeaf(root.left);
            int rightLeaves = countLeaf(root.right);
            return leftLeaves + rightLeaves;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        BinaryTree bst = new BinaryTree();
        for (int num : arr) {
            bst.root = bst.insertIntoBST(bst.root, sc.nextInt());
        }
        System.out.println(bst.countLeaf(bst.root));
    }   
}
