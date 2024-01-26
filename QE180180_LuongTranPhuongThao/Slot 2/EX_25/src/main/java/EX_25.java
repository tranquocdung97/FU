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
    public void replaceValue(int a, int b) {
        Node current = head;
        while (current != null) {
            if (current.data == a) {
                current.data = b;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class EX_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedList.append(number);
        }
        System.out.print("Nhap gia tri a: ");
        int a = sc.nextInt();
        System.out.print("Nhap gia tri b: ");
        int b = sc.nextInt();
        linkedList.replaceValue(a, b);
        System.out.println("List:");
        linkedList.printList();
    }
}
