import java.util.Scanner;

public class Main {

    public static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        } else {
            if (x < root.data) {
                root.left = insert(root.left, x);
            } else {
                root.right = insert(root.right, x);
            }
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            root = insert(root, temp);
        }
        System.out.println(countLeafNode(root));
    }
}


