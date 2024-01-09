
package b23;

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
        if (head == null)
            head = newNode;
        else {
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
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public void removeAtIndex(int index) {
        if (head == null || index < 0)
            return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current.next != null && count < index -1) {
            count++;
            current = current.next;
        }
        if (current == null || current.next == null)
            return;
        current.next = current.next.next;
    }
}

public class B23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedList.addNode(number);
        }
        int k = sc.nextInt();
        linkedList.removeAtIndex(k);
        linkedList.printLinkedList();
    }   
}
