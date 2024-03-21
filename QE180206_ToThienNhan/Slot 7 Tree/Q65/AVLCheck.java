import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class AVLCheck {
    public static Node insert(Node t, int x) {
        if (t == null) {
            Node temp = new Node(x);
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

    public static int treeLevel(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(treeLevel(root.left), treeLevel(root.right));
    }

    public static boolean checkAVL(Node root) {
        if (root == null) {
            return true;
        }

        int leftHeight = treeLevel(root.left);
        int rightHeight = treeLevel(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return checkAVL(root.left) && checkAVL(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node t = null;

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            t = insert(t, temp);
        }

        System.out.println(checkAVL(t) ? "true" : "false");
    }
}
