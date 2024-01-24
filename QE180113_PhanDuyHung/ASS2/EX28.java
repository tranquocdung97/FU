import java.util.Scanner;

class Node {
    int number;
    Node next;
    Node pre;

    Node(int number) {
        this.number = number;
        this.next = null;
        this.pre = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void addLast(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.pre = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertIndex(int index, int number) {
        Node newNode = new Node(number);
        if (index == 0) {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; current != null && i < index - 1; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                newNode.pre = current;
                if (current.next != null) {
                    current.next.pre = newNode;
                }
                current.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
            }
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.number + " ");
            current = current.next;
        }
    }
}

public class EX28 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("hay nhap vao so luong phan tu: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(ip.nextInt());
        }
        int k = ip.nextInt();
        int x = ip.nextInt();
        list.insertIndex(k, x);
        list.printList();
    }
}
