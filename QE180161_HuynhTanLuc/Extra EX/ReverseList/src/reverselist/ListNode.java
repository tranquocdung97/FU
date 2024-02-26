/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverselist;

/**
 *
 * @author Tan Luc
 */
public class ListNode {

    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode reverseList(ListNode head){
        ListNode curNode = head;
        while (curNode != null && curNode.next != null) {
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
    
    public void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
