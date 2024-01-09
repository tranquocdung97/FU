
import java.util.Scanner;

public class exe25 {
    public static class Node{
        int val;
        Node  next;
         public  Node(int val){
             this.val = val;
             this.next = null;
         }
    }
    public static Node change(Node headNode, int k  , int vv ){
        Node head = headNode;

        if(head != null){
           while(head.next !=null){
             if(head.val == vv){
                head.val=k;
                
            }
            head = head.next;
        }
        
        }
        return headNode;
    }
    public static void Print(Node headNode){
        Node curNode = headNode;
        while(curNode !=null){
            System.out.print(curNode.val+" ");
            curNode = curNode.next;
        }
    }
    public static Node addToTall(Node headNode, int val){
       Node head = new Node(val);
        if(headNode == null){
            return head;
        }else{
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = head;
        }
        return headNode;
    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        Node head = null;
//        for(int i =0; i<n; i++){
//            int v = input.nextInt();
//            head = addToTall(head, v);
//        }
//        int vv = input.nextInt();
//        int k = input.nextInt();
//        if(head !=null)
//         head =  change(head, k, vv);
//        Print(head);
//    }
//    
}
