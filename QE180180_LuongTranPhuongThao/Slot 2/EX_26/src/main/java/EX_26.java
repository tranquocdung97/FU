import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public void deleteGreaterThanK(int k) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data <= k) {
            prev = current;
            current = current.next;
        }

        if (prev == null) {
            head = null;
            return;
        }

        prev.next = null;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class EX_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedList.append(number);
        }
        
        System.out.print("Nhap chi so k: ");
        int k = sc.nextInt();
        linkedList.deleteGreaterThanK(linkedList.head.data);
        System.out.println("List:");
        linkedList.printList();
    }
}
