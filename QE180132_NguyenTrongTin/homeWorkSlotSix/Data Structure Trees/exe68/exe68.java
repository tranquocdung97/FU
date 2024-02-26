import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
}

public class exe68 {
    public static Node insert(Node t, int x) {
        if (t == null) {
            Node temp = new Node();
            temp.data = x;
            temp.left = null;
            temp.right = null;
            return temp;
        } else {
            if (x < t.data) {
                t.left = insert(t.left, x);
            } else {
                t.right = insert(t.right, x);
            }
        }
        return t;
    }

    public static void printTree(Node t) {
        if (t != null) {
            printTree(t.left);
            System.out.print(t.data + " ");
            printTree(t.right);
        }
    }

    public static void deleteNode(Node t) {
        if (t != null) {
            if (t.left != null) deleteNode(t.left);
            if (t.right != null) deleteNode(t.right);
            t = null;
        }
    }

    public static Node deleteNumber(Node t, int x) {
        if (t != null) {
            if (t.data == x) {
                deleteNode(t.left);
                deleteNode(t.right);
                t = null;
            } else if (t.data > x) {
                t.left = deleteNumber(t.left, x);
            } else {
                t.right = deleteNumber(t.right, x);
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x, temp;
        n = input.nextInt();
        Node t = null;
        for (int i = 0; i < n; i++) {
            temp = input.nextInt();
            t = insert(t, temp);
        }
        x = input.nextInt();
        t = deleteNumber(t, x);
        if (t == null) {
            System.out.println("NULL");
        } else {
            printTree(t);
        }
    }
}