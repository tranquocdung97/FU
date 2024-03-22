import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class DouList {
    Node head;
    Node tail;

    DouList(int x) {
        head = new Node(x);
        tail = head;
    }

    DouList addTail(int x) {
        Node temp = new Node(x);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        return this;
    }

    DouList deleteHead() {
        head = head.next;
        head.prev = null;
        return this;
    }

    DouList deleteTail() {
        tail = tail.prev;
        tail.next = null;
        return this;
    }

    DouList deleteAt(int k) {
        Node p = head;
        for (int i = 0; i < k - 1; i++) {
            p = p.next;
        }
        Node temp = p.next;
        Node p2 = temp.next;
        p.next = p2;
        if (p2 != null) {
            p2.prev = p;
        }
        return this;
    }

    void printList() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        DouList l = new DouList(x);
        for (int i = 1; i < n; i++) {
            x = scanner.nextInt();
            l.addTail(x);
        }
        int k = scanner.nextInt();
        if (k == 0) {
            l.deleteHead();
        } else if (k == n - 1) {
            l.deleteTail();
        } else {
            l.deleteAt(k);
        }
        l.printList();
    }
}
