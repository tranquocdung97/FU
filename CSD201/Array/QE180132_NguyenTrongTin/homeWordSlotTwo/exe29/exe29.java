
import java.util.Scanner;

public class exe29 {
    public static class Node{
        int val; 
        Node next;
        Node pre;
        public Node(int val){
            this.val = val;
            this.pre = null;
            this.next = null;
        }
    }
    public static Node addToTail(Node headNode, int val){
    Node newHead = new Node(val);
    if(headNode == null){
        return newHead;
    
    }else{
    Node checkHead = headNode;
    while(checkHead.next != null){
        checkHead = checkHead.next;
      }
    newHead.pre = checkHead;
    checkHead.next = newHead;
    
    }
    return headNode;
}
    public static Node removeHead(Node headNode){
        if(headNode != null){
            headNode.next.pre = null;
            headNode = headNode.next;
        }
        return headNode;
    }
    public static Node removeTail(Node headNode) {
        if (headNode == null) {
            return null;
        } else {
            Node checkNode = headNode;
            while (checkNode.next != null) {
                checkNode = checkNode.next;
            }
            if (checkNode.pre != null) {
                checkNode.pre.next = null;
            } else {
                headNode = null; // Nếu chỉ có một phần tử, đặt headNode thành null
            }
        }
        return headNode;
    }
    public static void Print(Node headNode){
        Node curNode = headNode;
        while(curNode != null){
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
    }
    public static Node removeMid(Node headNode,int vv){
        int count =0;
        if(headNode != null){

            Node checkNode = headNode;
            while(checkNode != null){
                if(vv == 0){
                    headNode = removeHead(headNode);
                        break;
                }
                
                if(count == vv){
                    if(checkNode.pre !=null){
                    checkNode.pre.next = checkNode.next;
                    }
                    if(checkNode.next != null){
                    checkNode.next.pre = checkNode.pre;
                    }
                    break;
                }
                count +=1;
                checkNode = checkNode.next;
            }
            
        }
        return headNode;
    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        Node head = null;
//        for (int i = 0; i < n; i++) {
//            int v = input.nextInt();
//            head =addToTail(head, v);
//        }
//        int vv = input.nextInt();
//        head = removeMid(head, vv);
//        Print(head);
//    }
//          
}  
