
package b28;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }   
}

class DoublyLinkedList {
    Node head;
    Node tail;
    
    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void addToIndex(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            if (head != null)
                head.prev = newNode;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;
            while (current != null && count < index-1) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newNode.next = current.next;
                if (current.next != null)
                    current.next.prev = newNode;
                current.next = newNode;
                newNode.prev = current;
            }
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

public class B28 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for(int i = 0; i < n; i++) {
            int number = sc. nextInt();
            doublyLinkedList.addToTail(number);
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        doublyLinkedList.addToIndex(k, x);
        doublyLinkedList.printList();
    }
    
}
