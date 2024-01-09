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
    static ListNode createNode(int x) {
        return new ListNode(x);
    }

    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    static ListNode addElement(ListNode tail, int x) {
        ListNode newNode = createNode(x);
        tail.next = newNode;
        return newNode;
    }

    static ListNode getNode(ListNode head, int k) {
        ListNode current = head;
        for (int i = 0; i < k; i++) {
            if (current == null) {
                return null; // Nếu vị trí không hợp lệ, trả về null.
            }
            current = current.next;
        }
        return current;
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

        int k = scanner.nextInt();
        ListNode targetNode = getNode(head, k);

        if (targetNode != null) {
            System.out.println(targetNode.data);
        } else {
            System.out.println("Invalid position");
        }

        scanner.close();
    }
}
