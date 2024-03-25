import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class EX66 {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static int treeLevel(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(treeLevel(root.left), treeLevel(root.right));
    }

    public static boolean checkAvl(Node root) {
        if (root == null)  return true;
        if (Math.abs(treeLevel(root.left) - treeLevel(root.right)) > 1) return false;
        return checkAvl(root.left) && checkAvl(root.right);
    }

    public static Node turnRight(Node a) {
        Node b = a.left;
        Node d = b.right;
        a.left = d;
        b.right = a;
        return b;
    }

    public static Node turnLeft(Node a) {
        Node b = a.right;
        Node c = b.left;
        a.right = c;
        b.left = a;
        return b;
    }

    public static Node updateTreeAvl(Node t) {
        if (Math.abs(treeLevel(t.left) - treeLevel(t.right)) > 1) {
            if (treeLevel(t.left) > treeLevel(t.right)) {
                Node p = t.left;
                if (treeLevel(p.left) >= treeLevel(p.right)) {
                    t = turnRight(t);
                } else {
                    t.left = turnLeft(t.left);
                    t = turnRight(t);
                }
            } else {
                Node p = t.right;
                if (treeLevel(p.right) >= treeLevel(p.left)) {
                    t = turnLeft(t);
                } else {
                    t.right = turnRight(t.right);
                    t = turnLeft(t);
                }
            }
        }
        if (t.left != null) t.left = updateTreeAvl(t.left);
        if (t.right != null) t.right = updateTreeAvl(t.right);
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            root = insert(root, temp);
        }
        while (!checkAvl(root)) {
            root = updateTreeAvl(root);
        }
        System.out.println(treeLevel(root));
    }
}
