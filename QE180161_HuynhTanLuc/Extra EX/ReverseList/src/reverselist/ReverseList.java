/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverselist;

/**
 *
 * @author Tan Luc
 */
public class ReverseList {

    
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        
        ListNode listNodeInstance = new ListNode(0);
        
        listNodeInstance.printLinkedList(a1.reverseList(a1));
    }
    
}
