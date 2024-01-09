
package b27;

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
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}

public class B27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int i = n; i >= 1; i--) {
            doublyLinkedList.addToTail(i);
        }
        for (int i = 2; i <= n; i++) {
            doublyLinkedList.addToTail(i);
        }
        doublyLinkedList.printList();
    }
    
}
