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

    void replace(int a, int b) {
        Node current = head;
        while (current != null) {
            if (current.number == a) {
                current.number = b;
            }
            current = current.next;
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

public class EX25 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("hay nhap vao so luong phan tu: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(ip.nextInt());
        }
        int a = ip.nextInt();
        int b = ip.nextInt();
        list.replace(a, b);
        list.printList();
    }
}
