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

    int getIndex(int index) {
        Node current = head;
        for (int i=0;current != null && i<index;i++) {
            current = current.next;
        }
        if (current != null) {
            return current.number;
        }
        return -1;
    }
}

public class EX24 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("hay nhap vao so luong phan tu: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(ip.nextInt());
        }
        int k = ip.nextInt();
        System.out.println(list.getIndex(k));
    }
}
