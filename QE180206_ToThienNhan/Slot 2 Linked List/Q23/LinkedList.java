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

    static ListNode deleteHead(ListNode head) {
        ListNode newHead = head.next;
        head.next = null; // Đảm bảo giảm thiểu rủi ro liên quan đến việc giải phóng bộ nhớ.
        return newHead;
    }

    static ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null; // Đảm bảo giảm thiểu rủi ro liên quan đến việc giải phóng bộ nhớ.
        return head;
    }

    static ListNode deleteAt(ListNode head, int k) {
        if (k == 0) {
            return deleteHead(head);
        }

        ListNode current = head;
        for (int i = 0; i < k - 1; i++) {
            if (current == null || current.next == null) {
                return head; // Giữ nguyên danh sách nếu không tìm thấy vị trí cần xóa.
            }
            current = current.next;
        }

        if (current.next != null) {
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = null; // Đảm bảo giảm thiểu rủi ro liên quan đến việc giải phóng bộ nhớ.
        }

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

        int k = scanner.nextInt();

        if (k == 0) {
            head = deleteHead(head);
        } else if (k == n - 1) {
            head = deleteTail(head);
        } else {
            head = deleteAt(head, k);
        }

        printList(head);
        scanner.close();
    }
}
