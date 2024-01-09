package b24;

import java.util.Scanner;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    Node head;

    public void addNode(int data) {
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

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public void getNode(int k) {
        Node current = head;
        int count = 0;
        while (current != null) {           
            if (count == k) {
                System.out.println(current.data);
                return;
            }
            count++;
            current = current.next;
        }
    }
}

    public class B24 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();
                linkedList.addNode(number);
            }
            int k = sc.nextInt();
            linkedList.getNode(k);
        }
    }
