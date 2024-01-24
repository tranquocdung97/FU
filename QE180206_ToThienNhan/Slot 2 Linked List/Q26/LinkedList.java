import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int value) {
        data = value;
        next = null;
    }
}

public class LinkedList {
    static ListNode createNode(int value) {
        return new ListNode(value);
    }

    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    static ListNode addTail(ListNode head, int value) {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = null;
        current.next = newNode;
        return head;
    }

    static ListNode deleteBigger(ListNode head, int threshold) {
        ListNode current = head;
        ListNode resultHead = new ListNode(0);
        ListNode resultTail = resultHead;

        while (current != null) {
            if (current.data <= threshold) {
                resultTail.next = createNode(current.data);
                resultTail = resultTail.next;
            }
            current = current.next;
        }

        return resultHead.next;
    }

    static ListNode getNode(ListNode head, int index) {
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    static ListNode addElement(ListNode tail, int value) {
        ListNode newNode = createNode(value);
        tail.next = newNode;
        return newNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialValue = scanner.nextInt();
        ListNode head = createNode(initialValue);
        ListNode tail = head;

        for (int i = 1; i < n; i++) {
            int value = scanner.nextInt();
            tail = addElement(tail, value);
        }

        int threshold = scanner.nextInt();
        head = deleteBigger(head, getNode(head, threshold).data);
        printList(head);
        scanner.close();
    }
}
