import java.util.Scanner;


public class BinaryTree {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    Node insert(Node t, int x) {
        if (t == null) {
            Node temp = new Node(x);
            return temp;
        } else {
            if (x < t.data) {
                t.left = insert(t.left, x);
            } else {
                t.right = insert(t.right, x);
            }
            return t;
        }
    }

    void printTree(Node t) {
        if (t != null) {
            printTree(t.left);
            System.out.print(t.data + " ");
            printTree(t.right);
        }
    }

    void deleteNode(Node t) {
        if (t != null) {
            deleteNode(t.left);
            deleteNode(t.right);
        }
    }

    Node deleteNumber(Node t, int x) {
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BinaryTree tree = new BinaryTree();

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            tree.root = tree.insert(tree.root, temp);
        }

        int x = scanner.nextInt();
        tree.root = tree.deleteNumber(tree.root, x);

        if (tree.root == null) {
            System.out.println("NULL");
        } else {
            tree.printTree(tree.root);
        }
    }
}
