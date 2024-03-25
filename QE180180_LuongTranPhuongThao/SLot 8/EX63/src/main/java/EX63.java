import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class EX63 {
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

    public static boolean isLeafNode(Node node) {
        return (node.left == null && node.right == null);
    }

    public static int countLeafNode(Node root) {
        if (root == null) {
            return 0;
        }
        if (isLeafNode(root)) {
            return 1;
        }
        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            root = insert(root, temp);
        }
        System.out.println(countLeafNode(root));
    }
}
