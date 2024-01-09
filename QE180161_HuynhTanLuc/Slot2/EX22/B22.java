package b22;

import java.util.Scanner;

public class B22 {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {

        Node head;

        public void addNode(int data) {
            Node newNode = new Node(data);
            Node current = head;
            if (current == null) {
                head = newNode;
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void printLinkedList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public void addToHead(int data) {
            Node newNode = new Node(data);            
            newNode.next = head;               
            head = newNode;
        }

        public void addToIndex(int data, int index) {
            if (index == 0) {
                addToHead(data);
                return;
            } else {
                Node newNode = new Node(data);
                Node current = head;
                int count = 0;
                while (current != null) {
                    count++;
                    if (index == count) {
                        newNode.next = current.next;
                        current.next = newNode;
                        return;
                    }
                    if (current.next == null) {
                        current.next = newNode;
                        return;
                    }
                    current = current.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, x;
        n = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedList.addNode(number);
        }
        k = sc.nextInt();
        x = sc.nextInt();
        linkedList.addToIndex(x, k);
        linkedList.printLinkedList();
    }

}
