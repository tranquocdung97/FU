import java.util.Scanner;

public class Main {

        public static Node insert(Node t, int x){
            if (t==null){
                return new Node(x);
            } else {
                if (x<t.data){
                    t.left = insert(t.left, x);
                } else {
                    t.right = insert(t.right, x);
                }
            }
            return t;
        }

        public static void printTree(Node t){
            if (t!=null){
                printTree(t.left);
                System.out.print(t.data+" ");
                printTree(t.right);
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node t = null;
        for (int i =0; i <n; i++){
            int x = sc.nextInt();
            t = insert(t, x);
        }
        printTree(t);
    }
}
