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

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            int currentIndex = 0;
            Node current = head;
            Node previous = null;

            while (current != null && currentIndex != index) {
                previous = current;
                current = current.next;
                currentIndex++;
            }

            if (current != null) {
                previous.next = current.next;
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class EX_23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        System.out.println("Nhap vao cac so nguyen cua day so:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            linkedList.insert(num);
        }
        System.out.print("Nhap vao so nguyen  k: ");
        int k = sc.nextInt();
        linkedList.deleteAtIndex(k);
        System.out.println("Danh sach sau khi xoa:");
        linkedList.printList();
    }
}