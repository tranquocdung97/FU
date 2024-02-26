import java.util.Scanner;
 
 class node{
     int data;
     node left;
     node right;
 }
 public class exe62{
    public static node insert(node t, int x){
        if(t == null){
            node temp = new node();
            temp.left=null;
            temp.right=null;
            temp.data=x;
            return temp;
        }else{
            if(x < t.data){
                t.left=insert(t.left, x);
            }else{
                t.right=insert(t.right, x);
            }
        }
        return t;
    }
    public static void printTree(node t){
        if(t!= null){
            printTree(t.left);
            System.out.print(t.data+" ");
            printTree(t.right);
        }
    }
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n,x;
         n = input.nextInt();
         node t= null;
         for (int i = 0; i < n; i++) {
             x = input.nextInt();
            t = insert(t, x);
         }
         printTree(t);
     }
}