import java.util.Scanner;

class Node {
    int number;
    Node next;
    Node(int data) {
        this.number= number;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void addLast(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    void printList(int k) {
        Node current = head;
        for (int i = 0; current != null && i < k; i++) {
            current = current.next;
        }
        Node start = current;
        do {
            System.out.print(current.number+ " ");
            current = current.next;
        } while (current != start && current != head);
        current = head;
        while (current != start) {
            System.out.print(current.number + " ");
            current = current.next;
        }
    }
}

public class EX30 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("hay nhap so luong phan tu ma ban muon: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(ip.nextInt());
        }
        int k = ip.nextInt();
        list.printList(k);
    }
}
