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

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.number + " ");
            current = current.next;
        }
    }
}

public class EX27 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("hay nhap vao so luong phan tu: ");
        int n = ip.nextInt();
        for (int i = n; i >= 1; i--) {
            list.addLast(i);
        }
        for (int i = 1; i <= n; i++) {
            list.addLast(i);
        }
        list.printList();
    }
}
