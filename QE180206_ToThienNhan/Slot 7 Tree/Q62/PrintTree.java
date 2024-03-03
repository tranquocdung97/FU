package src;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
}


public class PrintTree{
    public static Node insert (Node t, int value) {
        if (t == null) {
            Node tempt = new Node ();
            tempt.data = value;
            tempt.left = null;
            tempt.right = null;
            return tempt;
        } else {
            if (value < t.data) {
                t.left = insert (t.left, value);
            } else {
                t.right = insert (t.right, value);
            }
        }
        return t;
    }

    public static void printTree(Node t) {
        if (t != null) {
            printTree (t.left);
            System.out.print (t.data + " ");
            printTree (t.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n, value;
        n = scanner.nextInt ();
        Node t = null;
        for (int i = 0; i < n; i++) {
            value = scanner.nextInt ();
            t = insert (t, value);
        }
        printTree (t);
    }
}