import java.util.Scanner;

class Node {
    int number;
    Node next;

    Node(int number) {
        this.number = number;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void addLast(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    void insertIndex(int index, int number) {
        Node newNode = new Node(number);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; current != null && i < index - 1; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.number+ " ");
            current = current.next;
        }
    }
}

public class EX_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("hay nhap vao so luong phan tu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(scanner.nextInt());
        }
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        list.insertIndex(k, x);
        list.printList();
    }
}