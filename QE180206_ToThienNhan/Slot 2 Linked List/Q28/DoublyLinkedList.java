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

    static DouList addHead(DouList list, int x) {
        Node temp = new Node(x);
        temp.pre = null;
        temp.next = list.head;
        list.head.pre = temp;
        list.head = temp;
        return list;
    }

    static DouList addTail(DouList list, int x) {
        Node temp = new Node(x);
        temp.next = null;
        temp.pre = list.tail;
        list.tail.next = temp;
        list.tail = temp;
        return list;
    }

    static DouList addAt(DouList list, int k, int x) {
        Node p = list.head;
        for (int i = 0; i < k - 1; i++) {
            p = p.next;
        }
        Node temp = new Node(x);
        temp.pre = p;
        temp.next = p.next;
        p.next.pre = temp;
        p.next = temp;
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
        x = scanner.nextInt();

        if (k == 0) {
            list = addHead(list, x);
        } else if (k == n) {
            list = addTail(list, x);
        } else {
            list = addAt(list, k, x);
        }

        printList(list);
        scanner.close();
    }
}
