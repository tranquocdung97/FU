/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b64;

import java.util.Scanner;


public class B64 {
    public static class TreeNode {
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
                root.right  =insertIntoBST(root.right, value);
            return root;
        }
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
        System.out.println(bst.maxDepth(bst.root) - 1);
    }   
}
