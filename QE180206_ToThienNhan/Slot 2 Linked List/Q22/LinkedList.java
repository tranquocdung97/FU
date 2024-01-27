package src;
import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public static ListNode createNode(int x) {
        return new ListNode(x);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static ListNode addElement(ListNode tail, int x) {
        ListNode newNode = createNode(x);
        tail.next = newNode;
        return newNode;
    }

    public static ListNode addHead(ListNode head, int x) {
        ListNode newNode = createNode(x);
        newNode.next = head;
        head = newNode;
        return head;
    }
    // k position
    public static ListNode addAt(ListNode head, int position, int x) {
        ListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        ListNode newNode = createNode(x);
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static ListNode addTail(ListNode head, int x) {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        ListNode newNode = createNode(x);
        newNode.next = null;
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        ListNode head = createNode(x);
        ListNode tail = head;

        for (int i = 1; i < n; i++) {
            x = scanner.nextInt();
            tail = addElement(tail, x);
        }

        int position = scanner.nextInt();
        x = scanner.nextInt();

        if (position == 0) {
            head = addHead(head, x);
        } else if (position == n) {
            head = addTail(head, x);
        } else {
            head = addAt(head, position, x);
        }

        printList(head);
        scanner.close();





    }
}
