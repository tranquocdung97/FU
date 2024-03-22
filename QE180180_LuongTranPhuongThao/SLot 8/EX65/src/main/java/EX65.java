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

public class EX65 {
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
        if (root == null) return true;
        if (Math.abs(treeLevel(root.left) - treeLevel(root.right)) > 1) return false;
        return checkAvl(root.left) && checkAvl(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            root = insert(root, temp);
        }
        System.out.println(checkAvl(root));
    }
}
