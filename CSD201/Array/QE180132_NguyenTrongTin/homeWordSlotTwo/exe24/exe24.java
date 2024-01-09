
import java.util.Scanner;


public class exe24 {
    public static class Node{
        int val;
        Node next;
            public Node(int val){
                this.val = val;
                this.next = null;
            }
    }
    public static void getNode(Node headNode, int c){
        int count = 0;
        Node curNode = headNode;
        while(curNode != null){
            curNode = curNode.next;
            if(count == c)
                break;
            count+=1;
        }
        if(curNode !=null){
          System.out.println(curNode.val);          
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
//        for (int i = 0; i < n; i++) {
//            int v = input.nextInt();
//            head = addToTall(head, v);
//        }
//        int c = input.nextInt();
//        getNode(head, c);
//    }

}
