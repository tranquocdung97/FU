
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe28 {
    public static class Node{
        int val;
        Node next;
        Node Pre;
        public Node(int val){
            this.val= val;
            this.Pre = null;
            this.next = null;
                    
        }
    }
    public static Node addToTall(Node headNode, int Val){
        Node head = new Node(Val);
        if(headNode ==null){
            return head;
        }else{
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                
            }
            lastNode.next = head;
            head.Pre = lastNode;
            head.next = null;
        }
        return headNode;
    }
    public static void print(Node headNode){
        Node curNode = headNode;
        while(curNode != null){
            System.out.print(curNode.val+" ");
            curNode = curNode.next;
        }
    }
        public static Node addToHead(Node headNode,int val){
        Node head = new Node(val);
        if(headNode != null){
            head.next = headNode;
            head.Pre = null;
            headNode.Pre = head;
        }
        return head;
    }
    public static Node addToMid(Node headNode, int val, int index){
        int count =0;
        Node head = new Node(val);
        Node CrNode = headNode;
        if(index == 0){
           return addToHead(headNode, val);
        }else{
            while(CrNode != null){
                count += 1;
                if(count == index){
                    head.next = CrNode.next;
                    head.Pre = CrNode;
                    CrNode.next = head;
                    break;
                }
                CrNode = CrNode.next;
            }
        }
        return headNode;
     }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        Node head =null;
//        for (int i = 0; i < n; i++) {
//            int v = input.nextInt();
//            head = addToTall(head, v);
//        }
//        int vv = input.nextInt();
//        int k = input.nextInt();
//        head = addToMid(head, k, vv);
//        print(head);
//    }
}
