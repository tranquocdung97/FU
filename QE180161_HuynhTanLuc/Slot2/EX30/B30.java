
package b30;

import java.util.Scanner;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }    
}

class CircularLinkedList {
    Node head;
    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head)
                current = current.next;
            current.next = newNode;
            newNode.next = head;
        }  
    }
    
    public void printList(int k) {
        if (head == null) {
            System.out.println("List empty!!!");
            return;
        }
        Node current = head;
        for (int i = 0; i < k; i++)
            current = current.next;
        Node startNode = current;
        do {
            System.out.println(current.data + " ");
            current = current.next;
        } while (current != startNode);
    }
}
public class B30 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            circularLinkedList.addNode(number);
        }
        int k = sc.nextInt();
        circularLinkedList.printList(k);
    }
    
}
