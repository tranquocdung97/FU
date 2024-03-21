package src;
import src.Node;

import java.util.Scanner;

public class Main {

    public static Node insert(Node t, int value) {
        if (t == null) {
            Node newNode = new Node ();
            newNode.data = value;
            newNode.left = null;
            newNode.right = null;

            return newNode;
        } else {
            if (value < t.data) {
                t.left = insert (t.left, value);
            } else if (value > t.data) {
                t.right = insert (t.right, value);
            }
        }
        return t;
    }

    public static void printTree(Node t) {
        if (t != null) {
            printTree (t.left);
            System.out.print (t.data);
            printTree (t.right);
        }
    }

    public static boolean isLeafNode(Node t) {
        return (t.left == null && t.right == null);
    }

    public static int countLeafNode(Node root) {
        if (root == null) return 0;
        if  (isLeafNode (root)) return 1;
        return countLeafNode (root.left) + countLeafNode (root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int value;
        int n = scanner.nextInt ();
        Node t = null;
        for (int i = 0; i < n; i++) {
            value = scanner.nextInt ();
            t = insert (t, value);
        }
//        printTree (t);
        System.out.println (countLeafNode (t));
    }
}
