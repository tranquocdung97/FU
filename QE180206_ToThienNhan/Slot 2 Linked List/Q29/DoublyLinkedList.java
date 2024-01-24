package src;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node pre;

    Node(int x) {
        data = x;
        next = null;
        pre = null;
    }
}

class DouList {
    Node head;
    Node tail;

    DouList(int x) {
        head = new Node(x);
        head.pre = null;
        head.next = null;
        tail = head;
    }
}

public class DoublyLinkedList {

    static DouList createList(int x) {
        return new DouList(x);
    }

    static DouList addTail(DouList list, int x) {
        Node temp = new Node(x);
        temp.next = null;
        temp.pre = list.tail;
        list.tail.next = temp;
        list.tail = temp;
        return list;
    }

    static DouList deleteHead(DouList list) {
        Node p = list.head.next;
        Node temp = list.head;
        p.pre = null;
        list.head = p;
        temp = null;
        return list;
    }

    static DouList deleteTail(DouList list) {
        Node p = list.tail.pre;
        Node temp = list.tail;
        p.next = null;
        list.tail = p;
        temp = null;
        return list;
    }

    static DouList deleteAt(DouList list, int k) {
        Node p = list.head;
        for (int i = 0; i < k - 1; i++) {
            p = p.next;
        }
        Node temp = p.next;
        Node p2 = temp.next;
        p.next = p2;
        p2.pre = p;
        temp = null;
        return list;
    }

    static void printList(DouList list) {
        Node p = list.head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        DouList list = createList(x);

        for (int i = 1; i < n; i++) {
            x = scanner.nextInt();
            list = addTail(list, x);
        }

        int k = scanner.nextInt();

        if (k == 0) {
            list = deleteHead(list);
        } else if (k == n - 1) {
            list = deleteTail(list);
        } else {
            list = deleteAt(list, k);
        }

        printList(list);
        scanner.close();
    }
}
