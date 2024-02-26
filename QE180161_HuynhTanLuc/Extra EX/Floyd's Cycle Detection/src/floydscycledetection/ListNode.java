/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floydscycledetection;

/**
 *
 * @author Tan Luc
 */
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //Tao thanh 1 cycle
                isCycle = true;
                break;
            }
        }
        if (isCycle) {
            fast = head;
            while (slow != null && fast != null) {    
                if (slow == fast)
                    return fast;
                slow = slow.next;
                fast = fast.next;
            }
        }
        return null;
    }
}
