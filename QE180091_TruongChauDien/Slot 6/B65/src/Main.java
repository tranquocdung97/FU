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

    public static int treeLevel(Node root) {
        if (root==null) return -1;
        return 1+Math.max(treeLevel(root.left), treeLevel(root.right));
    }

    public static boolean checkAvl(Node root){
        if (root == null) return true;
        if (Math.abs(treeLevel(root.left)-treeLevel(root.right))>1) return false;
        return checkAvl(root.left) && checkAvl(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            root = insert(root, temp);
        }
        System.out.println(checkAvl(root));
    }
}


