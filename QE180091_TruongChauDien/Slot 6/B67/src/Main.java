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

    public static Node turnRight(Node a){
        Node b = a.left;
        Node d = b.right;
        a.left = d;
        b.right = a;
        return b;
    }

    public static Node turnLeft(Node a){
        Node b = a.right;
        Node c = b.left;
        a.right = c;
        b.left = a;
        return b;
    }

    public static void printTree(Node t){
        if (t!=null){
            printTree(t.left);
            System.out.println(t.data+" ");
            if (t.left!=null) System.out.println(t.left.data+" ");
            if (t.right!=null) System.out.println(t.right.data+" ");
            printTree(t.right);
        }
    }

    public static Node update(Node t){
        if (Math.abs(treeLevel(t.left)-treeLevel(t.right))>1){
            if (treeLevel(t.left)>treeLevel(t.right)){
                Node p = t.left;
                if (treeLevel(p.left)>=treeLevel(p.right)){
                    t = turnRight(t);
                } else {
                    t.left = turnLeft(t.left);
                    t = turnRight(t);
                }
            } else {
                Node p = t.right;
                if (treeLevel(p.right)>=treeLevel(p.left)){
                    t = turnLeft(t);
                } else {
                    t.right = turnRight(t.right);
                    t = turnLeft(t);
                }
            }
        }
        if (t.left!=null) t.left = update(t.left);
        if (t.right!=null) t.right = update(t.right);
        return t;
    }

    public static int count(Node t, int x){
        if (t==null) return 0;
        if (t.data==x) return 1+count(t.left, x)+count(t.right, x);
        else if (t.data<x) {
            return count(t.right, x);
        }
        return count(t.left, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            root = insert(root, temp);
        }
        while (!checkAvl(root)){
            root = update(root);
        }
        int x = sc.nextInt();
        System.out.println(count(root, x));
    }
}


