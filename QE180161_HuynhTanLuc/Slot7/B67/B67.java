/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b67;

import java.util.Scanner;


public class B67 {

    public static class TreeNode {

        private int value;
        private TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static class AVLTree {

        TreeNode root;

        public AVLTree() {
        }

        public TreeNode insertIntoBST(TreeNode root, int value) {
            if (root == null) {
                return new TreeNode(value);
            }
            if (value < root.value) {
                root.left = insertIntoBST(root.left, value);
            } else {
                root.right = insertIntoBST(root.right, value);
            }
            return root;
        }

        public TreeNode leftRotate(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode returnNode = root.right;
            TreeNode temp = returnNode.left;
            root.right = temp;
            returnNode.left = root;
            return returnNode;
        }

        public TreeNode rightRotate(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode returnNode = root.left;
            TreeNode temp = returnNode.right;
            root.left = temp;
            returnNode.right = root;
            return returnNode;
        }

        public int getHeight(TreeNode root) {
            if (root == null) {
                return -1;
            }
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return Math.max(left, right) + 1;
        }

        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }

            if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
                return false;
            }

            return isBalanced(root.left) && isBalanced(root.right);
        }

        public TreeNode updateTreeAVL(TreeNode root) {
            if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
                if (getHeight(root.left) > getHeight(root.right)) {
                    TreeNode node = root.left;
                    if (getHeight(node.left) >= getHeight(node.right)) {
                        root = rightRotate(root);
                    } else {
                        root.left = leftRotate(root.left);
                        root = rightRotate(root);
                    }
                } else {
                    TreeNode node = root.right;
                    if (getHeight(node.right) >= getHeight(node.left)) {
                        root = leftRotate(root);
                    } else {
                        root.right = rightRotate(root.right);
                        root = leftRotate(root);
                    }
                }
            }

            if (root.left != null) {
                root.left = updateTreeAVL(root.left);
            }
            if (root.right != null) {
                root.right = updateTreeAVL(root.right);
            }

            return root;
        }

        public void updateTreeAVL() {
            while (!isBalanced(root)) {
                root = updateTreeAVL(root);
            }
        }

        public int countNodes(TreeNode root, int x) {
            if (root == null)
                return 0;
            int count = 0;
            if (root.value == x)
                count++;
            count += countNodes(root.left, x);
            count += countNodes(root.right, x);
            return count;
        }
        
        private void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);

        }

        public void inOrder() {
            if (root == null) {
                System.out.println("NULL");
            } else {
                inOrder(root);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        AVLTree bst = new AVLTree();
        for (int i : arr) {
            bst.root = bst.insertIntoBST(bst.root, sc.nextInt());
        }
        bst.updateTreeAVL();
        int x = sc.nextInt();
        System.out.println(bst.countNodes(bst.root, x));
    }

}
