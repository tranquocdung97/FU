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


    public static void printTree(Node t){
        if (t!=null){
            printTree(t.left);
            System.out.print(t.data+" ");
            printTree(t.right);

        }
    }

    public static void deleteNode(Node t){
        if (t!=null){
            if (t.left!=null) deleteNode(t.left);
            if (t.right!=null) deleteNode(t.right);
            t = null;
        }
    }

    public static Node deleteNumber(Node t, int x){
        if (t!=null){
            if (t.data==x){
                deleteNode(t.left);
                deleteNode(t.right);
                t = null;
            } else if (t.data>x) {
                t.left = deleteNumber(t.left, x);
            }
            else {
                t.right = deleteNumber(t.right, x);
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            root = insert(root, temp);
        }
        int x = sc.nextInt();
        root = deleteNumber(root, x);
        if (root==null) System.out.println("NULL");
        else {
            printTree(root);
        }
    }
}


