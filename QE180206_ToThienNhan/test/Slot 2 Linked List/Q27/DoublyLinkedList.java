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
    public static DouList createList(int x) {
        return new DouList(x);
    }

    public static DouList addHead(DouList list, int x) {
        Node temp = new Node(x);
        temp.pre = null;
        temp.next = list.head;
        list.head.pre = temp;
        list.head = temp;
        return list;
    }

    public static DouList addTail(DouList list, int x) {
        Node temp = new Node(x);
        temp.next = null;
        temp.pre = list.tail;
        list.tail.next = temp;
        list.tail = temp;
        return list;
    }

    public static void printList(DouList list) {
        Node p = list.head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DouList list = createList(1);

        for (int i = 2; i <= n; i++) {
            list = addHead(list, i);
            list = addTail(list, i);
        }

        printList(list);
        scanner.close();
    }
}
